package dsl.androidx

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXConstraintLayoutTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout)
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose)
                        }
                        constraintlayoutCore("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core)
                        }
                        constraintlayoutSolver("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx activity implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout)
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose)
                        }
                        constraintlayoutCore("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core)
                        }
                        constraintlayoutSolver("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx activity implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block dependency adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency)
                        }
                        constraintlayoutCompose("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency)
                        }
                        constraintlayoutCore("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependency)
                        }
                        constraintlayoutSolver("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependency)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx activity val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block dependency adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency)
                        }
                        constraintlayoutCompose("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency)
                        }
                        constraintlayoutCore("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependency)
                        }
                        constraintlayoutSolver("1.0.0") {
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependency)
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "androidx activity val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block fun dependency adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            customImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            customImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutCore("1.0.0") {
                            customImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutSolver("1.0.0") {
                            customImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx activity val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block fun dependency adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutCore("1.0.0") {
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                        constraintlayoutSolver("1.0.0") {
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx activity val dependency does not add dependencies in the correct version"
        )
    }
}
