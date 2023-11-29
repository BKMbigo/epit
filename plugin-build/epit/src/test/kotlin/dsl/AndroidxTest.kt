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
                    activity("1.0.0") {
                        implementation(AndroidX.Activity.activity)
                        customImplementation(AndroidX.Activity.activity.dependency)
                        customVersionImplementation(AndroidX.Activity.activity.dependency("1.1.2"))
                    }
                    appcompat("1.0.0") {
                        implementation(AndroidX.Appcompat.appcompat)
                        customImplementation(AndroidX.Appcompat.appcompat.dependency)
                        customVersionImplementation(AndroidX.Appcompat.appcompat.dependency("1.1.2"))
                    }
                    camera("1.0.0") {
                        implementation(AndroidX.Camera.camera_camera2)
                        customImplementation(AndroidX.Camera.camera_camera2.dependency)
                        customVersionImplementation(AndroidX.Camera.camera_camera2.dependency("1.1.2"))
                    }
                    composeAnimation("1.0.0") {
                        implementation(Compose.ComposeAnimation.animation)
                        customImplementation(Compose.ComposeAnimation.animation.dependency)
                        customVersionImplementation(Compose.ComposeAnimation.animation.dependency("1.1.2"))
                    }
                    composeCompiler("1.0.0") {
                        implementation(Compose.ComposeCompiler.compiler)
                        customImplementation(Compose.ComposeCompiler.compiler.dependency)
                        customVersionImplementation(Compose.ComposeCompiler.compiler.dependency("1.1.2"))
                    }
                    composeFoundation("1.0.0") {
                        implementation(Compose.ComposeFoundation.foundation)
                        customImplementation(Compose.ComposeFoundation.foundation.dependency)
                        customVersionImplementation(Compose.ComposeFoundation.foundation.dependency("1.1.2"))
                    }
                    composeFoundationText("1.0.0") {
                        implementation(Compose.ComposeFoundationText.foundation_text)
                        customImplementation(Compose.ComposeFoundationText.foundation_text.dependency)
                        customVersionImplementation(Compose.ComposeFoundationText.foundation_text.dependency("1.1.2"))
                    }
                    composeMaterial("1.0.0") {
                        implementation(Compose.ComposeMaterial.material)
                        customImplementation(Compose.ComposeMaterial.material.dependency)
                        customVersionImplementation(Compose.ComposeMaterial.material.dependency("1.1.2"))
                    }
                    composeMaterial3("1.0.0") {
                        implementation(Compose.ComposeMaterial3.material3)
                        customImplementation(Compose.ComposeMaterial3.material3.dependency)
                        customVersionImplementation(Compose.ComposeMaterial3.material3.dependency("1.1.2"))
                    }
                    composeMaterial3Adaptive("1.0.0") {
                        implementation(Compose.ComposeMaterial3Adaptive.material3_adaptive)
                        customImplementation(Compose.ComposeMaterial3Adaptive.material3_adaptive.dependency)
                        customVersionImplementation(Compose.ComposeMaterial3Adaptive.material3_adaptive.dependency("1.1.2"))
                    }
                    composeRuntime("1.0.0") {
                        implementation(Compose.ComposeRuntime.runtime)
                        customImplementation(Compose.ComposeRuntime.runtime.dependency)
                        customVersionImplementation(Compose.ComposeRuntime.runtime.dependency("1.1.2"))
                    }
                    composeRuntimeTracing("1.0.0") {
                        implementation(Compose.ComposeRuntimeTracing.runtime_tracing)
                        customImplementation(Compose.ComposeRuntimeTracing.runtime_tracing.dependency)
                        customVersionImplementation(Compose.ComposeRuntimeTracing.runtime_tracing.dependency("1.1.2"))
                    }
                    composeUI("1.0.0") {
                        implementation(Compose.ComposeUI.ui)
                        customImplementation(Compose.ComposeUI.ui.dependency)
                        customVersionImplementation(Compose.ComposeUI.ui.dependency("1.1.2"))
                    }
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout)
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency)
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependency("1.1.2")
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose)
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency)
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependency("1.1.2")
                            )
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(AndroidX.Core.Core.core)
                            customImplementation(AndroidX.Core.Core.core.dependency)
                            customVersionImplementation(AndroidX.Core.Core.core.dependency("1.1.2"))
                        }
                        coreAnimation("1.0.0") {
                            implementation(AndroidX.Core.CoreAnimation.core_animation)
                            customImplementation(AndroidX.Core.CoreAnimation.core_animation.dependency)
                            customVersionImplementation(AndroidX.Core.CoreAnimation.core_animation.dependency("1.1.2"))
                        }
                        coreGoogleShortcuts("1.0.0") {
                            implementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts)
                            customImplementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependency)
                            customVersionImplementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependency("1.1.2"))
                        }
                        coreLocation("1.0.0") {
                            implementation(AndroidX.Core.CoreLocation.core_location_altitude)
                            customImplementation(AndroidX.Core.CoreLocation.core_location_altitude.dependency)
                            customVersionImplementation(AndroidX.Core.CoreLocation.core_location_altitude.dependency("1.1.2"))
                        }
                        corePerformance("1.0.0") {
                            implementation(AndroidX.Core.CorePerformance.core_performance)
                            customImplementation(AndroidX.Core.CorePerformance.core_performance.dependency)
                            customVersionImplementation(AndroidX.Core.CorePerformance.core_performance.dependency("1.1.2"))
                        }
                        coreRemoteViews("1.0.0") {
                            implementation(AndroidX.Core.CoreRemoteViews.core_remoteviews)
                            customImplementation(AndroidX.Core.CoreRemoteViews.core_remoteviews.dependency)
                            customVersionImplementation(AndroidX.Core.CoreRemoteViews.core_remoteviews.dependency("1.1.2"))
                        }
                        coreRole("1.0.0") {
                            implementation(AndroidX.Core.CoreRole.core_role)
                            customImplementation(AndroidX.Core.CoreRole.core_role.dependency)
                            customVersionImplementation(AndroidX.Core.CoreRole.core_role.dependency("1.1.2"))
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(AndroidX.Core.CoreSplashscreen.core_splashscreen)
                            customImplementation(AndroidX.Core.CoreSplashscreen.core_splashscreen.dependency)
                            customVersionImplementation(AndroidX.Core.CoreSplashscreen.core_splashscreen.dependency("1.1.2"))
                        }
                        coreTelecom("1.0.0") {
                            implementation(AndroidX.Core.CoreTelecom.core_telecom)
                            customImplementation(AndroidX.Core.CoreTelecom.core_telecom.dependency)
                            customVersionImplementation(AndroidX.Core.CoreTelecom.core_telecom.dependency("1.1.2"))
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
                        testAnnotation("1.0.0") {
                            implementation(AndroidX.Test.TestAnnotation.test_annotation)
                            customImplementation(AndroidX.Test.TestAnnotation.test_annotation.dependency)
                            customVersionImplementation(AndroidX.Test.TestAnnotation.test_annotation.dependency("1.1.2"))
                        }
                        testCore("1.0.0") {
                            implementation(AndroidX.Test.TestCore.core)
                            customImplementation(AndroidX.Test.TestCore.core.dependency)
                            customVersionImplementation(AndroidX.Test.TestCore.core.dependency("1.1.2"))
                        }
                        testMonitor("1.0.0") {
                            implementation(AndroidX.Test.TestMonitor.monitor)
                            customImplementation(AndroidX.Test.TestMonitor.monitor.dependency)
                            customVersionImplementation(AndroidX.Test.TestMonitor.monitor.dependency("1.1.2"))
                        }
                        testOrchestrator("1.0.0") {
                            implementation(AndroidX.Test.TestOrchestrator.orchestrator)
                            customImplementation(AndroidX.Test.TestOrchestrator.orchestrator.dependency)
                            customVersionImplementation(AndroidX.Test.TestOrchestrator.orchestrator.dependency("1.1.2"))
                        }
                        testRules("1.0.0") {
                            implementation(AndroidX.Test.TestRules.rules)
                            customImplementation(AndroidX.Test.TestRules.rules.dependency)
                            customVersionImplementation(AndroidX.Test.TestRules.rules.dependency("1.1.2"))
                        }
                        testRunner("1.0.0") {
                            implementation(AndroidX.Test.TestRunner.runner)
                            customImplementation(AndroidX.Test.TestRunner.runner.dependency)
                            customVersionImplementation(AndroidX.Test.TestRunner.runner.dependency("1.1.2"))
                        }
                    }
                    testEspresso("1.0.0") {
                        implementation(AndroidX.TestEspresso.espresso_core)
                        customImplementation(AndroidX.TestEspresso.espresso_core.dependency)
                        customVersionImplementation(AndroidX.TestEspresso.espresso_core.dependency("1.1.2"))
                    }
                    testEspressoDevice("1.0.0") {
                        implementation(AndroidX.TestEspressoDevice.espresso_device)
                        customImplementation(AndroidX.TestEspressoDevice.espresso_device.dependency)
                        customVersionImplementation(AndroidX.TestEspressoDevice.espresso_device.dependency("1.1.2"))
                    }
                    testEspressoIdling("1.0.0") {
                        implementation(AndroidX.TestEspressoIdling.idling_concurrent)
                        customImplementation(AndroidX.TestEspressoIdling.idling_concurrent.dependency)
                        customVersionImplementation(AndroidX.TestEspressoIdling.idling_concurrent.dependency("1.1.2"))
                    }
                    testExt {
                        testExtJUnit("1.0.0") {
                            implementation(AndroidX.TestExt.TestExtJUnit.junit)
                            customImplementation(AndroidX.TestExt.TestExtJUnit.junit.dependency)
                            customVersionImplementation(AndroidX.TestExt.TestExtJUnit.junit.dependency("1.1.2"))
                        }
                        testExtJUnitGTest("1.0.0") {
                            implementation(AndroidX.TestExt.TestExtJUnitGTest.junit_gtest)
                            customImplementation(AndroidX.TestExt.TestExtJUnitGTest.junit_gtest.dependency)
                            customVersionImplementation(AndroidX.TestExt.TestExtJUnitGTest.junit_gtest.dependency("1.1.2"))
                        }
                        testExtJUnitTruth("1.0.0") {
                            implementation(AndroidX.TestExt.TestExtTruth.truth)
                            customImplementation(AndroidX.TestExt.TestExtTruth.truth.dependency)
                            customVersionImplementation(AndroidX.TestExt.TestExtTruth.truth.dependency("1.1.2"))
                        }
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
            Compose.ComposeFoundationText.foundation_text.moduleName,
            Compose.ComposeMaterial.material.moduleName,
            Compose.ComposeMaterial3.material3.moduleName,
            Compose.ComposeMaterial3Adaptive.material3_adaptive.moduleName,
            Compose.ComposeRuntime.runtime.moduleName,
            Compose.ComposeRuntimeTracing.runtime_tracing.moduleName,
            Compose.ComposeUI.ui.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.moduleName,
            AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.moduleName,
            AndroidX.Core.Core.core.moduleName,
            AndroidX.Core.CoreAnimation.core_animation.moduleName,
            AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.moduleName,
            AndroidX.Core.CoreLocation.core_location_altitude.moduleName,
            AndroidX.Core.CorePerformance.core_performance.moduleName,
            AndroidX.Core.CoreRemoteViews.core_remoteviews.moduleName,
            AndroidX.Core.CoreRole.core_role.moduleName,
            AndroidX.Core.CoreSplashscreen.core_splashscreen.moduleName,
            AndroidX.Core.CoreTelecom.core_telecom.moduleName,
            AndroidX.Fragment.fragment.moduleName,
            AndroidX.Lifecycle.lifecycle_common.moduleName,
            AndroidX.Navigation.navigation_common.moduleName,
            AndroidX.Paging.paging_common.moduleName,
            AndroidX.RecyclerView.recyclerview.moduleName,
            AndroidX.Room.room_common.moduleName,
            AndroidX.Test.TestAnnotation.test_annotation.moduleName,
            AndroidX.Test.TestCore.core.moduleName,
            AndroidX.Test.TestMonitor.monitor.moduleName,
            AndroidX.Test.TestOrchestrator.orchestrator.moduleName,
            AndroidX.Test.TestRules.rules.moduleName,
            AndroidX.Test.TestRunner.runner.moduleName,
            AndroidX.TestEspresso.espresso_core.moduleName,
            AndroidX.TestEspressoDevice.espresso_device.moduleName,
            AndroidX.TestEspressoIdling.idling_concurrent.moduleName,
            AndroidX.TestExt.TestExtJUnit.junit.moduleName,
            AndroidX.TestExt.TestExtJUnitGTest.junit_gtest.moduleName,
            AndroidX.TestExt.TestExtTruth.truth.moduleName
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
