package epit.dependencies

import epit.EpitDependency


internal sealed interface AndroidX : EpitDependency {

    enum class Activity(
        internal val moduleName: String
    ) : AndroidX {
        activity("androidx.activity:activity"),
        activity_compose("androidx.activity:activity-compose"),
        activity_ktx("androidx.activity:activity-ktx");
    }

    enum class Annotation(
        internal val moduleName: String
    ) : AndroidX {
        annotation_annotation(moduleName = "androidx.annotation:annotation"),
        experimental(moduleName = "androidx.annotation:annotation-experimental"),
        experimental_lint(moduleName = "androidx.annotation:annotation-experimental-lint"),
//        annotation_iosarm64(moduleName = "androidx.annotation:annotation-iosarm64"),
//        annotation_iossimulationarm64(moduleName = "androidx.annotation:annotation-iossimulatorarm64"),
//        annotation_iosx64(moduleName = "androidx.annotation:annotation-iosx64"),
//        annotation_jvm(moduleName = "androidx.annotation:annotation-jvm"),
//        annotation_linuxx64(moduleName = "androidx.annotation:annotation-linuxx64"),
//        annotation_macosarm64(moduleName = "androidx.annotation:annotation-macosarm64"),
//        annotation_macosx64(moduleName = "androidx.annotation:annotation-macosx64"),
    }

    enum class Appcompat(
        internal val moduleName: String
    ) : AndroidX {
        appcompat(moduleName = "androidx.appcompat:appcompat"),
        appcompat_resources("androidx.appcompat:appcompat-resources")
    }

    enum class Autofill(
        internal val moduleName: String
    ) : AndroidX {
        autofill(moduleName = "androidx.autofill:autofill")
    }

    enum class Benchmark(
        internal val moduleName: String
    ) : AndroidX {
        androidx_benchmark_gradle_plugin("androidx.benchmark:androidx.benchmark.gradle.plugin"),

        //        benchmark(moduleName = "androidx.benchmark:benchmark"),
        benchmark_baseline_profile_gradle_plugin(moduleName = "androidx.benchmark:benchmark-baseline-profile-gradle-plugin"),
        benchmark_common(moduleName = "androidx.benchmark:benchmark-common"),
        benchmark_gradle_plugin(moduleName = "androidx.benchmark:benchmark-gradle-plugin"),
        benchmark_junit4(moduleName = "androidx.benchmark:benchmark-junit4"),
        benchmark_macro(moduleName = "androidx.benchmark:benchmark-macro"),
        benchmark_macro_junit4(moduleName = "androidx.benchmark:benchmark-macro-junit4");
    }

    enum class Biometric(
        internal val moduleName: String
    ) : AndroidX {
        biometric(moduleName = "androidx.biometric:biometric"),
        biometric_ktx(moduleName = "androidx.biometric:biometric-ktx")
    }

    enum class Bluetooth(
        internal val moduleName: String
    ) : AndroidX {
        bluetooth(moduleName = "androidx.bluetooth:bluetooth"),
        bluetooth_testing(moduleName = "androidx.bluetooth:bluetooth-testing"),
    }

    enum class Browser(
        internal val moduleName: String
    ) : AndroidX {
        browser(moduleName = "androidx.browser:browser")
    }

    enum class Camera(
        internal val moduleName: String
    ) : AndroidX {
        camera_camera2(moduleName = "androidx.camera:camera-camera2"),
        camera_core("androidx.camera:camera-core"),
        camera_extensions("androidx.camera:camera-extensions"),
        camera_lifecycle("androidx.camera:camera-lifecycle"),

        //    camera_mlkit_vision("androidx.camera:camera-mlkit-vision"),
        camera_video("androidx.camera:camera-video"),
        camera_view("androidx.camera:camera-view");
//    camera_viewfinder("androidx.camera:camera-viewfinder")

    }

    sealed interface Car : AndroidX {

        enum class App(
            internal val moduleName: String
        ) : Car {
            app(moduleName = "androidx.car.app:app"),
            app_automotive(moduleName = "androidx.car.app:app-automotive"),
            app_projected(moduleName = "androidx.car.app:app-projected"),
            app_testing(moduleName = "androidx.car.app:app-testing"),
        }
    }

    enum class CardView(
        internal val moduleName: String
    ) : AndroidX {
        cardview(moduleName = "androidx.cardview:cardview")
    }

    enum class Collection(
        internal val moduleName: String
    ) : AndroidX {
        collection(moduleName = "androidx.collection:collection"),
        collection_ktx(moduleName = "androidx.collection:collection-ktx"),
//        collection_iosarm64(moduleName = "androidx.collection:collection-iosarm64"),
//        collection_iossimulatorarm64(moduleName = "androidx.collection:collection-iossimulatorarm64"),
//        collection_iosx64(moduleName = "androidx.collection:collection-iosx64"),
//        collection_jvm(moduleName = "androidx.collection:collection-jvm"),
//        collection_linuxx64(moduleName = "androidx.collection:collection-linuxx64"),
//        collection_macosarm64(moduleName = "androidx.collection:collection-macosarm64"),
//        collection_macosx64(moduleName = "androidx.collection:collection-macosx64"),
    }

    sealed interface Compose : AndroidX {

        sealed interface ComposeBomDependency : Compose

        enum class Animation(
            internal val moduleName: String
        ) : Compose, ComposeBomDependency {
            animation(moduleName = "androidx.compose.animation:animation"),

            //        animation_android(moduleName = "androidx.compose.animation:animation-android"),
            animation_core(moduleName = "androidx.compose.animation:animation-core"),

            //        animation_core_android(moduleName = "androidx.compose.animation:animation-core-android"),
//        animation_core_desktop(moduleName = "androidx.compose.animation:animation-desktop"),
//        animation_desktop(moduleName = "androidx.compose.animation:animation-desktop"),
            animation_graphics(moduleName = "androidx.compose.animation:animation-graphics"),

            //        animation_graphics_android(moduleName = "androidx.compose.animation:animation-graphics-android"),
//        animation_graphics_desktop(moduleName = "androidx.compose.animation:animation-graphics-desktop"),
            animation_tooling_internal(moduleName = "androidx.compose.animation:animation-tooling-internal")
        }

