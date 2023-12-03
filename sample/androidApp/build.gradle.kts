import epit.dsl.epitPreview


@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    id("io.github.bkmbigo.epit")
}

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "com.github.bkmbigo.epit.sample.android"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    dependencies {
        epitPreview {
            androidx {
//                activity(libs.versions.androidx.activity.get()) {
//                    implementation(AndroidX.Activity.activity)
//                    implementation(AndroidX.Activity.activity_compose)
//                    implementation(AndroidX.Activity.activity_ktx)
//                }
//                appcompat(libs.versions.androidx.appcompat.get()) {
//                    implementation(AndroidX.Appcompat.appcompat)
//                    implementation(AndroidX.Appcompat.appcompat_resources)
//                }
//                camera(libs.versions.androidx.camera.get()) {
//                    implementation(AndroidX.Camera.camera_lifecycle)
//                    implementation(AndroidX.Camera.camera_extensions)
//                    implementation(AndroidX.Camera.camera_core)
//                    implementation(AndroidX.Camera.camera_view)
//                    implementation(AndroidX.Camera.camera_camera2)
//                    implementation(AndroidX.Camera.camera_video)
//                }
//                  compose {
//                      compose(libs.versions.androidx.compose.bom.get()) {
//                          implementation(AndroidX.Compose.Runtime.Runtime.runtime)
//                          implementation(AndroidX.Compose.Runtime.Runtime.runtime_livedata)
//                          implementation(AndroidX.Compose.Foundation.Foundation.foundation)
//                          implementation(AndroidX.Compose.Material.material)
//                          implementation(AndroidX.Compose.Material3.Material3.material3)
//                          implementation(AndroidX.Compose.Material3.Material3.material3_window_size_class)
//                          implementation(AndroidX.Compose.Material3.Material3.material3_window_size_class)
//                      }
//                  }
//                constraintLayout {
//                    constraintlayout(libs.versions.androidx.constraintlayout.toString()) {
//                        implementation(AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout)
//                    }
//                    constraintlayoutCompose(libs.versions.androidx.constraintlayout.compose.get()) {
//                        implementation(AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose)
//                    }
//                    constraintlayoutCore(libs.versions.androidx.constraintlayout.core.get()) {
//                        implementation(AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core)
//                    }
//                    constraintlayoutSolver(libs.versions.androidx.constraintlayout.solver.get()) {
//                        implementation(AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver)
//                    }
//                }
//                core {
//                    core(libs.versions.androidx.core.toString()) {
//                        implementation(AndroidX.Core.Core.core)
//                        implementation(AndroidX.Core.Core.core_ktx)
////                        androidTestImplementation(Core.core_testing.dependency)
//                    }
//                    coreAnimation(libs.versions.androidx.core.animation.get()) {
//                        AndroidX.Core.CoreAnimation.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    coreGoogleShortcuts(libs.versions.androidx.core.google.shortcuts.get()) {
//                        AndroidX.Core.CoreGoogleShortcuts.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    coreLocation(libs.versions.androidx.core.location.get()) {
//                        AndroidX.Core.CoreLocation.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    corePerformance(libs.versions.androidx.core.performance.get()) {
//                        AndroidX.Core.CorePerformance.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    coreRole(libs.versions.androidx.core.role.get()) {
//                        AndroidX.Core.CoreRole.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    coreRemoteViews(libs.versions.androidx.core.remoteviews.get()) {
//                        AndroidX.Core.CoreRemoteViews.values().forEach {
//                            implementation(it)
//                        }
//                    }
//                    coreSplashscreen(libs.versions.androidx.core.splashscreen.get()) {
//                        implementation(AndroidX.Core.CoreSplashscreen.core_splashscreen)
//                    }
//                    coreTelecom(libs.versions.androidx.core.telecom.get()) {
//                        implementation(AndroidX.Core.CoreTelecom.core_telecom)
//                    }
//                }
//                fragment(libs.versions.androidx.fragment.toString()) {
//                    implementation(AndroidX.Fragment.fragment)
//                    implementation(AndroidX.Fragment.fragment_ktx)
//                    implementation(AndroidX.Fragment.fragment_testing)
//                    implementation(AndroidX.Fragment.fragment_testing_manifest)
//                }
//                lifecycle(libs.versions.androidx.lifecycle.core.get()) {
//                    AndroidX.Lifecycle.values().forEach {
//                        implementation(it)
//                    }
//                }
//                navigation(libs.versions.androidx.navigation.get()) {
//                    AndroidX.Navigation.values().forEach {
//                        implementation(it)
//                    }
//                }
//                paging(libs.versions.androidx.paging.get()) {
//                    AndroidX.Paging.values().forEach {
//                        implementation(it)
//                    }
//                }
//                room(libs.versions.androidx.room.get()) {
//                    AndroidX.Room.values().forEach {
//                        implementation(it)
//                    }
//                }
//                test {
//                    core(libs.versions.androidx.test.core.get()) {
//                        androidTestImplementation(AndroidX.Test.Core.core.dependency)
//                    }
//                    runner(libs.versions.androidx.test.runner.get()) {
//                        androidTestImplementation(AndroidX.Test.Runner.runner.dependency)
//                    }
//                    rules(libs.versions.androidx.test.rules.get()) {
//                        androidTestImplementation(AndroidX.Test.Rules.rules.dependency)
//                    }
//                    espresso {
//                        espresso(libs.versions.androidx.test.espresso.toString()) {
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_core.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_web.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_remote.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_contrib.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_intents.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_accessibility.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Espresso.espresso_idling_resource.dependency)
//
//                            androidTestImplementation(AndroidX.Test.Espresso.Idling.idling_concurrent.dependency)
//                            androidTestImplementation(AndroidX.Test.Espresso.Idling.idling_net.dependency)
//                        }
//                        espressoDevice(libs.versions.androidx.test.espresso.device.get()) {
//                            androidTestImplementation(AndroidX.Test.Espresso.EspressoDevice.espresso_device.dependency)
//                        }
//                    }
//                    ext {
//                        jUnit(libs.versions.androidx.test.ext.junit.junit.get()) {
//                            testImplementation(AndroidX.Test.Ext.JUnit.junit.dependency)
//                            testImplementation(AndroidX.Test.Ext.JUnit.junit_ktx.dependency)
//                        }
//                        jUnitGTest(libs.versions.androidx.test.ext.junit.gtest.get()) {
//                            testImplementation(AndroidX.Test.Ext.JUnitGTest.junit_gtest.dependency)
//                        }
//                        truth(libs.versions.androidx.test.ext.truth.get()) {
//                            testImplementation(AndroidX.Test.Ext.Truth.truth.dependency)
//                        }
//                    }
//                }
            }

//            firebase(libs.versions.firebase.bom.get()) {
//                Firebase.values().forEach {
//                    implementation(it)
//                }
//            }

//            koin(libs.versions.koin.bom.get()) {
//                implementation(Koin.koin_android)
//                implementation(Koin.koin_android_compat)
//                implementation(Koin.koin_androidx_compose)
//                implementation(Koin.koin_androidx_compose_navigation)
//                implementation(Koin.koin_androidx_navigation)
//                implementation(Koin.koin_androidx_workmanager)
//                implementation(Koin.koin_compose)
//                implementation(Koin.koin_core)
//                implementation(Koin.koin_core_coroutines)
//                implementation(Koin.koin_ktor)
//                implementation(Koin.koin_logger_slf4j)
//                testImplementation(Koin.koin_test.dependency)
//                androidTestImplementation(Koin.koin_android_test.dependency)
//            }

//            kotlinx {
//                atomicfu(libs.versions.kotlinx.atomicfu.get()) {
//                    implementation(KotlinX.AtomicFU.atomicfu)
//                }
//                coroutines(libs.versions.kotlinx.coroutines.get()) {
//                    KotlinX.Coroutines.values().forEach {
//                        implementation(it)
//                    }
//                }
//                collectionsImmutable(libs.versions.kotlinx.collections.immutable.get()) {
//                    implementation(KotlinX.CollectionsImmutable.collections_immutable)
//                }
//                datetime(libs.versions.kotlinx.datetime.get()) {
//                    implementation(KotlinX.Datetime.datetime)
//                }
//                serialization(libs.versions.kotlinx.serialization.get()) {
//                    implementation(KotlinX.Serialization.serialization_core)
//                    implementation(KotlinX.Serialization.serialization_json)
//                }
//            }

//            squareup {
//                retrofit2(libs.versions.squareup.retrofit2.get()) {
//                    SquareUp.Retrofit2.values().forEach {
//                        implementation(it)
//                    }
//                }
//
//                okhttp3(libs.versions.squareup.okhttp3.bom.get()) {
//                    SquareUp.OkHttp3.values().forEach {
//                        implementation(it)
//                    }
//                }
//
//                picasso(libs.versions.squareup.picasso.get()) {
//                    SquareUp.Picasso.values().forEach {
//                        implementation(it)
//                    }
//                }
//
//                leakcanary(libs.versions.squareup.leakcanary.get()) {
//                    SquareUp.LeakCanary.values().forEach {
//                        implementation(it)
//                    }
//                }
//            }
//            voyager(libs.versions.voyager.get()) {
//                Voyager.values().forEach {
//                    implementation(it)
//                }
//            }
//            coil(libs.versions.coil.get()) {
//                Coil.values().forEach {
//                    implementation(it)
//                }
//            }
//            google {
//                accompanist(libs.versions.google.accompanist.get()) {
//                    Google.Accompanist.values().forEach {
//                        implementation(it)
//                    }
//                }
//            }
//            glide {
//                glide(libs.versions.glide.toString()) {
//                    Glide.Glide.values().forEach {
//                        implementation(it)
//                    }
//                }
//                glideKtx(libs.versions.glide.ktx.get()) {
//                    Glide.GlideKtx.values().forEach {
//                        implementation(it)
//                    }
//                }
//            }
//            raamcosta {
//                composeDestinations(libs.versions.raamcosta.composeDestinations.get()) {
//                    Raamcosta.ComposeDestinations.values().forEach {
//                        implementation(it)
//                    }
//                }
//            }
//            ktor(libs.versions.ktor.get()) {
//                Ktor.Ktor.values().forEach {
//                    implementation(it)
//                }
//            }
        }
    }
}

