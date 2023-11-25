import epit.annotations.ExperimentalEpitApi
import epit.dsl.*
import epit.dsl.androidx.*
import epit.dsl.compose.Compose
import epit.dsl.firebase.Firebase
import epit.dsl.koin.Koin
import epit.dsl.kotlinx.*


@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    id("com.github.bkmbigo.epit")
}

android {
    namespace = "com.github.bkmbigo.epit.sample.android"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
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
        epitDependencies {
            androidx {
                activity(libs.versions.androidx.activity.get()) {
                    implementation(Activity.activity)
                    implementation(Activity.activity_compose)
                    implementation(Activity.activity_ktx)
                }
                appcompat(libs.versions.androidx.appcompat.get()) {
                    implementation(Appcompat.appcompat)
                    implementation(Appcompat.appcompat_resources)
                }
                camera(libs.versions.androidx.camera.get()) {
                    implementation(Camera.camera_lifecycle)
                    implementation(Camera.camera_extensions)
                    implementation(Camera.camera_core)
                    implementation(Camera.camera_view)
                    implementation(Camera.camera_camera2)
                    implementation(Camera.camera_video)
                }
                constraintLayout {
                    constraintlayout(libs.versions.androidx.constraintlayout.toString()) {
                        implementation(ConstraintLayout.constraintlayout)
                    }
                    constraintlayoutCompose(libs.versions.androidx.constraintlayout.compose.get()) {
                        implementation(ConstraintLayoutCompose.constraintlayout_compose)
                        implementation(ConstraintLayoutCompose.constraintlayout_compose_android)
                    }
                }
                core {
                    core(libs.versions.androidx.core.toString()) {
                        implementation(Core.core)
                        implementation(Core.core_ktx)
//                        androidTestImplementation(Core.core_testing.dependency)
                    }
                    coreSplashscreen(libs.versions.androidx.core.splashscreen.get()) {
                        implementation(CoreSplashscreen.core_splashscreen)
                    }
                }
                fragment(libs.versions.androidx.fragment.toString()) {
                    implementation(Fragment.fragment)
                    implementation(Fragment.fragment_ktx)
                    implementation(Fragment.fragment_testing)
                    implementation(Fragment.fragment_testing_manifest)
                }
                lifecycle(libs.versions.androidx.lifecycle.core.get()) {
                    implementation(Lifecycle.lifecycle_common)
                    implementation(Lifecycle.lifecycle_common_java8)
                    implementation(Lifecycle.lifecycle_compiler)
                    implementation(Lifecycle.lifecycle_process)
                    implementation(Lifecycle.lifecycle_service)
                    implementation(Lifecycle.lifecycle_livedata)
                    implementation(Lifecycle.lifecycle_livedata_ktx)
                    implementation(Lifecycle.lifecycle_livedata_core)
                    implementation(Lifecycle.lifecycle_livedata_core_ktx)
                    implementation(Lifecycle.lifecycle_reactivestreams)
                    implementation(Lifecycle.lifecycle_reactivestreams_ktx)
                    implementation(Lifecycle.lifecycle_runtime)
                    implementation(Lifecycle.lifecycle_runtime_ktx)
                    implementation(Lifecycle.lifecycle_runtime_compose)
                    implementation(Lifecycle.lifecycle_runtime_testing)
                    implementation(Lifecycle.lifecycle_viewmodel)
                    implementation(Lifecycle.lifecycle_viewmodel_compose)
                    implementation(Lifecycle.lifecycle_viewmodel_ktx)
                    implementation(Lifecycle.lifecycle_viewmodel_savedstate)
                }
                navigation(libs.versions.androidx.navigation.get()) {
                    implementation(Navigation.navigation_compose)
                    implementation(Navigation.navigation_common)
                    implementation(Navigation.navigation_common_ktx)
                    implementation(Navigation.navigation_runtime)
                    implementation(Navigation.navigation_fragment)
                    implementation(Navigation.navigation_fragment_ktx)
                    implementation(Navigation.navigation_runtime_ui)
                    implementation(Navigation.navigation_runtime_ui_ktx)
                    implementation(Navigation.navigation_dynamic_features_fragment)
                    implementation(Navigation.navigation_dynamic_features_runtime)
                    implementation(Navigation.navigation_runtime_safe_args_generator)
                    implementation(Navigation.navigation_runtime_testing)
                }
                paging(libs.versions.androidx.paging.get()) {
                    implementation(Paging.paging_common)
//                    implementation(Paging.paging_common_jvm)
                    implementation(Paging.paging_common_ktx)
//                    implementation(Paging.paging_common_android)
//                    implementation(Paging.paging_common_iosx64)
//                    implementation(Paging.paging_common_iosarm64)
//                    implementation(Paging.paging_common_iossimulatorarm64)
//                    implementation(Paging.paging_common_linuxx64)
//                    implementation(Paging.paging_common_macosarm64)
//                    implementation(Paging.paging_common_macosx64)
                    implementation(Paging.paging_compose)
                    implementation(Paging.paging_compose_android)
                    implementation(Paging.paging_guava)
                    implementation(Paging.paging_runtime)
                    implementation(Paging.paging_runtime_ktx)
                    implementation(Paging.paging_rxjava2)
                    implementation(Paging.paging_rxjava2_ktx)
                    implementation(Paging.paging_rxjava3)
                    implementation(Paging.paging_testing)
//                    implementation(Paging.paging_testing_android)
//                    implementation(Paging.paging_testing_jvm)
//                    implementation(Paging.paging_testing_iosx64)
//                    implementation(Paging.paging_testing_iosarm64)
//                    implementation(Paging.paging_testing_iossimulatorarm64)
//                    implementation(Paging.paging_testing_linuxx64)
//                    implementation(Paging.paging_testing_macosarm64)
//                    implementation(Paging.paging_testing_macosx64)
                }
                room(libs.versions.androidx.room.get()) {
                    implementation(Room.room_ktx)
                    implementation(Room.room_testing)
                    implementation(Room.room_guava)
                    implementation(Room.room_paging)
                    implementation(Room.room_common)
                    implementation(Room.room_compiler)
                    implementation(Room.room_runtime)
                    implementation(Room.room_rxjava2)
                    implementation(Room.room_rxjava3)
                    implementation(Room.room_paging_guava)
                    implementation(Room.room_paging_rxjava2)
                    implementation(Room.room_paging_rxjava3)
                }
                test {
                    testCore(libs.versions.androidx.test.core.get()) {
                        testImplementation(TestCore.core.dependency)
                    }
                    testRunner(libs.versions.androidx.test.runner.get()) {
                        testImplementation(TestRunner.runner.dependency)
                    }
                    testRules(libs.versions.androidx.test.rules.get()) {
                        testImplementation(TestRules.rules.dependency)
                    }
                }
                testEspresso(libs.versions.androidx.test.espresso.get()) {
                    testImplementation(TestEspresso.espresso_core.dependency)
                    testImplementation(TestEspresso.espresso_web.dependency)
                    testImplementation(TestEspresso.espresso_remote.dependency)
                    testImplementation(TestEspresso.espresso_contrib.dependency)
                    testImplementation(TestEspresso.espresso_intents.dependency)
                    testImplementation(TestEspresso.espresso_accessibility.dependency)
                    testImplementation(TestEspresso.espresso_idling_resource.dependency)
                }
            }

            compose(libs.versions.androidx.compose.bom.get()) {
                implementation(Compose.ComposeRuntime.runtime)
                implementation(Compose.ComposeRuntime.runtime_livedata)
                implementation(Compose.ComposeFoundation.foundation)
                implementation(Compose.ComposeMaterial.material)
                implementation(Compose.ComposeMaterial3.material3)
                implementation(Compose.ComposeMaterial3.material3_window_size_class)
            }


            firebase(libs.versions.firebase.bom.get()) {
                implementation(Firebase.firebase_firestore_ktx)
                implementation(Firebase.firebase_database_ktx)
                implementation(Firebase.firebase_auth_ktx)
                implementation(Firebase.firebase_analytics)
                implementation(Firebase.firebase_storage_ktx)
                implementation(Firebase.firebase_analytics_ktx)
                implementation(Firebase.firebase_appcheck)
                implementation(Firebase.firebase_dynamic_links_ktx)
                implementation(Firebase.firebase_messaging_ktx)
                implementation(Firebase.firebase_functions_ktx)
                implementation(Firebase.firebase_config_ktx)
            }


            koin(libs.versions.koin.bom.get()) {
                implementation(Koin.koin_android)
                implementation(Koin.koin_android_compat)
                implementation(Koin.koin_androidx_compose)
                implementation(Koin.koin_androidx_compose_navigation)
                implementation(Koin.koin_androidx_navigation)
                implementation(Koin.koin_androidx_workmanager)
                implementation(Koin.koin_compose)
                implementation(Koin.koin_core)
                implementation(Koin.koin_core_coroutines)
                implementation(Koin.koin_ktor)
                implementation(Koin.koin_logger_slf4j)
                testImplementation(Koin.koin_test.dependency)
                androidTestImplementation(Koin.koin_android_test.dependency)
            }

            kotlinx {
                atomicfu(libs.versions.kotlinx.atomicfu.get()) {
                    implementation(AtomicFU.atomicfu)
                }
                coroutines(libs.versions.kotlinx.coroutines.get()) {
                    implementation(Coroutines.coroutines_core)
                    implementation(Coroutines.coroutines_debug)
                    implementation(Coroutines.coroutines_android)
                    implementation(Coroutines.coroutines_play_services)
                    implementation(Coroutines.coroutines_test)
                    implementation(Coroutines.coroutines_javafx)
                    implementation(Coroutines.coroutines_rx2)
                    implementation(Coroutines.coroutines_rx3)
                    implementation(Coroutines.coroutines_guava)
                    implementation(Coroutines.coroutines_reactive)
                    implementation(Coroutines.coroutines_jdk9)
                    implementation(Coroutines.coroutines_slf4j)
                    implementation(Coroutines.coroutines_swing)
                }
                collectionsImmutable(libs.versions.kotlinx.collections.immutable.get()) {
                    implementation(CollectionsImmutable.collections_immutable)
                }
                datetime(libs.versions.kotlinx.datetime.get()) {
                    implementation(Datetime.datetime)
                }
                serialization(libs.versions.kotlinx.serialization.get()) {
                    implementation(Serialization.serialization_core)
                    implementation(Serialization.serialization_json)
                }
            }


        }
    }
}