        enum class Bom(
            internal val moduleName: String
        ) : Compose {
            compose_bom("androidx.compose:compose-bom")
        }

        enum class Compiler(
            internal val moduleName: String
        ) : Compose, ComposeBomDependency {
            compiler(moduleName = "androidx.compose.compiler:compiler"),
            compiler_daemon(moduleName = "androidx.compose.compiler:compiler-daemon"),
            compiler_hosted(moduleName = "androidx.compose.compiler:compiler-hosted")
        }

        sealed interface Foundation : Compose {

            enum class Foundation(
                internal val moduleName: String
            ) : MainFoundation, ComposeBomDependency {
                foundation(moduleName = "androidx.compose.foundation:foundation"),

                //  foundation_android(moduleName = "androidx.compose.foundation:foundation-android"),
                //  foundation_desktop(moduleName = "androidx.compose.foundation:foundation-desktop"),
                foundation_layout(moduleName = "androidx.compose.foundation:foundation-layout");
                //  foundation_layout_android(moduleName = "androidx.compose.foundation:foundation-layout-android"),
                //  foundation_layout_desktop(moduleName = "androidx.compose.foundation:foundation-desktop")
            }

            enum class FoundationText(
                internal val moduleName: String
            ) : MainFoundation {
                foundation_text(moduleName = "androidx.compose.foundation:foundation-text")
            }
        }

        enum class Material(
            internal val moduleName: String
        ) : Compose, ComposeBomDependency {
            material(moduleName = "androidx.compose.material:material"),

            //  material_android(moduleName = "androidx.compose.material:material-android"),
            //  material_desktop(moduleName = "androidx.compose.material:material-desktop"),
            material_icons_core(moduleName = "androidx.compose.material:material-icons-core"),

            //  material_icons_core_android(moduleName = "androidx.compose.material:material-icons-core-android"),
            //  material_icons_core_desktop(moduleName = "androidx.compose.material:material-icons-core-desktop"),
            material_icons_extended(moduleName = "androidx.compose.material:material-icons-extended"),

            //  material_icons_extended_android(moduleName = "androidx.compose.material:material-icons-extended-android"),
            //  material_icons_extended_desktop(moduleName = "androidx.compose.material:material-icons-extended-desktop"),
            material_ripple(moduleName = "androidx.compose.material:material-ripple");
            //  material_ripple_android(moduleName = "androidx.compose.material:material-ripple-android"),
            //  material_ripple_desktop(moduleName = "androidx.compose.material:material-ripple-desktop")
        }

        sealed interface Material3 : Compose {

            enum class Material3(
                internal val moduleName: String
            ) : MainMaterial3, ComposeBomDependency {
                material3("androidx.compose.material3:material3"),

                //  material3_android("androidx.compose.material3:material3-android"),
                //  material3_desktop("androidx.compose.material3:material3-desktop"),
                material3_window_size_class("androidx.compose.material3:material3-window-size-class");
                //  material3_window_size_class_android("androidx.compose.material3:material3-window-size-class-android"),
                //  material3_window_size_class_desktop("androidx.compose.material3:material3-window-size-class-desktop")
            }

            enum class Material3Adaptive(
                internal val moduleName: String
            ) : MainMaterial3 {
                material3_adaptive("androidx.compose.material3:material3-adaptive"),

                //  material3_adaptive_android("androidx.compose.material3:material3-adaptive-android"),
                //  material3_adaptive_desktop("androidx.compose.material3:material3-adaptive-desktop"),
                material3_adaptive_navigation_suite("androidx.compose.material3:material3-adaptive-navigation-suite");
                //  material3_adaptive_navigation_suite_android("androidx.compose.material3:material3-adaptive-navigation-suite-android"),
                //  material3_adaptive_navigation_suite_desktop("androidx.compose.material3:material3-adaptive-navigation-suite-desktop")
            }
        }

        sealed interface Runtime : Compose {

            enum class Runtime(
                internal val moduleName: String
            ) : MainRuntime, ComposeBomDependency {
                runtime(moduleName = "androidx.compose.runtime:runtime"),

                //  runtime_android(moduleName = "androidx.compose.runtime:runtime-android"),
                //  runtime_desktop(moduleName = "androidx.compose.runtime:runtime-desktop"),
                //  runtime_dispatch(moduleName = "androidx.compose.runtime:runtime-dispatch"),
                runtime_livedata(moduleName = "androidx.compose.runtime:runtime-livedata"),
                runtime_rxjava2(moduleName = "androidx.compose.runtime:runtime-rxjava2"),
                runtime_rxjava3(moduleName = "androidx.compose.runtime:runtime-rxjava3"),
                runtime_saveable(moduleName = "androidx.compose.runtime:runtime-saveable");
                //  runtime_saveable_android(moduleName = "androidx.compose.runtime:runtime-saveable-android"),
                //  runtime_saveable_desktop(moduleName = "androidx.compose.runtime:runtime-saveable-desktop")
            }

            enum class RuntimeSavedInstanceState(
                internal val moduleName: String
            ) : MainRuntime {
                runtime_saved_instance_state(moduleName = "androidx.compose.runtime:runtime-saved-instance-state")
            }

            enum class RuntimeTracing(
                internal val moduleName: String
            ) : Compose {
                runtime_tracing(moduleName = "androidx.compose.runtime:runtime-tracing")
            }
        }

