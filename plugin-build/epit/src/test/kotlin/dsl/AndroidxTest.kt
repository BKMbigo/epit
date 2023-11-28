package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.compose.Compose
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidxTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `androidx block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    activity("1.8.1") {
                        implementation(AndroidX.Activity.activity)
                        customImplementation(AndroidX.Activity.activity.dependency)
                        customVersionImplementation(AndroidX.Activity.activity.dependency("1.1.2"))
                    }
                    appcompat("1.6.1") {
                        implementation(AndroidX.Appcompat.appcompat)
                        customImplementation(AndroidX.Appcompat.appcompat.dependency)
                        customVersionImplementation(AndroidX.Appcompat.appcompat.dependency("1.1.2"))
                    }
                    camera("1.3.0") {
                        implementation(AndroidX.Camera.camera_camera2)
                        customImplementation(AndroidX.Camera.camera_camera2.dependency)
                        customVersionImplementation(AndroidX.Camera.camera_camera2.dependency("1.1.2"))
                    }
                    composeAnimation("1.5.4") {
                        implementation(Compose.ComposeAnimation.animation)
                        customImplementation(Compose.ComposeAnimation.animation.dependency)
                        customVersionImplementation(Compose.ComposeAnimation.animation.dependency("1.1.2"))
                    }
                    composeCompiler("1.5.4") {
                        implementation(Compose.ComposeCompiler.compiler)
                        customImplementation(Compose.ComposeCompiler.compiler.dependency)
                        customVersionImplementation(Compose.ComposeCompiler.compiler.dependency("1.1.2"))
                    }
                    composeFoundation("1.5.4") {
                        implementation(Compose.ComposeFoundation.foundation)
                        customImplementation(Compose.ComposeFoundation.foundation.dependency)
                        customVersionImplementation(Compose.ComposeFoundation.foundation.dependency("1.1.2"))
                    }
                    composeMaterial("1.5.4") {
                        implementation(Compose.ComposeMaterial.material)
                        customImplementation(Compose.ComposeMaterial.material.dependency)
                        customVersionImplementation(Compose.ComposeMaterial.material.dependency("1.1.2"))
                    }
                    composeMaterial3("1.1.2") {
                        implementation(Compose.ComposeMaterial3.material3)
                        customImplementation(Compose.ComposeMaterial3.material3.dependency)
                        customVersionImplementation(Compose.ComposeMaterial3.material3.dependency("1.1.0"))
                    }
                    composeRuntime("1.5.4") {
                        implementation(Compose.ComposeRuntime.runtime)
                        customImplementation(Compose.ComposeRuntime.runtime.dependency)
                        customVersionImplementation(Compose.ComposeRuntime.runtime.dependency("1.1.2"))
                    }
                    composeUI("1.5.4") {
                        implementation(Compose.ComposeUI.ui)
                        customImplementation(Compose.ComposeUI.ui.dependency)
                        customVersionImplementation(Compose.ComposeUI.ui.dependency("1.1.2"))
                    }
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.constraintlayout)
                            customImplementation(AndroidX.ConstraintLayout.constraintlayout.dependency)
                            customVersionImplementation(AndroidX.ConstraintLayout.constraintlayout.dependency("1.1.2"))
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(AndroidX.ConstraintLayoutCompose.constraintlayout_compose)
                            customImplementation(AndroidX.ConstraintLayoutCompose.constraintlayout_compose.dependency)
                            customVersionImplementation(
                                AndroidX.ConstraintLayoutCompose.constraintlayout_compose.dependency(
                                    "1.1.2"
                                )
                            )
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(AndroidX.Core.core)
                            customImplementation(AndroidX.Core.core.dependency)
                            customVersionImplementation(AndroidX.Core.core.dependency("1.1.2"))
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(AndroidX.CoreSplashscreen.core_splashscreen)
                            customImplementation(AndroidX.CoreSplashscreen.core_splashscreen.dependency)
                            customVersionImplementation(AndroidX.CoreSplashscreen.core_splashscreen.dependency("1.1.2"))
                        }
                    }
                    fragment("1.0.0") {
                        implementation(AndroidX.Fragment.fragment)
                        customImplementation(AndroidX.Fragment.fragment.dependency)
                        customVersionImplementation(AndroidX.Fragment.fragment.dependency("1.1.2"))
                    }
                    lifecycle("1.0.0") {
                        implementation(AndroidX.Lifecycle.lifecycle_common)
                        customImplementation(AndroidX.Lifecycle.lifecycle_common.dependency)
                        customVersionImplementation(AndroidX.Lifecycle.lifecycle_common.dependency("1.1.2"))
                    }
                    navigation("1.0.0") {
                        implementation(AndroidX.Navigation.navigation_common)
                        customImplementation(AndroidX.Navigation.navigation_common.dependency)
                        customVersionImplementation(AndroidX.Navigation.navigation_common.dependency("1.1.2"))
                    }
                    paging("1.0.0") {
                        implementation(AndroidX.Paging.paging_common)
                        customImplementation(AndroidX.Paging.paging_common.dependency)
                        customVersionImplementation(AndroidX.Paging.paging_common.dependency("1.1.2"))
                    }
                    recyclerview("1.0.0") {
                        implementation(AndroidX.RecyclerView.recyclerview)
                        customImplementation(AndroidX.RecyclerView.recyclerview.dependency)
                        customVersionImplementation(AndroidX.RecyclerView.recyclerview.dependency("1.1.2"))
                    }
                    room("1.0.0") {
                        implementation(AndroidX.Room.room_common)
                        customImplementation(AndroidX.Room.room_common.dependency)
                        customVersionImplementation(AndroidX.Room.room_common.dependency("1.1.2"))
                    }
                    test {
                        testCore("1.0.0") {
                            implementation(AndroidX.TestCore.core)
                            customImplementation(AndroidX.TestCore.core.dependency)
                            customVersionImplementation(AndroidX.TestCore.core.dependency("1.1.2"))
                        }
                        testRules("1.0.0") {
                            implementation(AndroidX.TestRules.rules)
                            customImplementation(AndroidX.TestRules.rules.dependency)
                            customVersionImplementation(AndroidX.TestRules.rules.dependency("1.1.2"))
                        }
                        testRunner("1.0.0") {
                            implementation(AndroidX.TestRunner.runner)
                            customImplementation(AndroidX.TestRunner.runner.dependency)
                            customVersionImplementation(AndroidX.TestRunner.runner.dependency("1.1.2"))
                        }
                    }
                    testEspresso("1.0.0") {
                        implementation(AndroidX.TestEspresso.espresso_core)
                        customImplementation(AndroidX.TestEspresso.espresso_core.dependency)
                        customVersionImplementation(AndroidX.TestEspresso.espresso_core.dependency("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Activity.activity.moduleName,
            AndroidX.Appcompat.appcompat.moduleName,
            AndroidX.Camera.camera_camera2.moduleName,
            Compose.ComposeAnimation.animation.moduleName,
            Compose.ComposeCompiler.compiler.moduleName,
            Compose.ComposeFoundation.foundation.moduleName,
            Compose.ComposeMaterial.material.moduleName,
            Compose.ComposeMaterial3.material3.moduleName,
            Compose.ComposeRuntime.runtime.moduleName,
            Compose.ComposeUI.ui.moduleName,
            AndroidX.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.Core.core.moduleName,
            AndroidX.CoreSplashscreen.core_splashscreen.moduleName,
            AndroidX.Fragment.fragment.moduleName,
            AndroidX.Lifecycle.lifecycle_common.moduleName,
            AndroidX.Navigation.navigation_common.moduleName,
            AndroidX.Paging.paging_common.moduleName,
            AndroidX.RecyclerView.recyclerview.moduleName,
            AndroidX.Room.room_common.moduleName,
            AndroidX.TestCore.core.moduleName,
            AndroidX.TestRules.rules.moduleName,
            AndroidX.TestRunner.runner.moduleName,
            AndroidX.TestEspresso.espresso_core.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "Androidx dependencies using implementation() differ"
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx dependencies using implementation(dependency.dependency) differ"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
