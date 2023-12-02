package dsl.google

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.google.Google
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AccompanistTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        implementation(Google.Accompanist.accompanist_permissions)
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
    fun `verify that google accompanist block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                google {
                    accompanist("1.0.0") {
                        implementation(Google.Accompanist.accompanist_permissions)
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
    fun `verify that google accompanist block dependency adds the correct dependency on custom configuration`() {
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
                        customImplementation(Google.Accompanist.accompanist_permissions.dependency)
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
    fun `verify that google accompanist block dependency adds dependencies in correct version`() {
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
                        customImplementation(Google.Accompanist.accompanist_permissions.dependency)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Accompanist.accompanist_permissions.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "google accompanist val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that google accompanist block fun dependency adds the correct dependency on custom configuration`() {
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
                        customImplementation(Google.Accompanist.accompanist_permissions.dependency("1.1.2"))
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
    fun `verify that google accompanist block fun dependency adds dependencies in correct version`() {
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
                        customVersionImplementation(Google.Accompanist.accompanist_permissions.dependency("1.1.2"))
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
            "google accompanist val dependency does not add dependencies in the correct version"
        )
    }
}