        enum class UI(
            internal val moduleName: String
        ) : Compose, ComposeBomDependency {
            ui("androidx.compose.ui:ui"),

            //  ui_android("androidx.compose.ui:ui-android"),
            ui_android_stubs("androidx.compose.ui:ui-android-stubs"),

            //  ui_desktop("androidx.compose.ui:ui-desktop"),
            ui_geometry("androidx.compose.ui:ui-goemetry"),

            //  ui_geometry_android("androidx.compose.ui:ui-geometry"),
            //  ui_geometry_desktop("androidx.compose.ui:ui-geometry-desktop"),
            ui_graphics("androidx.compose.ui:ui-graphics"),

            //  ui_graphics_android("androidx.compose.ui:ui-graphics-android"),
            //  ui_graphics_desktop("androidx.compose.ui:ui-graphics-desktop"),
            ui_test("androidx.compose.ui:ui-ui-test"),

            //  ui_test_android("androidx.compose.ui:ui-test-android"),
            //  ui_test_desktop("androidx.compose.ui:ui-test-desktop"),
            ui_test_junit4("androidx.compose.ui:ui-test-junit4"),

            //  ui_test_junit4_android("androidx.compose.ui:ui-test-junit4-android"),
            //  ui_test_junit4_desktop("androidx.compose.ui:ui-test-junit4-desktop"),
            ui_test_manifest("androidx.compose.ui:ui-test-manifest"),
            ui_text("androidx.compose.ui:ui-text"),

            //  ui_text_android("androidx.compose.ui:ui-ui-text-android"),
            //  ui_text_desktop("androidx.compose.ui:ui-text-desktop"),
            ui_text_google_fonts("androidx.compose.ui:ui-text-google-fonts"),
            ui_tooling("androidx.compose.ui:ui-tooling"),

            //  ui_tooling_android("androidx.compose.ui:ui-tooling-android"),
            ui_tooling_data("androidx.compose.ui:ui-tooling-data"),

            //  ui_tooling_data_android("androidx.compose.ui:ui-tooling-data-android"),
            //  ui_tooling_data_desktop("androidx.compose.ui:ui-tooling-data-desktop"),
            //  ui_tooling_desktop("androidx.compose.ui:ui-tooling-desktop"),
            ui_tooling_preview("androidx.compose.ui:ui-tooling-preview"),

            //  ui_tooling_preview_android("androidx.compose.ui:ui-tooling-preview-android"),
            //  ui_tooling_preview_desktop("androidx.compose.ui:ui-tooling-preview-desktop"),
            ui_unit("androidx.compose.ui:ui-unit"),

            //  ui_unit_android("androidx.compose.ui:ui-unit-android"),
            //  ui_unit_desktop("androidx.compose.ui:ui-unit-desktop"),
            ui_util("androidx.compose.ui:ui-util"),

            //  ui_util_android("androidx.compose.ui:ui-util-android"),
            //  ui_util_desktop("androidx.compose.ui:ui-util-desktop"),
            ui_viewbinding("androidx.compose.ui:ui-viewbinding");
        }

    }

    enum class Concurrent(
        internal val moduleName: String
    ) : AndroidX {
        concurrent_futures(moduleName = "androidx.concurrent:concurrent-futures"),
        concurrent_futures_ktx(moduleName = "androidx.concurrent:concurrent-futures-ktx"),
//            concurrent_listenablefuture(moduleName = "androidx.concurrent:concurrent-listenablefuture"),
//            concurrent_listenablefuture_callback(moduleName = "androidx.concurrent:concurrent-listenablefuture-callback"),
//            futures(moduleName = "androidx.concurrent:concurrent-futures")
    }

    sealed interface ConstraintLayout : AndroidX {

        enum class ConstraintLayout(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout");
        }

        enum class ConstraintLayoutCompose(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose");
            //    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android")
        }

        enum class ConstraintLayoutCore(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core");
        }

        enum class ConstraintLayoutSolver(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver");
        }
    }

    enum class ContentPager(
        internal val moduleName: String
    ) : AndroidX {
        contentpager(moduleName = "androidx.contentpager:contentpager")
    }

    enum class CoordinatorLayout(
        internal val moduleName: String
    ) : AndroidX {
        coordinatorlayout(moduleName = "androidx.coordinatorlayout:coordinatorlayout")
    }

    sealed interface Core {

        enum class Core(
            internal val moduleName: String
        ) : AndroidX {
            core(moduleName = "androidx.core:core"),

            //    core_animation(moduleName = "androidx.core:core-animation")
//    core_animation_testing(moduleName = "androidx.core:core-animation-testing")
//    core_google_shortcuts(moduleName = "androidx.core:core-google-shortcuts")
//    core_i18n(moduleName = "androidx.core:core-i18n")
            core_ktx(moduleName = "androidx.core:core-ktx"),

            //    core_location_altitude(moduleName = "androidx.core:core-location-altitude")
//    core_performance(moduleName = "androidx.core:core-performance")
//    core_performance_play_services(moduleName = "androidx.core:core-performance-play-services")
//    core_performance_testing(moduleName = "androidx.core:core-performance-testing")
//    core_remoteviews(moduleName = "androidx.core:core-remoteviews")
//    core_role(moduleName = "androidx.core:core-role")
//    core_splashscreen(moduleName = "androidx.core:core-splashscreen")
//    core_telecom(moduleName = "androidx.core:core-telecom")
            core_testing(moduleName = "androidx.core:core-testing");
        }

        enum class CoreAnimation(
            internal val moduleName: String
        ) : AndroidX {
            core_animation(moduleName = "androidx.core:core-animation"),
            core_animation_testing(moduleName = "androidx.core:core-animation-testing");
        }

        enum class CoreGoogleShortcuts(
            internal val moduleName: String
        ) : AndroidX {
            core_google_shortcuts(moduleName = "androidx.core:core-google-shortcuts");
        }

        enum class CoreLocation(
            internal val moduleName: String
        ) : AndroidX {
            core_i18n(moduleName = "androidx.core:core-i18n"),
            core_location_altitude(moduleName = "androidx.core:core-location-altitude");
        }

        enum class CorePerformance(
            internal val moduleName: String
        ) : AndroidX {
            core_performance(moduleName = "androidx.core:core-performance"),
            core_performance_play_services(moduleName = "androidx.core:core-performance-play-services"),
            core_performance_testing(moduleName = "androidx.core:core-performance-testing");
        }

