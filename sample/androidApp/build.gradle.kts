import epit.annotations.ExperimentalEpitApi
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
        @OptIn(ExperimentalEpitApi::class)
        epitPreview {
//            androidx {
//                activity(libs.versions.androidx.activity.get()) {
//                    implementation(Epit.activity)
//                    implementation(Epit.activity_compose)
//                    implementation(Epit.activity_ktx)
//                }
//                appcompat(libs.versions.androidx.appcompat.get()) {
//                    implementation(Epit.appcompat)
//                    implementation(Epit.appcompat_resources)
//                }
//                camera(libs.versions.androidx.camera.get()) {
//                    implementation(Epit.camera_lifecycle)
//                    implementation(Epit.camera_extensions)
//                    implementation(Epit.camera_core)
//                    implementation(Epit.camera_view)
//                    implementation(Epit.camera_camera2)
//                    implementation(Epit.camera_video)
//                }
//                compose {
//                    composeBom(libs.versions.androidx.compose.bom.get()) {
//                        implementation(AndroidX.Compose.Runtime.Runtime.runtime)
//                        implementation(AndroidX.Compose.Runtime.Runtime.runtime_livedata)
//                        implementation(AndroidX.Compose.Foundation.Foundation.foundation)
//                        implementation(AndroidX.Compose.Material.material)
//                        implementation(AndroidX.Compose.Material3.Material3.material3)
//                        implementation(AndroidX.Compose.Material3.Material3.material3_window_size_class)
//                    }
//                }
//                constraintLayout {
//                    constraintlayout(libs.versions.androidx.constraintlayout.toString()) {
//                        implementation(Epit.constraintlayout)
//                    }
//                    constraintlayoutCompose(libs.versions.androidx.constraintlayout.compose.get()) {
//                        implementation(Epit.constraintlayout_compose)
//                    }
//                    constraintlayoutCore(libs.versions.androidx.constraintlayout.core.get()) {
//                        implementation(Epit.constraintlayout_core)
//                    }
//                    constraintlayoutSolver(libs.versions.androidx.constraintlayout.solver.get()) {
//                        implementation(Epit.constraintlayout_solver)
//                    }
//                }
//                core {
//                    core(libs.versions.androidx.core.toString()) {
//                        implementation(Epit.core)
//                        implementation(Epit.core_ktx)
//                        androidTestImplementation(Core.core_testing.dependency)
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
//                        implementation(Epit.core_splashscreen)
//                    }
//                    coreTelecom(libs.versions.androidx.core.telecom.get()) {
//                        implementation(Epit.core_telecom)
//                    }
//                }
//                fragment(libs.versions.androidx.fragment.toString()) {
//                    implementation(Epit.fragment)
//                    implementation(Epit.fragment_ktx)
//                    implementation(Epit.fragment_testing)
//                    implementation(Epit.fragment_testing_manifest)
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
//                        androidTestImplementation(Epit.core)
//                    }
//                    runner(libs.versions.androidx.test.runner.get()) {
//                        androidTestImplementation(Epit.runner)
//                    }
//                    rules(libs.versions.androidx.test.rules.get()) {
//                        androidTestImplementation(Epit.rules)
//                    }
//                    espresso {
//                        espresso(libs.versions.androidx.test.espresso.toString()) {
//                            androidTestImplementation(Epit.espresso_core)
//                            androidTestImplementation(Epit.espresso_web)
//                            androidTestImplementation(Epit.espresso_remote)
//                            androidTestImplementation(Epit.espresso_contrib)
//                            androidTestImplementation(Epit.espresso_intents)
//                            androidTestImplementation(Epit.espresso_accessibility)
//                            androidTestImplementation(Epit.espresso_idling_resource)
//
//                            androidTestImplementation(Epit.idling_concurrent)
//                            androidTestImplementation(Epit.idling_net)
//                        }
//                        espressoDevice(libs.versions.androidx.test.espresso.device.get()) {
//                            androidTestImplementation(Epit.espresso_device)
//                        }
//                    }
//                    ext {
//                        jUnit(libs.versions.androidx.test.ext.junit.junit.get()) {
//                            testImplementation(Epit.junit)
//                            testImplementation(Epit.junit_ktx)
//                        }
//                        jUnitGTest(libs.versions.androidx.test.ext.junit.gtest.get()) {
//                            testImplementation(Epit.junit_gtest)
//                        }
//                        truth(libs.versions.androidx.test.ext.truth.get()) {
//                            testImplementation(Epit.truth)
//                        }
//                    }
//                }
//            }

//            firebase(libs.versions.firebase.bom.get()) {
//                Firebase.values().forEach {
//                    implementation(it)
//                }
//            }

//            koinBom(libs.versions.koin.bom.get()) {
//                implementation(Epit.koin_android)
//                implementation(Epit.koin_android_compat)
//                implementation(Epit.koin_androidx_compose)
//                implementation(Epit.koin_androidx_compose_navigation)
//                implementation(Epit.koin_androidx_navigation)
//                implementation(Epit.koin_androidx_workmanager)
//                implementation(Epit.koin_compose)
//                implementation(Epit.koin_core)
//                implementation(Epit.koin_core_coroutines)
//                implementation(Epit.koin_ktor)
//                implementation(Epit.koin_logger_slf4j)
//                testImplementation(Epit.koin_test)
//                androidTestImplementation(Epit.koin_android_test)
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
//                    implementation(Epit.accompanist_permissions)
//                }
//            }
//            glide {
//                glide(libs.versions.glide.toString()) {
//
//                }
//                glideKtx(libs.versions.glide.ktx.get()) {
//
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

