package dsl.androidx

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXComposeRuntimeTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        runtime {
                            runtime("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.Runtime.runtime)
                            }
                            runtimeTracing("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose runtime implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    compose {
                        runtime {
                            runtime("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.Runtime.runtime)
                            }
                            runtimeTracing("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx compose runtime implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block dependency adds the correct dependency on custom configuration`() {
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
                        runtime {
                            runtime("1.0.0") {
                                customImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency)
                            }
                            runtimeTracing("1.0.0") {
                                customImplementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependency)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose runtime val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block dependency adds dependencies in correct version`() {
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
                        runtime {
                            runtime("1.0.0") {
                                customImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency)
                            }
                            runtimeTracing("1.0.0") {
                                customImplementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependency)
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "androidx compose runtime val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block fun dependency adds the correct dependency on custom configuration`() {
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
                        runtime {
                            runtime("1.0.0") {
                                customImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency("1.1.2"))
                            }
                            runtimeTracing("1.0.0") {
                                customImplementation(
                                    AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependency("1.1.2")
                                )
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx compose runtime val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx compose runtime block fun dependency adds dependencies in correct version`() {
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
                        runtime {
                            runtime("1.0.0") {
                                customVersionImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependency("1.1.2"))
                            }
                            runtimeTracing("1.0.0") {
                                customVersionImplementation(
                                    AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependency("1.1.2")
                                )
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx compose runtime val dependency does not add dependencies in the correct version"
        )
    }
}