        enum class CoreRemoteViews(
            internal val moduleName: String
        ) : AndroidX {
            core_remoteviews(moduleName = "androidx.core:core-remoteviews");
        }

        enum class CoreRole(
            internal val moduleName: String
        ) : AndroidX {
            core_role(moduleName = "androidx.core:core-role");
        }

        enum class CoreSplashscreen(
            internal val moduleName: String
        ) : AndroidX {
            core_splashscreen(moduleName = "androidx.core:core-splashscreen");
        }

        enum class CoreTelecom(
            internal val moduleName: String
        ) : AndroidX {
            core_telecom(moduleName = "androidx.core:core-telecom");
        }


        /* androidx.core.uwb */
//        enum class CoreUwb(
//            internal val moduleName: String
//        ) : AndroidX {
//            uwb(moduleName = "androidx.core.uwb:uwb"),
//            uwb_rxjava3(moduleName = "androidx.core.uwb:uwb-rxjava3")
//        }
    }

    enum class Credentials(
        internal val moduleName: String
    ) : AndroidX {
        credentials(moduleName = "androidx.credentials:credentials"),
        credentials_play_services_auth(moduleName = "androidx.credentials:credentials-play-services-auth")
    }

    enum class CursorAdapter(
        internal val moduleName: String
    ) : AndroidX {
        cursoradapter(moduleName = "androidx.cursoradapter:cursoradapter")
    }

    enum class CustomView(
        internal val moduleName: String
    ) : AndroidX {
        customview(moduleName = "androidx.customview:customview"),
        customview_poolingcontainer(moduleName = "androidx.customview:customview-poolingcontainer")
    }

    enum class DataBinding(
        internal val moduleName: String
    ) : AndroidX {
        //        adapters(moduleName = "androidx.databinding:adapters"),
//        baseLibrary(moduleName = "androidx.databinding:baseLibrary"),
//        compiler(moduleName = "androidx.databinding:compiler"),
//        compilerCommon(moduleName = "androidx.databinding:compilerCommon"),
        databinding_adapters(moduleName = "androidx.databinding:databinding-adapters"),
        databinding_common(moduleName = "androidx.databinding:databinding-common"),
        databinding_compiler(moduleName = "androidx.databinding:databinding-compiler"),
        databinding_compiler_common(moduleName = "androidx.databinding:databinding-compiler-common"),
        databinding_ktx(moduleName = "androidx.databinding:databinding-ktx"),
        databinding_runtime(moduleName = "androidx.databinding:databinding-runtime"),

        //        library(moduleName = "androidx.databinding:library"),
        viewbinding(moduleName = "androidx.databinding:viewbinding")
    }

    enum class DataStore(
        internal val moduleName: String
    ) : AndroidX {
        datastore(moduleName = "androidx.datastore:datastore"),

        //        datastore_android(moduleName = "androidx.datastore:datatore-android"),
        datastore_core(moduleName = "androidx.datastore:datastore-core"),

        //        datastore_core_android(moduleName = "androidx.datastore:datastore-core-android"),
//        datastore_core_iosarm64(moduleName = "androidx.datastore:datastore-core-iosarm64"),
//        datastore_core_iossimulatorarm64(moduleName = "androidx.datastore:datastore-core-iossimulatorarm64"),
//        datastore_core_iosx64(moduleName = "androidx.datastore:datastore-core-iosx64"),
//        datastore_core_jvm(moduleName = "androidx.datastore:datastore-core-jvm"),
//        datastore_core_linuxx64(moduleName = "androidx.datastore:datastore-core-linuxx64"),
//        datastore_core_macosarm64(moduleName = "androidx.datastore:datastore-core-macosarm64"),
//        datastore_core_macosx64(moduleName = "androidx.datastore:datastore-core-macosx64"),
        datastore_core_okio(moduleName = "androidx.datastore:datastore-core-okio"),

        //        datastore_core_okio_iosarm64(moduleName = "androidx.datastore:datastore-core-okio-iosarm64"),
//        datastore_core_okio_iossimulatorarm64(moduleName = "androidx.datastore:datastore-core-okio-iossimulatorarm64"),
//        datastore_core_okio_iosx64(moduleName = "androidx.datastore:datastore-core-okio-iosx64"),
//        datastore_core_okio_jvm(moduleName = "androidx.datastore:datastore-core-okio-jvm"),
//        datastore_core_okio_linuxx64(moduleName = "androidx.datastore:datastore-core-okio-linuxx64"),
//        datastore_core_okio_macosarm64(moduleName = "androidx.datastore:datastore-core-okio-macosarm64"),
//        datastore_core_okio_macosx64(moduleName = "androidx.datastore:datastore-core-okio-macosx64"),
//        datastore_iosarm64(moduleName = "androidx.datastore:datastore-iosarm64"),
//        datastore_iossimulatorarm64(moduleName = "androidx.datastore:datastore-iossimulatorarm64"),
//        datastore_iosx64(moduleName = "androidx.datastore:datastore-iosx64"),
//        datastore_jvm(moduleName = "androidx.datastore:datastore-jvm"),
//        datastore_linuxx64(moduleName = "androidx.datastore:datastore-linuxx64"),
//        datastore_macosarm64(moduleName = "androidx.datastore:datastore-macosarm64"),
//        datastore_macosx64(moduleName = "androidx.datastore:datastore-macosx64"),
        datastore_preferences(moduleName = "androidx.datastore:datastore-preferences"),

        //        datastore_preferences_android(moduleName = "androidx.datastore:datastore-preferences-android"),
        datastore_preferences_core(moduleName = "androidx.datastore:datastore-preferences-core"),

        //        datastore_preferences_core_iosarm64(moduleName = "androidx.datastore:datastore-preferences-core-iosarm64"),
//        datastore_preferences_core_iossimulatorarm64(moduleName = "androidx.datastore:datastore-preferences-core-iossimulatorarm64"),
//        datastore_preferences_core_iosx64(moduleName = "androidx.datastore:datastore-preferences-core-iosx64"),
//        datastore_preferences_core_jvm(moduleName = "androidx.datastore:datastore-preferences-core-jvm"),
//        datastore_preferences_core_linuxx64(moduleName = "androidx.datastore:datastore-preferences-core-linuxx64"),
//        datastore_preferences_core_macosarm64(moduleName = "androidx.datastore:datastore-preferences-core-macosarm64"),
//        datastore_preferences_core_macosx64(moduleName = "androidx.datastore:datastore-preferences-core-macosx64"),
//        datastore_preferences_iosarm64(moduleName = "androidx.datastore:datastore-preferences-iosarm64"),
//        datastore_preferences_iossimulatorarm64(moduleName = "androidx.datastore:datastore-preferences-iossimulatorarm64"),
//        datastore_preferences_iosx64(moduleName = "androidx.datastore:datastore-preferences-iosx64"),
//        datastore_preferences_jvm(moduleName = "androidx.datastore:datastore-preferences-jvm"),
//        datastore_preferences_linuxx64(moduleName = "androidx.datastore:datastore-preferences-linuxx64"),
//        datastore_preferences_macosarm64(moduleName = "androidx.datastore:datastore-preferences-macosarm64"),
//        datastore_preferences_macosx64(moduleName = "androidx.datastore:datastore-preferences-macosx64"),
        datastore_preferences_rxjava2(moduleName = "androidx.datastore:datastore-preferences-rxjava2"),
        datastore_preferences_rxjava3(moduleName = "androidx.datastore:datastore-preferences-rxjava3"),
        datastore_rxjava2(moduleName = "androidx.datastore:datastore-rxjava2"),
        datastore_rxjava3(moduleName = "androidx.datastore:datastore-rxjava3")
    }

