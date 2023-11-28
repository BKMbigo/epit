package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
sealed interface AndroidX : EpitDependency {

    enum class Activity(
        internal val moduleName: String
    ) : AndroidX {
        activity("androidx.activity:activity"),
        activity_compose("androidx.activity:activity-compose"),
        activity_ktx("androidx.activity:activity-ktx")
    }

    enum class Appcompat(
        internal val moduleName: String
    ) : AndroidX {
        appcompat(moduleName = "androidx.appcompat:appcompat"),
        appcompat_resources("androidx.appcompat:appcompat-resources")
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
        camera_view("androidx.camera:camera-view"),
//    camera_viewfinder("androidx.camera:camera-viewfinder")
    }

    enum class ConstraintLayout(
        internal val moduleName: String
    ) : AndroidX {
        constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout"),
//    constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose"),
//    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android"),
//    constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core"),
//    constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver")
    }

    enum class ConstraintLayoutCompose(
        internal val moduleName: String
    ) : AndroidX {
        //    constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout"),
        constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose"),
        constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android"),
//    constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core"),
//    constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver")
    }

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
        core_testing(moduleName = "androidx.core:core-testing")
    }

    enum class CoreSplashscreen(
        internal val moduleName: String
    ) : AndroidX {
        //    object core: Core(moduleName = "androidx.core:core")
//    object core_animation: Core(moduleName = "androidx.core:core-animation")
//    object core_animation_testing: Core(moduleName = "androidx.core:core-animation-testing")
//    object core_google_shortcuts: Core(moduleName = "androidx.core:core-google-shortcuts")
//    object core_i18n: Core(moduleName = "androidx.core:core-i18n")
//    object core_ktx: Core(moduleName = "androidx.core:core-ktx")
//    object core_location_altitude: Core(moduleName = "androidx.core:core-location-altitude")
//    object core_performance: Core(moduleName = "androidx.core:core-performance")
//    object core_performance_play_services: Core(moduleName = "androidx.core:core-performance-play-services")
//    object core_performance_testing: Core(moduleName = "androidx.core:core-performance-testing")
//    object core_remoteviews: Core(moduleName = "androidx.core:core-remoteviews")
//    object core_role: Core(moduleName = "androidx.core:core-role")
        core_splashscreen(moduleName = "androidx.core:core-splashscreen")
//    object core_telecom: Core(moduleName = "androidx.core:core-telecom")
//    object core_testing: Core(moduleName = "androidx.core:core-testing")
    }

    enum class Fragment(
        internal val moduleName: String
    ) : AndroidX {
        fragment(moduleName = "androidx.fragment:fragment"),
        fragment_ktx(moduleName = "androidx.fragment:fragment-ktx"),
        fragment_testing(moduleName = "androidx.fragment:fragment-testing"),
        fragment_testing_manifest(moduleName = "androidx.fragment:fragment-testing-manifest"),
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
        lifecycle_viewmodel_savedstate("androidx.lifecycle:lifecycle-viewmodel-savedstate")
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
        navigation_runtime_ui_ktx(moduleName = "androidx.navigation:navigation-ui-ktx")
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
        paging_compose_android(moduleName = "androidx.paging:paging-compose-android"),
        paging_guava(moduleName = "androidx.paging:paging-guava"),
        paging_runtime(moduleName = "androidx.paging:paging-runtime"),
        paging_runtime_ktx(moduleName = "androidx.paging:paging-runtime-ktx"),
        paging_rxjava2(moduleName = "androidx.paging:paging-rxjava2"),
        paging_rxjava2_ktx(moduleName = "androidx.paging:paging-rxjava2-ktx"),
        paging_rxjava3(moduleName = "androidx.paging:paging-rxjava3"),
        paging_testing(moduleName = "androidx.paging:paging-testing"),
        //        paging_testing_android(moduleName = "androidx.paging:paging-testing-android"),
        //        paging_testing_iosarm64(moduleName = "androidx.paging:paging-testing-iosarm64"),
        //        paging_testing_iossimulatorarm64(moduleName = "androidx.paging:paging-testing-iossimulatorarm64"),
        //        paging_testing_iosx64(moduleName = "androidx.paging:paging-testing-iosx64"),
        //        paging_testing_jvm(moduleName = "androidx.paging:paging-testing-jvm"),
        //        paging_testing_linuxx64(moduleName = "androidx.paging:paging-testing-linuxx64"),
        //        paging_testing_macosarm64(moduleName = "androidx.paging:paging-testing-macosarm64"),
        //        paging_testing_macosx64(moduleName = "androidx.paging:paging-testing-macosx64")
    }

    enum class RecyclerView(
        internal val moduleName: String
    ) : AndroidX {
        recyclerview(moduleName = "androidx.recyclerview:recyclerview"),
//    recyclerview_selection("androidx.recyclerview:recyclerview-selection")
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
        room_testing(moduleName = "androidx.room:room-testing")
    }

    @ExperimentalEpitApi
    enum class TestCore(
        internal val moduleName: String
    ) : AndroidX {
        core(moduleName = "androidx.test:core"),
        core_ktx(moduleName = "androidx.test:core-ktx")
    }

    enum class TestRules(
        internal val moduleName: String
    ) : AndroidX {
        rules(moduleName = "androidx.test:rules")
    }

    enum class TestRunner(
        internal val moduleName: String
    ) : AndroidX {
        runner("androidx.test:runner")
    }


    @ExperimentalEpitApi
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
        espresso_web(moduleName = "androidx.test.espresso:espresso-web")
    }


}
