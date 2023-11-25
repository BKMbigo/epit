import epit.annotations.ExperimentalEpitApi
import epit.dsl.*
import epit.dsl.androidx.*
import epit.dsl.compose.Compose
import epit.dsl.firebase.Firebase
import epit.dsl.koin.Koin


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
                core(libs.versions.androidx.core.toString()) {
                    implementation(Core.core)
                    implementation(Core.core_ktx)
//                    testImplementation(Core.core_testing.dependency)
                }
                fragment(libs.versions.androidx.fragment.toString()) {
                    implementation(Fragment.fragment)
                    implementation(Fragment.fragment_ktx)
                    implementation(Fragment.fragment_testing)
                    implementation(Fragment.fragment_testing_manifest)
                }
                lifecycle(libs.versions.androidx.lifecycle.core.get()) {
                    implementation(Lifecycle.lifecycle_livedata_core_ktx)
                    implementation(Lifecycle.lifecycle_runtime_compose)
                    implementation(Lifecycle.lifecycle_viewmodel_compose)
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
                implementation(Koin.koin_core)
                implementation(Koin.koin_android)
                implementation(Koin.koin_compose)
                implementation(Koin.koin_androidx_compose)
                implementation(Koin.koin_androidx_navigation)
                testImplementation(Koin.koin_test.dependency)
                androidTestImplementation(Koin.koin_android_test.dependency)
            }
        }
    }
}

