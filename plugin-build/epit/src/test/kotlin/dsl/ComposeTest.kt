package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ComposeTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `compose block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customImplementation(dependency: Dependency) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: Dependency) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose("2023.10.01") {
                        implementation(AndroidX.Compose.Runtime.Runtime.runtime)

                        customImplementation(platform(bom))
                        customImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency)

                        customVersionImplementation(platform(bom("2023.09.00")))
                        customVersionImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Bom.compose_bom.moduleName,
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "compose block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "compose.dependency block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "compose.dependency(version: string) block does not add dependencies as expected"
        )
    }
}
