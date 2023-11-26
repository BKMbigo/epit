package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx
import epit.dsl.androidx.*
import epit.dsl.compose.Compose
import epit.dsl.epitDependencies
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
            epitDependencies {
                androidx {
                    activity("1.8.1") {
                        implementation(Activity.activity)
                        customImplementation(Activity.activity.dependency)
                        customVersionImplementation(Activity.activity.dependency("1.1.2"))
                    }
                    appcompat("1.6.1") {
                        implementation(Appcompat.appcompat)
                        customImplementation(Appcompat.appcompat.dependency)
                        customVersionImplementation(Appcompat.appcompat.dependency("1.1.2"))
                    }
                    camera("1.3.0") {
                        implementation(Camera.camera_camera2)
                        customImplementation(Camera.camera_camera2.dependency)
                        customVersionImplementation(Camera.camera_camera2.dependency("1.1.2"))
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
                            implementation(ConstraintLayout.constraintlayout)
                            customImplementation(ConstraintLayout.constraintlayout.dependency)
                            customVersionImplementation(ConstraintLayout.constraintlayout.dependency("1.1.2"))
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(ConstraintLayoutCompose.constraintlayout_compose)
                            customImplementation(ConstraintLayoutCompose.constraintlayout_compose.dependency)
                            customVersionImplementation(ConstraintLayoutCompose.constraintlayout_compose.dependency("1.1.2"))
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(Core.core)
                            customImplementation(Core.core.dependency)
                            customVersionImplementation(Core.core.dependency("1.1.2"))
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(CoreSplashscreen.core_splashscreen)
                            customImplementation(CoreSplashscreen.core_splashscreen.dependency)
                            customVersionImplementation(CoreSplashscreen.core_splashscreen.dependency("1.1.2"))
                        }
                    }
                    fragment("1.0.0") {
                        implementation(Fragment.fragment)
                        customImplementation(Fragment.fragment.dependency)
                        customVersionImplementation(Fragment.fragment.dependency("1.1.2"))
                    }
                    lifecycle("1.0.0") {
                        implementation(Lifecycle.lifecycle_common)
                        customImplementation(Lifecycle.lifecycle_common.dependency)
                        customVersionImplementation(Lifecycle.lifecycle_common.dependency("1.1.2"))
                    }
                    navigation("1.0.0") {
                        implementation(Navigation.navigation_common)
                        customImplementation(Navigation.navigation_common.dependency)
                        customVersionImplementation(Navigation.navigation_common.dependency("1.1.2"))
                    }
                    paging("1.0.0") {
                        implementation(Paging.paging_common)
                        customImplementation(Paging.paging_common.dependency)
                        customVersionImplementation(Paging.paging_common.dependency("1.1.2"))
                    }
                    recyclerview("1.0.0") {
                        implementation(RecyclerView.recyclerview)
                        customImplementation(RecyclerView.recyclerview.dependency)
                        customVersionImplementation(RecyclerView.recyclerview.dependency("1.1.2"))
                    }
                    room("1.0.0") {
                        implementation(Room.room_common)
                        customImplementation(Room.room_common.dependency)
                        customVersionImplementation(Room.room_common.dependency("1.1.2"))
                    }
                    test {
                        testCore("1.0.0") {
                            implementation(TestCore.core)
                            customImplementation(TestCore.core.dependency)
                            customVersionImplementation(TestCore.core.dependency("1.1.2"))
                        }
                        testRules("1.0.0") {
                            implementation(TestRules.rules)
                            customImplementation(TestRules.rules.dependency)
                            customVersionImplementation(TestRules.rules.dependency("1.1.2"))
                        }
                        testRunner("1.0.0") {
                            implementation(TestRunner.runner)
                            customImplementation(TestRunner.runner.dependency)
                            customVersionImplementation(TestRunner.runner.dependency("1.1.2"))
                        }
                    }
                    testEspresso("1.0.0") {
                        implementation(TestEspresso.espresso_core)
                        customImplementation(TestEspresso.espresso_core.dependency)
                        customVersionImplementation(TestEspresso.espresso_core.dependency("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Activity.activity.moduleName,
            Appcompat.appcompat.moduleName,
            Camera.camera_camera2.moduleName,
            Compose.ComposeAnimation.animation.moduleName,
            Compose.ComposeCompiler.compiler.moduleName,
            Compose.ComposeFoundation.foundation.moduleName,
            Compose.ComposeMaterial.material.moduleName,
            Compose.ComposeMaterial3.material3.moduleName,
            Compose.ComposeRuntime.runtime.moduleName,
            Compose.ComposeUI.ui.moduleName,
            ConstraintLayout.constraintlayout.moduleName,
            ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            Core.core.moduleName,
            CoreSplashscreen.core_splashscreen.moduleName,
            Fragment.fragment.moduleName,
            Lifecycle.lifecycle_common.moduleName,
            Navigation.navigation_common.moduleName,
            Paging.paging_common.moduleName,
            RecyclerView.recyclerview.moduleName,
            Room.room_common.moduleName,
            TestCore.core.moduleName,
            TestRules.rules.moduleName,
            TestRunner.runner.moduleName,
            TestEspresso.espresso_core.moduleName
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
