package dsl

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
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
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    activity("1.0.0") {
                        implementation(Epit.activity)
                        customVersionImplementation(Epit.activity("1.1.2"))
                    }
                    appcompat("1.0.0") {
                        implementation(Epit.appcompat)
                        customVersionImplementation(Epit.appcompat("1.1.2"))
                    }
                    camera("1.0.0") {
                        implementation(Epit.camera_camera2)
                        customVersionImplementation(Epit.camera_camera2("1.1.2"))
                    }
                    compose {
                        animation("1.0.0") {
                            implementation(Epit.animation)
                            customVersionImplementation(Epit.animation("1.1.2"))
                        }
                        compiler("1.0.0") {
                            implementation(Epit.compiler)
                            customVersionImplementation(Epit.compiler("1.1.2"))
                        }
                        foundation {
                            foundation("1.0.0") {
                                implementation(Epit.foundation)
                                customVersionImplementation(Epit.foundation("1.1.2"))
                            }
                            foundationText("1.0.0") {
                                implementation(Epit.foundation_text)
                                customVersionImplementation(Epit.foundation_text("1.1.2"))
                            }
                        }
                        material("1.0.0") {
                            implementation(Epit.material)
                            customVersionImplementation(Epit.material("1.1.2"))
                        }
                        material3 {
                            material3("1.0.0") {
                                implementation(Epit.material3)
                                customVersionImplementation(Epit.material3("1.1.2"))
                            }
                            material3Adaptive("1.0.0") {
                                implementation(Epit.material3_adaptive)
                                customVersionImplementation(Epit.material3_adaptive("1.1.2"))
                            }
                        }
                        runtime {
                            runtime("1.0.0") {
                                implementation(Epit.runtime)
                                customVersionImplementation(Epit.runtime("1.1.2"))
                            }
                            runtimeTracing("1.0.0") {
                                implementation(Epit.runtime_tracing)
                                customVersionImplementation(Epit.runtime_tracing("1.1.2"))
                            }
                        }
                        ui("1.0.0") {
                            implementation(Epit.ui)
                            customVersionImplementation(Epit.ui("1.1.2"))
                        }
                    }
                    constraintLayout {
                        constraintlayout("1.0.0") {
                            implementation(Epit.constraintlayout)
                            customVersionImplementation(Epit.constraintlayout("1.1.2"))
                        }
                        constraintlayoutCompose("1.0.0") {
                            implementation(Epit.constraintlayout_compose)
                            customVersionImplementation(Epit.constraintlayout_compose("1.1.2"))
                        }
                    }
                    core {
                        core("1.0.0") {
                            implementation(Epit.core)
                            customVersionImplementation(Epit.core("1.1.2"))
                        }
                        coreAnimation("1.0.0") {
                            implementation(Epit.core_animation)
                            customVersionImplementation(Epit.core_animation("1.1.2"))
                        }
                        coreGoogleShortcuts("1.0.0") {
                            implementation(Epit.core_google_shortcuts)
                            customVersionImplementation(Epit.core_google_shortcuts("1.1.2"))
                        }
                        coreLocation("1.0.0") {
                            implementation(Epit.core_location_altitude)
                            customVersionImplementation(Epit.core_location_altitude("1.1.2"))
                        }
                        corePerformance("1.0.0") {
                            implementation(Epit.core_performance)
                            customVersionImplementation(Epit.core_performance("1.1.2"))
                        }
                        coreRemoteViews("1.0.0") {
                            implementation(Epit.core_remoteviews)
                            customVersionImplementation(Epit.core_remoteviews("1.1.2"))
                        }
                        coreRole("1.0.0") {
                            implementation(Epit.core_role)
                            customVersionImplementation(Epit.core_role("1.1.2"))
                        }
                        coreSplashscreen("1.0.0") {
                            implementation(Epit.core_splashscreen)
                            customVersionImplementation(Epit.core_splashscreen("1.1.2"))
                        }
                        coreTelecom("1.0.0") {
                            implementation(Epit.core_telecom)
                            customVersionImplementation(Epit.core_telecom("1.1.2"))
                        }
                    }
                    fragment("1.0.0") {
                        implementation(Epit.fragment)
                        customVersionImplementation(Epit.fragment("1.1.2"))
                    }
                    lifecycle("1.0.0") {
                        implementation(Epit.lifecycle_common)
                        customVersionImplementation(Epit.lifecycle_common("1.1.2"))
                    }
                    navigation("1.0.0") {
                        implementation(Epit.navigation_common)
                        customVersionImplementation(Epit.navigation_common("1.1.2"))
                    }
                    paging("1.0.0") {
                        implementation(Epit.paging_common)
                        customVersionImplementation(Epit.paging_common("1.1.2"))
                    }
                    recyclerview("1.0.0") {
                        implementation(Epit.recyclerview)
                        customVersionImplementation(Epit.recyclerview("1.1.2"))
                    }
                    room("1.0.0") {
                        implementation(Epit.room_common)
                        customVersionImplementation(Epit.room_common("1.1.2"))
                    }
                    test {
                        annotation("1.0.0") {
                            implementation(Epit.test_annotation)
                            customVersionImplementation(Epit.test_annotation("1.1.2"))
                        }
                        core("1.0.0") {
                            implementation(Epit.core)
                            customVersionImplementation(Epit.core("1.1.2"))
                        }
                        monitor("1.0.0") {
                            implementation(Epit.monitor)
                            customVersionImplementation(Epit.monitor("1.1.2"))
                        }
                        orchestrator("1.0.0") {
                            implementation(Epit.orchestrator)
                            customVersionImplementation(Epit.orchestrator("1.1.2"))
                        }
                        rules("1.0.0") {
                            implementation(Epit.rules)
                            customVersionImplementation(Epit.rules("1.1.2"))
                        }
                        runner("1.0.0") {
                            implementation(Epit.runner)
                            customVersionImplementation(Epit.runner("1.1.2"))
                        }
                        espresso {
                            espresso("1.0.0") {
                                implementation(Epit.espresso_core)
                                customVersionImplementation(Epit.espresso_core("1.1.2"))
                            }
                            espressoDevice("1.0.0") {
                                implementation(Epit.espresso_device)
                                customVersionImplementation(Epit.espresso_device("1.1.2"))
                            }
                            espressoIdling("1.0.0") {
                                implementation(Epit.idling_concurrent)
                                customVersionImplementation(Epit.idling_concurrent("1.1.2"))
                            }
                        }
                        ext {
                            jUnit("1.0.0") {
                                implementation(Epit.junit)
                                customVersionImplementation(Epit.junit("1.1.2"))
                            }
                            jUnitGTest("1.0.0") {
                                implementation(Epit.junit_gtest)
                                customVersionImplementation(Epit.junit_gtest("1.1.2"))
                            }
                            truth("1.0.0") {
                                implementation(Epit.truth)
                                customVersionImplementation(Epit.truth("1.1.2"))
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
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
