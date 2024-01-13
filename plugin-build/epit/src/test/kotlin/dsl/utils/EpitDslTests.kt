package dsl.utils

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

fun testEpitDsl(
    blockName: String,
    expectedModuleNames: List<String>,
    block: DependencyHandler.(
        implementation: (String) -> Unit,
        customVersionImplementation: (String) -> Unit
    ) -> Unit
) {
    val project = ProjectBuilder.builder().build()
    project.pluginManager.apply("io.github.bkmbigo.epit")

    val config = project.configurations.create("implementation")
    val customVersionConfig = project.configurations.create("customVersionImplementation")

    fun DependencyHandlerScope.implementation(dependency: String) {
        add("implementation", dependency)
    }

    fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
        add("customVersionImplementation", dependency)
    }

    project.dependencies {
        block(
            { implementation(it) },
            { customVersionImplementation(it) }
        )
    }

    assertContentEquals(
        expectedModuleNames,
        config.dependencies.map { "${it.group}:${it.name}" },
        "val $blockName does not add dependencies"
    )


    assertTrue(
        customVersionConfig.dependencies.map { it.version }.all { it == "1.1.2" },
        "val $blockName does not add dependencies in the version specified in the block"
    )

    assertContentEquals(
        expectedModuleNames,
        customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
        "fun $blockName does not add dependencies"
    )

    assertTrue(
        customVersionConfig.dependencies.map { it.version }.all { it == "1.1.2" },
        "fun $blockName implementation does not add dependencies in the specified version"
    )
}
