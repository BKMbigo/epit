package dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXComposeMaterialTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            implementation(Epit.material)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            implementation(Epit.material)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx compose material implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block dependencyAsString adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            customImplementation(Epit.material)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block dependencyAsString adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            customImplementation(Epit.material)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "androidx compose material val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block fun dependencyAsString() adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            customImplementation(Epit.material("1.1.2"))
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material block fun dependencyAsString() adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material("1.0.0") {
                            customVersionImplementation(Epit.material("1.1.2"))
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material.material.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx compose material val dependency does not add dependencies in the correct version"
        )
    }
}