    enum class DocumentFile(
        internal val moduleName: String
    ) : AndroidX {
        documentfile(moduleName = "androidx.documentfile:documentfile")
    }

    enum class DragAndDrop(
        internal val moduleName: String
    ) : AndroidX {
        draganddrop(moduleName = "androidx.draganddrop:draganddrop")
    }

    enum class DrawerLayout(
        internal val moduleName: String
    ) : AndroidX {
        drawerlayout(moduleName = "androidx.drawerlayout:drawerlayout")
    }

    enum class DynamicAnimation(
        internal val moduleName: String
    ) : AndroidX {
        dynamicanimation(moduleName = "androidx.dynamicanimation:dynamicanimation"),
        dynamicanimation_ktx(moduleName = "androidx.dynamicanimation:dynamicanimation-ktx")
    }

    enum class Emoji(
        internal val moduleName: String
    ) : AndroidX {
        emoji(moduleName = "androidx.emoji:emoji"),
        emoji_appcompat(moduleName = "androidx.emoji:emoji-appcompat"),
        emoji_bundled(moduleName = "androidx.emoji:emoji-bundled")
    }

    enum class Emoji2(
        internal val moduleName: String
    ) : AndroidX {
        emoji2(moduleName = "androidx.emoji2:emoji2"),
        emoji2_bundled(moduleName = "androidx.emoji2:emoji2-bundled"),
        emoji2_emojipicker(moduleName = "androidx.emoji2:emoji2-emojipicker"),
        emoji2_views(moduleName = "androidx.emoji2:emoji2-views"),
        emoji2_views_helper(moduleName = "androidx.emoji2:emoji2-views-helper"),
    }

    enum class ExifInterface(
        internal val moduleName: String
    ) : AndroidX {
        exifinterface(moduleName = "androidx.exifinterface:exifinterface")
    }

    enum class Fragment(
        internal val moduleName: String
    ) : AndroidX {
        fragment(moduleName = "androidx.fragment:fragment"),
        fragment_ktx(moduleName = "androidx.fragment:fragment-ktx"),
        fragment_testing(moduleName = "androidx.fragment:fragment-testing"),
        fragment_testing_manifest(moduleName = "androidx.fragment:fragment-testing-manifest");
    }

    enum class Glance(
        internal val moduleName: String
    ) : AndroidX {
        glance(moduleName = "androidx.glance:glance"),
        glance_appwidget(moduleName = "androidx.glance:glance-appwidget"),

        //        glance_appwidget_proto(moduleName = "androidx.glance:glance-appwidget-proto"),
        glance_material(moduleName = "androidx.glance:glance-material"),
        glance_material3(moduleName = "androidx.glance:glance-material3"),
        glance_wear_tiles(moduleName = "androidx.glance:glance-wear-tiles")
    }

    enum class GridLayout(
        internal val moduleName: String
    ) : AndroidX {
        gridlayout(moduleName = "androidx.gridlayout:gridlayout")
    }

    enum class Hilt(
        internal val moduleName: String
    ) : AndroidX {
        hilt_common(moduleName = "androidx.hilt:hilt-common"),
        hilt_compiler(moduleName = "androidx.hilt:hilt-compiler"),

        //        hilt_lifecycle_viewmodel(moduleName = "androidx.hilt:hilt-lifecycle-viewmodel"),
        hilt_navigation(moduleName = "androidx.hilt:hilt-navigation"),
        hilt_navigation_compose(moduleName = "androidx.hilt:hilt-navigation-common"),
        hilt_navigation_fragment(moduleName = "androidx.hilt:hilt-navigation-fragment"),
        hilt_work(moduleName = "androidx.hilt:hilt-work"),
    }

