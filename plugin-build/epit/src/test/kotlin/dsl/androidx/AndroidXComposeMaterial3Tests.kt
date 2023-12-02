package dsl.androidx

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXComposeMaterial3Tests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material3 {
                            material3("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3.material3)
                            }
                            material3Adaptive("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material3 implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        material3 {
                            material3("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3.material3)
                            }
                            material3Adaptive("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx compose material3 implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block dependency adds the correct dependency on custom configuration`() {
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
                        material3 {
                            material3("1.0.0") {
                                customImplementation(AndroidX.Compose.Material3.Material3.material3.dependency)
                            }
                            material3Adaptive("1.0.0") {
                                customImplementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependency)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material3 val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block dependency adds dependencies in correct version`() {
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
                        material3 {
                            material3("1.0.0") {
                                customImplementation(AndroidX.Compose.Material3.Material3.material3.dependency)
                            }
                            material3Adaptive("1.0.0") {
                                customImplementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependency)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "androidx compose material3 val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block fun dependency adds the correct dependency on custom configuration`() {
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
                        material3 {
                            material3("1.0.0") {
                                customImplementation(AndroidX.Compose.Material3.Material3.material3.dependency("1.1.2"))
                            }
                            material3Adaptive("1.0.0") {
                                customImplementation(
                                    AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependency(
                                        "1.1.2"
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose material3 val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose material3 block fun dependency adds dependencies in correct version`() {
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
                        material3 {
                            material3("1.0.0") {
                                customVersionImplementation(AndroidX.Compose.Material3.Material3.material3.dependency("1.1.2"))
                            }
                            material3Adaptive("1.0.0") {
                                customVersionImplementation(
                                    AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependency(
                                        "1.1.2"
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx compose material3 val dependency does not add dependencies in the correct version"
        )
    }

}
