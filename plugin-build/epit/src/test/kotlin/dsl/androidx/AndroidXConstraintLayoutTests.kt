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

class AndroidXConstraintLayoutTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx activity block val adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(Epit.constraintlayout)
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(Epit.constraintlayout_compose)
                        }
                        constraintlayoutCore("1.0.0") {
                            implementation(Epit.constraintlayout_core)
                        }
                        constraintlayoutSolver("1.0.0") {
                            implementation(Epit.constraintlayout_solver)
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
    fun `verify that androidx activity block val adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(Epit.constraintlayout)
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(Epit.constraintlayout_compose)
                        }
                        constraintlayoutCore("1.0.0") {
                            implementation(Epit.constraintlayout_core)
                        }
                        constraintlayoutSolver("1.0.0") {
                            implementation(Epit.constraintlayout_solver)
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
    fun `verify that androidx activity block fun() adds the correct dependency on custom configuration`() {
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
                                Epit.constraintlayout("1.1.2")
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            customImplementation(
                                Epit.constraintlayout_compose("1.1.2")
                            )
                        }
                        constraintlayoutCore("1.0.0") {
                            customImplementation(
                                Epit.constraintlayout_core("1.1.2")
                            )
                        }
                        constraintlayoutSolver("1.0.0") {
                            customImplementation(
                                Epit.constraintlayout_solver("1.1.2")
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
    fun `verify that androidx activity block fun() adds dependencies in correct version`() {
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
                                Epit.constraintlayout("1.1.2")
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            customVersionImplementation(
                                Epit.constraintlayout_compose("1.1.2")
                            )
                        }
                        constraintlayoutCore("1.0.0") {
                            customVersionImplementation(
                                Epit.constraintlayout_core("1.1.2")
                            )
                        }
                        constraintlayoutSolver("1.0.0") {
                            customVersionImplementation(
                                Epit.constraintlayout_solver("1.1.2")
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