    enum class Lifecycle(
        internal val moduleName: String
    ) : AndroidX {
        lifecycle_common("androidx.lifecycle:lifecycle-common"),
        lifecycle_common_java8("androidx.lifecycle:lifecycle-common-java8"),
        lifecycle_compiler("androidx.lifecycle:lifecycle-compiler"),

        //        lifecycle_extensions("androidx.lifecycle:lifecycle-extensions"),
        lifecycle_livedata("androidx.lifecycle:lifecycle-livedata"),
        lifecycle_livedata_core("androidx.lifecycle:lifecycle-livedata-core"),
        lifecycle_livedata_core_ktx("androidx.lifecycle:lifecycle-livedata-core-ktx"),
        lifecycle_livedata_ktx("androidx.lifecycle:lifecycle-livedata-ktx"),
        lifecycle_process("androidx.lifecycle:lifecycle-process"),
        lifecycle_reactivestreams("androidx.lifecycle:lifecycle-reactivestreams"),
        lifecycle_reactivestreams_ktx("androidx.lifecycle:lifecycle-reactivestreams-ktx"),
        lifecycle_runtime("androidx.lifecycle:lifecycle-runtime"),
        lifecycle_runtime_compose("androidx.lifecycle:lifecycle-runtime-compose"),
        lifecycle_runtime_ktx("androidx.lifecycle:lifecycle-runtime-ktx"),
        lifecycle_runtime_testing("androidx.lifecycle:lifecycle-runtime-testing"),
        lifecycle_service("androidx.lifecycle:lifecycle-service"),
        lifecycle_viewmodel("androidx.lifecycle:lifecycle-viewmodel"),
        lifecycle_viewmodel_compose("androidx.lifecycle:lifecycle-viewmodel-compose"),
        lifecycle_viewmodel_ktx("androidx.lifecycle:lifecycle-viewmodel-ktx"),
        lifecycle_viewmodel_savedstate("androidx.lifecycle:lifecycle-viewmodel-savedstate");
    }

    enum class Media(
        internal val moduleName: String
    ) : AndroidX {
        media(moduleName = "androidx.media:media"),
        media_widget(moduleName = "androidx.media:media-widget"),
    }

    enum class Media2(
        internal val moduleName: String
    ) : AndroidX {
        //        media2(moduleName = "androidx.media2:media2"),
        media2_common(moduleName = "androidx.media2:media2-common"),
        media2_exoplayer(moduleName = "androidx.media2:media2-exoplayer"),
        media2_player(moduleName = "androidx.media2:media2-player"),
        media2_session(moduleName = "androidx.media2:media2-session"),
        media2_widget(moduleName = "androidx.media2:media2-widget")
    }

    enum class Media3(
        internal val moduleName: String
    ) : AndroidX {
        media3_cast(moduleName = "androidx.media3:media3-cast"),
        media3_common(moduleName = "androidx.media3:media3-common"),
        media3_container(moduleName = "androidx.media3:media3-container"),
        media3_database(moduleName = "androidx.media3:media3-database"),
        media3_datasource(moduleName = "androidx.media3:media3-datasource"),
        media3_datasource_cronet(moduleName = "androidx.media3:media3-datasource-cronet"),
        media3_datasource_okhttp(moduleName = "androidx.media3:media3-datasource-okhttp"),
        media3_datasource_rtmp(moduleName = "androidx.media3:media3-datasource-rtmp"),
        media3_decoder(moduleName = "androidx.media3:media3-decoder"),
        media3_effect(moduleName = "androidx.media3:media3-effect"),
        media3_exoplayer(moduleName = "androidx.media3:media3-exoplayer"),
        media3_exoplayer_dash(moduleName = "androidx.media3:media3-exoplayer-dash"),
        media3_exoplayer_hls(moduleName = "androidx.media3:media3-exoplayer-hls"),
        media3_exoplayer_ima(moduleName = "androidx.media3:media3-exoplayer-ima"),
        media3_exoplayer_midi(moduleName = "androidx.media3:media3-exoplayer-midi"),
        media3_exoplayer_rtmp(moduleName = "androidx.media3:media3-exoplayer-rtsp"),
        media3_exoplayer_smoothstreaming(moduleName = "androidx.media3:media3-exoplayer-smoothstreaming"),
        media3_exoplayer_workmanager(moduleName = "androidx.media3:media3-exoplayer-workmanager"),
        media3_extractor(moduleName = "androidx.media3:media3-extractor"),
        media3_muxer(moduleName = "androidx.media3:media3-muxer"),
        media3_session(moduleName = "androidx.media3:media3-session"),
        media3_test_utils(moduleName = "androidx.media3:media3-test-utils"),
        media3_test_utils_robolectric(moduleName = "androidx.media3:media3-test-utils-robolectric"),
        media3_transformer(moduleName = "androidx.media3:media3-transformer"),
        media3_ui(moduleName = "androidx.media3:media3-ui"),
        media3_ui_leanback(moduleName = "androidx.media3:media3-ui-leanback")
    }

    enum class MediaRouter(
        internal val moduleName: String
    ) : AndroidX {
        mediarouter(moduleName = "androidx.mediarouter:mediarouter"),
        mediarouter_testing(moduleName = "androidx.mediarouter:mediarouter-testing")
    }

    enum class Navigation(
        internal val moduleName: String
    ) : AndroidX {
        navigation_common(moduleName = "androidx.navigation:navigation-common"),
        navigation_common_ktx(moduleName = "androidx.navigation:navigation-common-ktx"),
        navigation_compose(moduleName = "androidx.navigation:navigation-compose"),
        navigation_dynamic_features_fragment(moduleName = "androidx.navigation:navigation-dynamic-features-fragment"),
        navigation_dynamic_features_runtime(moduleName = "androidx.navigation:navigation-dynamic-features-runtime"),
        navigation_fragment(moduleName = "androidx.navigation:navigation-fragment"),
        navigation_fragment_ktx(moduleName = "androidx.navigation:navigation-fragment-ktx"),
        navigation_runtime(moduleName = "androidx.navigation:navigation-runtime"),
        navigation_runtime_ktx(moduleName = "androidx.navigation:navigation-runtime-ktx"),
        navigation_runtime_safe_args_generator(moduleName = "androidx.navigation:navigation-safe-args-generator"),
        navigation_runtime_safe_args_gradle_plugin(moduleName = "androidx.navigation:navigation-safe-args-gradle-plugin"),
        navigation_runtime_testing(moduleName = "androidx.navigation:navigation-testing"),
        navigation_runtime_ui(moduleName = "androidx.navigation:navigation-ui"),
        navigation_runtime_ui_ktx(moduleName = "androidx.navigation:navigation-ui-ktx");
    }

