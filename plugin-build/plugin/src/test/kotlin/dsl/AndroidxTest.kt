package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx
import epit.dsl.androidx.*
import epit.dsl.compose.Compose
import epit.dsl.epitDependencies
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
        val conf = project.configurations.create("implementation")


        project.dependencies {
            epitDependencies {
                androidx {
                    activity("1.8.1") {
                        implementation(Activity.activity)
                    }
                    appcompat("1.6.1") {
                        implementation(Appcompat.appcompat)
                    }
                    camera("1.3.0") {
                        implementation(Camera.camera_camera2)
                    }
                    composeAnimation("1.5.4") {
                        implementation(Compose.ComposeAnimation.animation)
                    }
                    composeCompiler("1.5.4") {
                        implementation(Compose.ComposeCompiler.compiler)
                    }
                    composeFoundation("1.5.4") {
                        implementation(Compose.ComposeFoundation.foundation)
                    }
                    composeMaterial("1.5.4") {
                        implementation(Compose.ComposeMaterial.material)
                    }
                    composeMaterial3("1.1.2") {
                        implementation(Compose.ComposeMaterial3.material3)
                    }
                    composeRuntime("1.5.4") {
                        implementation(Compose.ComposeRuntime.runtime)
                    }
                    composeUI("1.5.4") {
                        implementation(Compose.ComposeUI.ui)
                    }
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(ConstraintLayout.constraintlayout)
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(ConstraintLayoutCompose.constraintlayout_compose)
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(Core.core)
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(CoreSplashscreen.core_splashscreen)
                        }
                    }
                    fragment("1.0.0") {
                        implementation(Fragment.fragment)
                    }
                    lifecycle("1.0.0") {
                        implementation(Lifecycle.lifecycle_common)
                    }
                    navigation("1.0.0") {
                        implementation(Navigation.navigation_common)
                    }
                    paging("1.0.0") {
                        implementation(Paging.paging_common)
                    }
                    recyclerview("1.0.0") {
                        implementation(RecyclerView.recyclerview)
                    }
                    room("1.0.0") {
                        implementation(Room.room_common)
                    }
                    test {
                        testCore("1.0.0") {
                            implementation(TestCore.core)
                        }
                        testRules("1.0.0") {
                            implementation(TestRules.rules)
                        }
                        testRunner("1.0.0") {
                            implementation(TestRunner.runner)
                        }
                    }
                    testEspresso("1.0.0") {
                        implementation(TestEspresso.espresso_core)
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

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
