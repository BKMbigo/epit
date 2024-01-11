package dsl.voyager

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Voyager
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

@OptIn(ExperimentalEpitApi::class)
class VoyagerTests {

    @Test
    fun `verify that voyager block implementation adds dependencies`() {
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
            epitPreview {
                voyager("1.0.0") {
                    implementation(Epit.voyager_navigator)
                    customVersionImplementation(Epit.voyager_navigator("1.1.2"))
                }
            }
        }

        val expectedDependencies = listOf(
            Voyager.voyager_navigator.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "voyager implementation does not add dependencies"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "voyager implementation does not add dependencies"
        )

        assertTrue(
            customVersionConfig.dependencies.map { it.version }.all { it == "1.1.2" },
            "voyager implementation does not add dependencies"
        )
    }
}