    enum class Paging(
        internal val moduleName: String
    ) : AndroidX {
        paging_common(moduleName = "androidx.paging:paging-common"),
        paging_common_ktx(moduleName = "androidx.paging:paging-common-ktx"),

        //        paging_common_android(moduleName = "androidx.paging:paging-common-android"),
        //        paging_common_iosarm64(moduleName = "androidx.paging:paging-common-iosarm64"),
        //        paging_common_iossimulatorarm64(moduleName = "androidx.paging:paging-common-iossimulatorarm64"),
        //        paging_common_iosx64(moduleName = "androidx.paging:paging-common-iosx64"),
        //        paging_common_jvm(moduleName = "androidx.paging:paging-common-jvm"),
        //        paging_common_linuxx64(moduleName = "androidx.paging:paging-common-linuxx64"),
        //        paging_common_macosarm64(moduleName = "androidx.paging:paging-common-macosarm64"),
        //        paging_common_macosx64(moduleName = "androidx.paging:paging-common-macosx64"),
        paging_compose(moduleName = "androidx.paging:paging-compose"),

        //        paging_compose_android(moduleName = "androidx.paging:paging-compose-android"),
        paging_guava(moduleName = "androidx.paging:paging-guava"),
        paging_runtime(moduleName = "androidx.paging:paging-runtime"),
        paging_runtime_ktx(moduleName = "androidx.paging:paging-runtime-ktx"),
        paging_rxjava2(moduleName = "androidx.paging:paging-rxjava2"),
        paging_rxjava2_ktx(moduleName = "androidx.paging:paging-rxjava2-ktx"),
        paging_rxjava3(moduleName = "androidx.paging:paging-rxjava3"),
        paging_testing(moduleName = "androidx.paging:paging-testing");
        //        paging_testing_android(moduleName = "androidx.paging:paging-testing-android"),
        //        paging_testing_iosarm64(moduleName = "androidx.paging:paging-testing-iosarm64"),
        //        paging_testing_iossimulatorarm64(moduleName = "androidx.paging:paging-testing-iossimulatorarm64"),
        //        paging_testing_iosx64(moduleName = "androidx.paging:paging-testing-iosx64"),
        //        paging_testing_jvm(moduleName = "androidx.paging:paging-testing-jvm"),
        //        paging_testing_linuxx64(moduleName = "androidx.paging:paging-testing-linuxx64"),
        //        paging_testing_macosarm64(moduleName = "androidx.paging:paging-testing-macosarm64"),
        //        paging_testing_macosx64(moduleName = "androidx.paging:paging-testing-macosx64")
    }

    enum class Preference(
        internal val moduleName: String
    ) : AndroidX {
        preference(moduleName = "androidx.preference:preference"),
        preference_ktx(moduleName = "androidx.preference:preference-ktx")
    }

    enum class ProfileInstaller(
        internal val moduleName: String
    ) : AndroidX {
        profileinstaller(moduleName = "androidx.profileinstaller:profileinstaller")
    }

    enum class RecyclerView(
        internal val moduleName: String
    ) : AndroidX {
        recyclerview(moduleName = "androidx.recyclerview:recyclerview");
//    recyclerview_selection("androidx.recyclerview:recyclerview-selection")
    }

    enum class Room(
        internal val moduleName: String
    ) : AndroidX {
        androidx_room_gradle_plugin(moduleName = "androidx.room:androidx.room.gradle.plugin"),
        room_common(moduleName = "androidx.room:room-common"),
        room_compiler(moduleName = "androidx.room:room-compiler"),
        room_compiler_processing(moduleName = "androidx.room:room-compiler-processing"),
        room_compiler_processing_testing(moduleName = "androidx.room:room-compiler-processing-testing"),

        //    room_coroutines(moduleName = "androidx.room:room-coroutines"),
        room_gradle_plugin(moduleName = "androidx.room:room-gradle-plugin"),
        room_guava(moduleName = "androidx.room:room-guava"),
        room_ktx(moduleName = "androidx.room:room-ktx"),
        room_migration(moduleName = "androidx.room:room-migration"),
        room_paging(moduleName = "androidx.room:room-paging"),
        room_paging_guava(moduleName = "androidx.room:room-paging-guava"),
        room_paging_rxjava2(moduleName = "androidx.room:room-paging-rxjava2"),
        room_paging_rxjava3(moduleName = "androidx.room:room-paging-rxjava3"),
        room_runtime(moduleName = "androidx.room:room-runtime"),
        room_rxjava2(moduleName = "androidx.room:room-rxjava2"),
        room_rxjava3(moduleName = "androidx.room:room-rxjava3"),
        room_testing(moduleName = "androidx.room:room-testing");
    }

    enum class SavedState(
        internal val moduleName: String
    ) : AndroidX {
        savedstate(moduleName = "androidx.savedstate:savedstate"),
        savedstate_ktx(moduleName = "androidx.savedstate:savedstate-ktx"),
    }

    enum class SQLite(
        internal val moduleName: String
    ) : AndroidX {
        sqlite(moduleName = "androidx.sqlite:sqlite"),
        sqlite_framework(moduleName = "androidx.sqlite:sqlite-framework"),
        sqlite_ktx(moduleName = "androidx.sqlite:sqlite-ktx")
    }

    enum class SwipeRefreshLayout(
        internal val moduleName: String
    ) : AndroidX {
        swiperefreshlayout(moduleName = "androidx.swiperefreshlayout:swiperefreshlayout")
    }

    sealed interface Test : AndroidX {

