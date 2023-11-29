package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon

@ExperimentalEpitApi
sealed interface AndroidX : EpitDependency {

    enum class Activity(
        internal val moduleName: String
    ) : AndroidX {
        activity("androidx.activity:activity"),
        activity_compose("androidx.activity:activity-compose"),
        activity_ktx("androidx.activity:activity-ktx");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    enum class Appcompat(
        internal val moduleName: String
    ) : AndroidX {
        appcompat(moduleName = "androidx.appcompat:appcompat"),
        appcompat_resources("androidx.appcompat:appcompat-resources");

        override fun withVersion(version: String): String = moduleName joinWithColon version
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

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
    sealed interface Compose : AndroidX {

        sealed interface ComposeBomDependency : Compose

        @ExperimentalEpitApi
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
            animation_tooling_internal(moduleName = "androidx.compose.animation:animation-tooling-internal");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class Bom(
            internal val moduleName: String
        ) : Compose {
            compose_bom("androidx.compose:compose-bom");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class Compiler(
            internal val moduleName: String
        ) : Compose, ComposeBomDependency {
            compiler(moduleName = "androidx.compose.compiler:compiler"),
            compiler_daemon(moduleName = "androidx.compose.compiler:compiler-daemon"),
            compiler_hosted(moduleName = "androidx.compose.compiler:compiler-hosted");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        sealed interface Foundation : Compose {

            @ExperimentalEpitApi
            enum class Foundation(
                internal val moduleName: String
            ) : Compose, ComposeBomDependency {
                foundation(moduleName = "androidx.compose.foundation:foundation"),

                //  foundation_android(moduleName = "androidx.compose.foundation:foundation-android"),
                //  foundation_desktop(moduleName = "androidx.compose.foundation:foundation-desktop"),
                foundation_layout(moduleName = "androidx.compose.foundation:foundation-layout");
                //  foundation_layout_android(moduleName = "androidx.compose.foundation:foundation-layout-android"),
                //  foundation_layout_desktop(moduleName = "androidx.compose.foundation:foundation-desktop")

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }

            @ExperimentalEpitApi
            enum class FoundationText(
                internal val moduleName: String
            ) : Compose {
                foundation_text(moduleName = "androidx.compose.foundation:foundation-text");

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }
        }

        @ExperimentalEpitApi
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

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        sealed interface Material3 {
            @ExperimentalEpitApi
            enum class Material3(
                internal val moduleName: String
            ) : Compose, ComposeBomDependency {
                material3("androidx.compose.material3:material3"),

                //  material3_android("androidx.compose.material3:material3-android"),
                //  material3_desktop("androidx.compose.material3:material3-desktop"),
                material3_window_size_class("androidx.compose.material3:material3-window-size-class");
                //  material3_window_size_class_android("androidx.compose.material3:material3-window-size-class-android"),
                //  material3_window_size_class_desktop("androidx.compose.material3:material3-window-size-class-desktop")

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }

            @ExperimentalEpitApi
            enum class Material3Adaptive(
                internal val moduleName: String
            ) : Compose {
                material3_adaptive("androidx.compose.material3:material3-adaptive"),

                //  material3_adaptive_android("androidx.compose.material3:material3-adaptive-android"),
                //  material3_adaptive_desktop("androidx.compose.material3:material3-adaptive-desktop"),
                material3_adaptive_navigation_suite("androidx.compose.material3:material3-adaptive-navigation-suite");
                //  material3_adaptive_navigation_suite_android("androidx.compose.material3:material3-adaptive-navigation-suite-android"),
                //  material3_adaptive_navigation_suite_desktop("androidx.compose.material3:material3-adaptive-navigation-suite-desktop")

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }
        }

        @ExperimentalEpitApi
        sealed interface Runtime {
            @ExperimentalEpitApi
            enum class Runtime(
                internal val moduleName: String
            ) : Compose, ComposeBomDependency {
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

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }

            @ExperimentalEpitApi
            enum class RuntimeSavedInstanceState(
                internal val moduleName: String
            ) : Compose {
                runtime_saved_instance_state(moduleName = "androidx.compose.runtime:runtime-saved-instance-state");

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }

            @ExperimentalEpitApi
            enum class RuntimeTracing(
                internal val moduleName: String
            ) : Compose {
                runtime_tracing(moduleName = "androidx.compose.runtime:runtime-tracing");

                override fun withVersion(version: String): String = moduleName joinWithColon version
            }
        }

        @ExperimentalEpitApi
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

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

    }

    @ExperimentalEpitApi
    sealed interface ConstraintLayout : AndroidX {

        @ExperimentalEpitApi
        enum class ConstraintLayout(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class ConstraintLayoutCompose(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose");
            //    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android")

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class ConstraintLayoutCore(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class ConstraintLayoutSolver(
            internal val moduleName: String
        ) : AndroidX.ConstraintLayout {
            constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }
    }

    @ExperimentalEpitApi
    sealed interface Core {

        @ExperimentalEpitApi
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

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreAnimation(
            internal val moduleName: String
        ) : AndroidX {
            core_animation(moduleName = "androidx.core:core-animation"),
            core_animation_testing(moduleName = "androidx.core:core-animation-testing");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreGoogleShortcuts(
            internal val moduleName: String
        ) : AndroidX {
            core_google_shortcuts(moduleName = "androidx.core:core-google-shortcuts");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreLocation(
            internal val moduleName: String
        ) : AndroidX {
            core_i18n(moduleName = "androidx.core:core-i18n"),
            core_location_altitude(moduleName = "androidx.core:core-location-altitude");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CorePerformance(
            internal val moduleName: String
        ) : AndroidX {
            core_performance(moduleName = "androidx.core:core-performance"),
            core_performance_play_services(moduleName = "androidx.core:core-performance-play-services"),
            core_performance_testing(moduleName = "androidx.core:core-performance-testing");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreRemoteViews(
            internal val moduleName: String
        ) : AndroidX {
            core_remoteviews(moduleName = "androidx.core:core-remoteviews");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreRole(
            internal val moduleName: String
        ) : AndroidX {
            core_role(moduleName = "androidx.core:core-role");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreSplashscreen(
            internal val moduleName: String
        ) : AndroidX {
            core_splashscreen(moduleName = "androidx.core:core-splashscreen");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class CoreTelecom(
            internal val moduleName: String
        ) : AndroidX {
            core_telecom(moduleName = "androidx.core:core-telecom");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

    }

    enum class Fragment(
        internal val moduleName: String
    ) : AndroidX {
        fragment(moduleName = "androidx.fragment:fragment"),
        fragment_ktx(moduleName = "androidx.fragment:fragment-ktx"),
        fragment_testing(moduleName = "androidx.fragment:fragment-testing"),
        fragment_testing_manifest(moduleName = "androidx.fragment:fragment-testing-manifest");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
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

        override fun withVersion(version: String): String = moduleName joinWithColon version
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

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
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

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    enum class RecyclerView(
        internal val moduleName: String
    ) : AndroidX {
        recyclerview(moduleName = "androidx.recyclerview:recyclerview");
//    recyclerview_selection("androidx.recyclerview:recyclerview-selection")

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
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

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
    sealed interface Test {

        @ExperimentalEpitApi
        enum class TestAnnotation(
            internal val moduleName: String
        ) : AndroidX {
            test_annotation(moduleName = "androidx.test:annotation");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestCore(
            internal val moduleName: String
        ) : AndroidX {
            core(moduleName = "androidx.test:core"),
            core_ktx(moduleName = "androidx.test:core-ktx");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestMonitor(
            internal val moduleName: String
        ) : AndroidX {
            monitor(moduleName = "androidx.test:monitor");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestOrchestrator(
            internal val moduleName: String
        ) : AndroidX {
            orchestrator(moduleName = "androidx.test:orchestrator");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestRules(
            internal val moduleName: String
        ) : AndroidX {
            rules(moduleName = "androidx.test:rules");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestRunner(
            internal val moduleName: String
        ) : AndroidX {
            runner("androidx.test:runner");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }
    }

    enum class TestEspresso(
        internal val moduleName: String
    ) : AndroidX {
        espresso_accessibility(moduleName = "androidx.test.espresso:espresso-accessibility"),
        espresso_contrib(moduleName = "androidx.test.espresso:espresso-contrib"),
        espresso_core(moduleName = "androidx.test.espresso:espresso-core"),

        //    espresso_device(moduleName = "androidx.test.espresso:espresso-device"),
        espresso_idling_resource(moduleName = "androidx.test.espresso:espresso-idling-resource"),
        espresso_intents(moduleName = "androidx.test.espresso:espresso-intents"),
        espresso_remote(moduleName = "androidx.test.espresso:espresso-remote"),
        espresso_web(moduleName = "androidx.test.espresso:espresso-web");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    enum class TestEspressoDevice(
        internal val moduleName: String
    ) : AndroidX {
        espresso_device(moduleName = "androidx.test.espresso:espresso-device");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    enum class TestEspressoIdling(
        internal val moduleName: String
    ) : AndroidX {
        idling_concurrent(moduleName = "androidx.test.espresso.idling:idling-concurrent"),
        idling_net(moduleName = "androidx.test.espresso.idling:idling-net");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
    sealed interface TestExt {
        @ExperimentalEpitApi
        enum class TestExtJUnit(
            internal val moduleName: String
        ) : AndroidX {
            junit(moduleName = "androidx.test.ext:junit"),
            junit_ktx(moduleName = "androidx.test.ext:junit");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestExtJUnitGTest(
            internal val moduleName: String
        ) : AndroidX {
            junit_gtest(moduleName = "androidx.test.ext:junit-gtest");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }

        @ExperimentalEpitApi
        enum class TestExtTruth(
            internal val moduleName: String
        ) : AndroidX {
            truth(moduleName = "androidx.test.ext:truth");

            override fun withVersion(version: String): String = moduleName joinWithColon version
        }
    }
}
