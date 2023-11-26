import epit.dsl.androidx.*
import epit.dsl.compose.Compose
import epit.dsl.epitPreview
import epit.dsl.firebase.Firebase
import epit.dsl.koin.Koin
import epit.dsl.kotlinx.*
import epit.dsl.squareup.LeakCanary
import epit.dsl.squareup.OkHttp3
import epit.dsl.squareup.Picasso
import epit.dsl.squareup.Retrofit2


@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    id("io.github.bkmbigo.epit")
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
        epitPreview {
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
                    Lifecycle.values().forEach {
                        implementation(it)
                    }
                }
                navigation(libs.versions.androidx.navigation.get()) {
                    Navigation.values().forEach {
                        implementation(it)
                    }
                }
                paging(libs.versions.androidx.paging.get()) {
                    Paging.values().forEach {
                        implementation(it)
                    }
                }
                room(libs.versions.androidx.room.get()) {
                    Room.values().forEach {
                        implementation(it)
                    }
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
                Firebase.values().forEach {
                    implementation(it)
                }
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
                    Coroutines.values().forEach {
                        implementation(it)
                    }
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

            squareup {
                retrofit2(libs.versions.squareup.retrofit2.get()) {
                    Retrofit2.values().forEach {
                        implementation(it)
                    }
                }

                okhttp3(libs.versions.squareup.okhttp3.bom.get()) {
                    OkHttp3.values().forEach {
                        implementation(it)
                    }
                }

                picasso(libs.versions.squareup.picasso.get()) {
                    Picasso.values().forEach {
                        implementation(it)
                    }
                }

                leakcanary(libs.versions.squareup.leakcanary.get()) {
                    LeakCanary.values().forEach {
                        implementation(it)
                    }
                }
            }
        }
    }
}