        enum class Annotation(
            internal val moduleName: String
        ) : AndroidX {
            test_annotation(moduleName = "androidx.test:annotation");
        }

        enum class Core(
            internal val moduleName: String
        ) : AndroidX {
            core(moduleName = "androidx.test:core"),
            core_ktx(moduleName = "androidx.test:core-ktx");
        }

        enum class Monitor(
            internal val moduleName: String
        ) : AndroidX {
            monitor(moduleName = "androidx.test:monitor");
        }

        enum class Orchestrator(
            internal val moduleName: String
        ) : AndroidX {
            orchestrator(moduleName = "androidx.test:orchestrator");
        }

        enum class Rules(
            internal val moduleName: String
        ) : AndroidX {
            rules(moduleName = "androidx.test:rules");
        }

        enum class Runner(
            internal val moduleName: String
        ) : AndroidX {
            runner("androidx.test:runner");
        }

        sealed interface Espresso : Test {

            enum class Espresso(
                internal val moduleName: String
            ) : MainEspresso {
                espresso_accessibility(moduleName = "androidx.test.espresso:espresso-accessibility"),
                espresso_contrib(moduleName = "androidx.test.espresso:espresso-contrib"),
                espresso_core(moduleName = "androidx.test.espresso:espresso-core"),

                //    espresso_device(moduleName = "androidx.test.espresso:espresso-device"),
                espresso_idling_resource(moduleName = "androidx.test.espresso:espresso-idling-resource"),
                espresso_intents(moduleName = "androidx.test.espresso:espresso-intents"),
                espresso_remote(moduleName = "androidx.test.espresso:espresso-remote"),
                espresso_web(moduleName = "androidx.test.espresso:espresso-web");
            }

            enum class EspressoDevice(
                internal val moduleName: String
            ) : MainEspresso {
                espresso_device(moduleName = "androidx.test.espresso:espresso-device");
            }

            enum class Idling(
                internal val moduleName: String
            ) : MainEspresso {
                idling_concurrent(moduleName = "androidx.test.espresso.idling:idling-concurrent"),
                idling_net(moduleName = "androidx.test.espresso.idling:idling-net");
            }
        }

        sealed interface Ext {

            enum class JUnit(
                internal val moduleName: String
            ) : AndroidX {
                junit(moduleName = "androidx.test.ext:junit"),
                junit_ktx(moduleName = "androidx.test.ext:junit-ktx")
            }

            enum class JUnitGTest(
                internal val moduleName: String
            ) : AndroidX {
                junit_gtest(moduleName = "androidx.test.ext:junit-gtest");
            }

            enum class Truth(
                internal val moduleName: String
            ) : AndroidX {
                truth(moduleName = "androidx.test.ext:truth");
            }
        }

        enum class Services(
            internal val moduleName: String
        ) : AndroidX {
            storage(moduleName = "androidx.test.services:storage"),
            test_services(moduleName = "androidx.test.services:test-services")
        }
    }

    sealed interface Tracing : AndroidX {

        enum class Tracing(
            internal val moduleName: String
        ) : AndroidX {
            tracing(moduleName = "androidx.tracing:tracing"),
            tracing_ktx(moduleName = "androidx.tracing:tracing-ktx")
        }

        enum class TracingPerfetto(
            internal val moduleName: String
        ) : AndroidX {
            tracing_perfetto(moduleName = "androidx.tracing:tracing-perfetto"),
            tracing_perfetto_binary(moduleName = "androidx.tracing:tracing-perfetto-binary"),

            //            tracing_perfetto_common(moduleName = "androidx.tracing:tracing-perfetto"),
            tracing_perfetto_handshake(moduleName = "androidx.tracing:tracing-perfetto-handshake"),
        }
    }

    enum class Transition(
        internal val moduleName: String
    ) : AndroidX {
        transition(moduleName = "androidx.transition:transition"),
        transition_ktx(moduleName = "androidx.transition:transition-ktx")
    }

    enum class ViewPager(
        internal val moduleName: String
    ) : AndroidX {
        viewpager(moduleName = "androidx.viewpager:viewpager")
    }

    enum class ViewPager2(
        internal val moduleName: String
    ) : AndroidX {
        viewpager2(moduleName = "androidx.viewpager2:viewpager2")
    }

    enum class Webkit(
        internal val moduleName: String
    ) : AndroidX {
        webkit(moduleName = "androidx.webkit:webkit")
    }

    sealed interface Window {
        enum class Window(
            internal val moduleName: String
        ) : AndroidX {
            window("androidx.window:window"),
            window_core("androidx.window:window-core"),

            //        window_core_android("androidx.window:window-core-android"),
            window_core_jvm("androidx.window:window-core-jvm"),
            window_extensions("androidx.window:window-extensions"),
            window_java("androidx.window:window-java"),
            window_rxjava2("androidx.window:window-rxjava2"),
            window_rxjava3("androidx.window:window-rxjava3"),
            window_testing("androidx.window:window-testing")
        }

        enum class WindowExtensionsCore(
            internal val moduleName: String
        ) : AndroidX {
            core(moduleName = "androidx.window.extensions.core:core")
        }
    }

    enum class Work(
        internal val moduleName: String
    ) : AndroidX {
        work_gcm(moduleName = "androidx.work:work-gcm"),
        work_multiprocess(moduleName = "androidx.work:work-multiprocess"),
        work_runtime(moduleName = "androidx.work:work-runtime"),
        work_runtime_ktx(moduleName = "androidx.work:work-runtime-ktx"),
        work_rxjava2(moduleName = "androidx.work:work-rxjava2"),
        work_rxjava3(moduleName = "androidx.work:work-rxjava3"),
        work_testing(moduleName = "androidx.work:work-testing")
    }

}

private typealias MainEspresso = AndroidX.Test.Espresso
private typealias MainFoundation = AndroidX.Compose.Foundation
private typealias MainRuntime = AndroidX.Compose.Runtime
private typealias MainMaterial3 = AndroidX.Compose.Material3
