package dsl.google

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Google
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AccompanistTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block val adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        implementation(Epit.accompanist_permissions)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Accompanist.accompanist_permissions.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "google accompanist implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block val adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        implementation(Epit.accompanist_permissions)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Accompanist.accompanist_permissions.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "google accompanist implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block fun() adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        customImplementation(Epit.accompanist_permissions("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Accompanist.accompanist_permissions.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "google accompanist val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block fun() adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        customVersionImplementation(Epit.accompanist_permissions("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Accompanist.accompanist_permissions.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "google accompanist fun() dependency does not add dependencies in the correct version"
        )
    }
}
