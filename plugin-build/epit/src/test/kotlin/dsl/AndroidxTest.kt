package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
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
                        customImplementation(AndroidX.Activity.activity.dependencyAsString)
                        customVersionImplementation(AndroidX.Activity.activity.dependencyAsString("1.1.2"))
                    }
                    appcompat("1.0.0") {
                        implementation(AndroidX.Appcompat.appcompat)
                        customImplementation(AndroidX.Appcompat.appcompat.dependencyAsString)
                        customVersionImplementation(AndroidX.Appcompat.appcompat.dependencyAsString("1.1.2"))
                    }
                    camera("1.0.0") {
                        implementation(AndroidX.Camera.camera_camera2)
                        customImplementation(AndroidX.Camera.camera_camera2.dependencyAsString)
                        customVersionImplementation(AndroidX.Camera.camera_camera2.dependencyAsString("1.1.2"))
                    }
                    compose {
                        animation("1.0.0") {
                            implementation(AndroidX.Compose.Animation.animation)
                            customImplementation(AndroidX.Compose.Animation.animation.dependencyAsString)
                            customVersionImplementation(AndroidX.Compose.Animation.animation.dependencyAsString("1.1.2"))
                        }
                        compiler("1.0.0") {
                            implementation(AndroidX.Compose.Compiler.compiler)
                            customImplementation(AndroidX.Compose.Compiler.compiler.dependencyAsString)
                            customVersionImplementation(AndroidX.Compose.Compiler.compiler.dependencyAsString("1.1.2"))
                        }
                        foundation {
                            foundation("1.0.0") {
                                implementation(AndroidX.Compose.Foundation.Foundation.foundation)
                                customImplementation(AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString("1.1.2")
                                )
                            }
                            foundationText("1.0.0") {
                                implementation(AndroidX.Compose.Foundation.FoundationText.foundation_text)
                                customImplementation(AndroidX.Compose.Foundation.FoundationText.foundation_text.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Foundation.FoundationText.foundation_text.dependencyAsString("1.1.2")
                                )
                            }
                        }
                        material("1.0.0") {
                            implementation(AndroidX.Compose.Material.material)
                            customImplementation(AndroidX.Compose.Material.material.dependencyAsString)
                            customVersionImplementation(AndroidX.Compose.Material.material.dependencyAsString("1.1.2"))
                        }
                        material3 {
                            material3("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3.material3)
                                customImplementation(AndroidX.Compose.Material3.Material3.material3.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Material3.Material3.material3.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                            material3Adaptive("1.0.0") {
                                implementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive)
                                customImplementation(AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependencyAsString("1.1.2")
                                )
                            }
                        }
                        runtime {
                            runtime("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.Runtime.runtime)
                                customImplementation(AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                            runtimeTracing("1.0.0") {
                                implementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing)
                                customImplementation(AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependencyAsString("1.1.2")
                                )
                            }
                        }
                        ui("1.0.0") {
                            implementation(AndroidX.Compose.UI.ui)
                            customImplementation(AndroidX.Compose.UI.ui.dependencyAsString)
                            customVersionImplementation(AndroidX.Compose.UI.ui.dependencyAsString("1.1.2"))
                        }
                    }
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout)
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString("1.1.2")
                            )
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose)
                            customImplementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(AndroidX.Core.Core.core)
                            customImplementation(AndroidX.Core.Core.core.dependencyAsString)
                            customVersionImplementation(AndroidX.Core.Core.core.dependencyAsString("1.1.2"))
                        }
                        coreAnimation("1.0.0") {
                            implementation(AndroidX.Core.CoreAnimation.core_animation)
                            customImplementation(AndroidX.Core.CoreAnimation.core_animation.dependencyAsString)
                            customVersionImplementation(AndroidX.Core.CoreAnimation.core_animation.dependencyAsString("1.1.2"))
                        }
                        coreGoogleShortcuts("1.0.0") {
                            implementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts)
                            customImplementation(AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                        coreLocation("1.0.0") {
                            implementation(AndroidX.Core.CoreLocation.core_location_altitude)
                            customImplementation(AndroidX.Core.CoreLocation.core_location_altitude.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.Core.CoreLocation.core_location_altitude.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                        corePerformance("1.0.0") {
                            implementation(AndroidX.Core.CorePerformance.core_performance)
                            customImplementation(AndroidX.Core.CorePerformance.core_performance.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.Core.CorePerformance.core_performance.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                        coreRemoteViews("1.0.0") {
                            implementation(AndroidX.Core.CoreRemoteViews.core_remoteviews)
                            customImplementation(AndroidX.Core.CoreRemoteViews.core_remoteviews.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.Core.CoreRemoteViews.core_remoteviews.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                        coreRole("1.0.0") {
                            implementation(AndroidX.Core.CoreRole.core_role)
                            customImplementation(AndroidX.Core.CoreRole.core_role.dependencyAsString)
                            customVersionImplementation(AndroidX.Core.CoreRole.core_role.dependencyAsString("1.1.2"))
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(AndroidX.Core.CoreSplashscreen.core_splashscreen)
                            customImplementation(AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString)
                            customVersionImplementation(
                                AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString(
                                    "1.1.2"
                                )
                            )
                        }
                        coreTelecom("1.0.0") {
                            implementation(AndroidX.Core.CoreTelecom.core_telecom)
                            customImplementation(AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString)
                            customVersionImplementation(AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString("1.1.2"))
                        }
                    }
                    fragment("1.0.0") {
                        implementation(AndroidX.Fragment.fragment)
                        customImplementation(AndroidX.Fragment.fragment.dependencyAsString)
                        customVersionImplementation(AndroidX.Fragment.fragment.dependencyAsString("1.1.2"))
                    }
                    lifecycle("1.0.0") {
                        implementation(AndroidX.Lifecycle.lifecycle_common)
                        customImplementation(AndroidX.Lifecycle.lifecycle_common.dependencyAsString)
                        customVersionImplementation(AndroidX.Lifecycle.lifecycle_common.dependencyAsString("1.1.2"))
                    }
                    navigation("1.0.0") {
                        implementation(AndroidX.Navigation.navigation_common)
                        customImplementation(AndroidX.Navigation.navigation_common.dependencyAsString)
                        customVersionImplementation(AndroidX.Navigation.navigation_common.dependencyAsString("1.1.2"))
                    }
                    paging("1.0.0") {
                        implementation(AndroidX.Paging.paging_common)
                        customImplementation(AndroidX.Paging.paging_common.dependencyAsString)
                        customVersionImplementation(AndroidX.Paging.paging_common.dependencyAsString("1.1.2"))
                    }
                    recyclerview("1.0.0") {
                        implementation(AndroidX.RecyclerView.recyclerview)
                        customImplementation(AndroidX.RecyclerView.recyclerview.dependencyAsString)
                        customVersionImplementation(AndroidX.RecyclerView.recyclerview.dependencyAsString("1.1.2"))
                    }
                    room("1.0.0") {
                        implementation(AndroidX.Room.room_common)
                        customImplementation(AndroidX.Room.room_common.dependencyAsString)
                        customVersionImplementation(AndroidX.Room.room_common.dependencyAsString("1.1.2"))
                    }
                    test {
                        annotation("1.0.0") {
                            implementation(AndroidX.Test.Annotation.test_annotation)
                            customImplementation(AndroidX.Test.Annotation.test_annotation.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Annotation.test_annotation.dependencyAsString("1.1.2"))
                        }
                        core("1.0.0") {
                            implementation(AndroidX.Test.Core.core)
                            customImplementation(AndroidX.Test.Core.core.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Core.core.dependencyAsString("1.1.2"))
                        }
                        monitor("1.0.0") {
                            implementation(AndroidX.Test.Monitor.monitor)
                            customImplementation(AndroidX.Test.Monitor.monitor.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Monitor.monitor.dependencyAsString("1.1.2"))
                        }
                        orchestrator("1.0.0") {
                            implementation(AndroidX.Test.Orchestrator.orchestrator)
                            customImplementation(AndroidX.Test.Orchestrator.orchestrator.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Orchestrator.orchestrator.dependencyAsString("1.1.2"))
                        }
                        rules("1.0.0") {
                            implementation(AndroidX.Test.Rules.rules)
                            customImplementation(AndroidX.Test.Rules.rules.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Rules.rules.dependencyAsString("1.1.2"))
                        }
                        runner("1.0.0") {
                            implementation(AndroidX.Test.Runner.runner)
                            customImplementation(AndroidX.Test.Runner.runner.dependencyAsString)
                            customVersionImplementation(AndroidX.Test.Runner.runner.dependencyAsString("1.1.2"))
                        }
                        espresso {
                            espresso("1.0.0") {
                                implementation(AndroidX.Test.Espresso.Espresso.espresso_core)
                                customImplementation(AndroidX.Test.Espresso.Espresso.espresso_core.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Test.Espresso.Espresso.espresso_core.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                            espressoDevice("1.0.0") {
                                implementation(AndroidX.Test.Espresso.EspressoDevice.espresso_device)
                                customImplementation(AndroidX.Test.Espresso.EspressoDevice.espresso_device.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Test.Espresso.EspressoDevice.espresso_device.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                            espressoIdling("1.0.0") {
                                implementation(AndroidX.Test.Espresso.Idling.idling_concurrent)
                                customImplementation(AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                        }
                        ext {
                            jUnit("1.0.0") {
                                implementation(AndroidX.Test.Ext.JUnit.junit)
                                customImplementation(AndroidX.Test.Ext.JUnit.junit.dependencyAsString)
                                customVersionImplementation(AndroidX.Test.Ext.JUnit.junit.dependencyAsString("1.1.2"))
                            }
                            jUnitGTest("1.0.0") {
                                implementation(AndroidX.Test.Ext.JUnitGTest.junit_gtest)
                                customImplementation(AndroidX.Test.Ext.JUnitGTest.junit_gtest.dependencyAsString)
                                customVersionImplementation(
                                    AndroidX.Test.Ext.JUnitGTest.junit_gtest.dependencyAsString(
                                        "1.1.2"
                                    )
                                )
                            }
                            truth("1.0.0") {
                                implementation(AndroidX.Test.Ext.Truth.truth)
                                customImplementation(AndroidX.Test.Ext.Truth.truth.dependencyAsString)
                                customVersionImplementation(AndroidX.Test.Ext.Truth.truth.dependencyAsString("1.1.2"))
                            }
                        }
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Activity.activity.moduleName,
            AndroidX.Appcompat.appcompat.moduleName,
            AndroidX.Camera.camera_camera2.moduleName,
            AndroidX.Compose.Animation.animation.moduleName,
            AndroidX.Compose.Compiler.compiler.moduleName,
            AndroidX.Compose.Foundation.Foundation.foundation.moduleName,
            AndroidX.Compose.Foundation.FoundationText.foundation_text.moduleName,
            AndroidX.Compose.Material.material.moduleName,
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName,
            AndroidX.Compose.Runtime.Runtime.runtime.moduleName,
            AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.moduleName,
            AndroidX.Compose.UI.ui.moduleName,
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
            AndroidX.Test.Annotation.test_annotation.moduleName,
            AndroidX.Test.Core.core.moduleName,
            AndroidX.Test.Monitor.monitor.moduleName,
            AndroidX.Test.Orchestrator.orchestrator.moduleName,
            AndroidX.Test.Rules.rules.moduleName,
            AndroidX.Test.Runner.runner.moduleName,
            AndroidX.Test.Espresso.Espresso.espresso_core.moduleName,
            AndroidX.Test.Espresso.EspressoDevice.espresso_device.moduleName,
            AndroidX.Test.Espresso.Idling.idling_concurrent.moduleName,
            AndroidX.Test.Ext.JUnit.junit.moduleName,
            AndroidX.Test.Ext.JUnitGTest.junit_gtest.moduleName,
            AndroidX.Test.Ext.Truth.truth.moduleName
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
