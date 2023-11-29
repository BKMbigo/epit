package epit.dsl.compose

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
sealed interface Compose : EpitDependency {

    @ExperimentalEpitApi
    enum class ComposeAnimation(
        internal val moduleName: String
    ) : Compose {
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

    @ExperimentalEpitApi
    enum class ComposeBom(
        internal val moduleName: String
    ) : Compose {
        compose_bom("androidx.compose:compose-bom")
    }

    @ExperimentalEpitApi
    enum class ComposeCompiler(
        internal val moduleName: String
    ) : Compose {
        compiler(moduleName = "androidx.compose.compiler:compiler"),
        compiler_daemon(moduleName = "androidx.compose.compiler:compiler-daemon"),
        compiler_hosted(moduleName = "androidx.compose.compiler:compiler-hosted")
    }

    @ExperimentalEpitApi
    enum class ComposeFoundation(
        internal val moduleName: String
    ) : Compose {
        foundation(moduleName = "androidx.compose.foundation:foundation"),
//        foundation_android(moduleName = "androidx.compose.foundation:foundation-android"),
//        foundation_desktop(moduleName = "androidx.compose.foundation:foundation-desktop"),
        foundation_layout(moduleName = "androidx.compose.foundation:foundation-layout"),
//        foundation_layout_android(moduleName = "androidx.compose.foundation:foundation-layout-android"),
//        foundation_layout_desktop(moduleName = "androidx.compose.foundation:foundation-desktop")
    }

    @ExperimentalEpitApi
    enum class ComposeFoundationText(
        internal val moduleName: String
    ) : Compose {
        foundation_text(moduleName = "androidx.compose.foundation:foundation-text")
    }

    @ExperimentalEpitApi
    enum class ComposeMaterial(
        internal val moduleName: String
    ) : Compose {
        material(moduleName = "androidx.compose.material:material"),
//        material_android(moduleName = "androidx.compose.material:material-android"),
//        material_desktop(moduleName = "androidx.compose.material:material-desktop"),
        material_icons_core(moduleName = "androidx.compose.material:material-icons-core"),
//        material_icons_core_android(moduleName = "androidx.compose.material:material-icons-core-android"),
//        material_icons_core_desktop(moduleName = "androidx.compose.material:material-icons-core-desktop"),
        material_icons_extended(moduleName = "androidx.compose.material:material-icons-extended"),
//        material_icons_extended_android(moduleName = "androidx.compose.material:material-icons-extended-android"),
//        material_icons_extended_desktop(moduleName = "androidx.compose.material:material-icons-extended-desktop"),
        material_ripple(moduleName = "androidx.compose.material:material-ripple"),
//        material_ripple_android(moduleName = "androidx.compose.material:material-ripple-android"),
//        material_ripple_desktop(moduleName = "androidx.compose.material:material-ripple-desktop")
    }

    @ExperimentalEpitApi
    enum class ComposeMaterial3(
        internal val moduleName: String
    ) : Compose {
        material3("androidx.compose.material3:material3"),
//        material3_android("androidx.compose.material3:material3-android"),
//        material3_desktop("androidx.compose.material3:material3-desktop"),
        material3_window_size_class("androidx.compose.material3:material3-window-size-class"),
//        material3_window_size_class_android("androidx.compose.material3:material3-window-size-class-android"),
//        material3_window_size_class_desktop("androidx.compose.material3:material3-window-size-class-desktop")
    }

    @ExperimentalEpitApi
    enum class ComposeMaterial3Adaptive(
        internal val moduleName: String
    ) : Compose {
        material3_adaptive("androidx.compose.material3:material3-adaptive"),
//        material3_adaptive_android("androidx.compose.material3:material3-adaptive-android"),
//        material3_adaptive_desktop("androidx.compose.material3:material3-adaptive-desktop"),
        material3_adaptive_navigation_suite("androidx.compose.material3:material3-adaptive-navigation-suite"),
//        material3_adaptive_navigation_suite_android("androidx.compose.material3:material3-adaptive-navigation-suite-android"),
//        material3_adaptive_navigation_suite_desktop("androidx.compose.material3:material3-adaptive-navigation-suite-desktop")
    }

    @ExperimentalEpitApi
    enum class ComposeRuntime(
        internal val moduleName: String
    ) : Compose {
        runtime(moduleName = "androidx.compose.runtime:runtime"),
//        runtime_android(moduleName = "androidx.compose.runtime:runtime-android"),
//        runtime_desktop(moduleName = "androidx.compose.runtime:runtime-desktop"),
//        runtime_dispatch(moduleName = "androidx.compose.runtime:runtime-dispatch"),
        runtime_livedata(moduleName = "androidx.compose.runtime:runtime-livedata"),
        runtime_rxjava2(moduleName = "androidx.compose.runtime:runtime-rxjava2"),
        runtime_rxjava3(moduleName = "androidx.compose.runtime:runtime-rxjava3"),
        runtime_saveable(moduleName = "androidx.compose.runtime:runtime-saveable"),
//        runtime_saveable_android(moduleName = "androidx.compose.runtime:runtime-saveable-android"),
//        runtime_saveable_desktop(moduleName = "androidx.compose.runtime:runtime-saveable-desktop")
    }

    @ExperimentalEpitApi
    enum class ComposeRuntimeSavedInstanceState(
        internal val moduleName: String
    ) : Compose {
        runtime_saved_instance_state(moduleName = "androidx.compose.runtime:runtime-saved-instance-state")
    }

    @ExperimentalEpitApi
    enum class ComposeRuntimeTracing(
        internal val moduleName: String
    ) : Compose {
        runtime_tracing(moduleName = "androidx.compose.runtime:runtime-tracing")
    }

    @ExperimentalEpitApi
    enum class ComposeUI(
        internal val moduleName: String
    ) : Compose {
        ui("androidx.compose.ui:ui"),
//        ui_android("androidx.compose.ui:ui-android"),
        ui_android_stubs("androidx.compose.ui:ui-android-stubs"),
//        ui_desktop("androidx.compose.ui:ui-desktop"),
        ui_geometry("androidx.compose.ui:ui-goemetry"),
//        ui_geometry_android("androidx.compose.ui:ui-geometry"),
//        ui_geometry_desktop("androidx.compose.ui:ui-geometry-desktop"),
        ui_graphics("androidx.compose.ui:ui-graphics"),
//        ui_graphics_android("androidx.compose.ui:ui-graphics-android"),
//        ui_graphics_desktop("androidx.compose.ui:ui-graphics-desktop"),
        ui_test("androidx.compose.ui:ui-ui-test"),
//        ui_test_android("androidx.compose.ui:ui-test-android"),
//        ui_test_desktop("androidx.compose.ui:ui-test-desktop"),
        ui_test_junit4("androidx.compose.ui:ui-test-junit4"),
//        ui_test_junit4_android("androidx.compose.ui:ui-test-junit4-android"),
//        ui_test_junit4_desktop("androidx.compose.ui:ui-test-junit4-desktop"),
        ui_test_manifest("androidx.compose.ui:ui-test-manifest"),
        ui_text("androidx.compose.ui:ui-text"),
//        ui_text_android("androidx.compose.ui:ui-ui-text-android"),
//        ui_text_desktop("androidx.compose.ui:ui-text-desktop"),
        ui_text_google_fonts("androidx.compose.ui:ui-text-google-fonts"),
        ui_tooling("androidx.compose.ui:ui-tooling"),
//        ui_tooling_android("androidx.compose.ui:ui-tooling-android"),
        ui_tooling_data("androidx.compose.ui:ui-tooling-data"),
//        ui_tooling_data_android("androidx.compose.ui:ui-tooling-data-android"),
//        ui_tooling_data_desktop("androidx.compose.ui:ui-tooling-data-desktop"),
//        ui_tooling_desktop("androidx.compose.ui:ui-tooling-desktop"),
        ui_tooling_preview("androidx.compose.ui:ui-tooling-preview"),
//        ui_tooling_preview_android("androidx.compose.ui:ui-tooling-preview-android"),
//        ui_tooling_preview_desktop("androidx.compose.ui:ui-tooling-preview-desktop"),
        ui_unit("androidx.compose.ui:ui-unit"),
//        ui_unit_android("androidx.compose.ui:ui-unit-android"),
//        ui_unit_desktop("androidx.compose.ui:ui-unit-desktop"),
        ui_util("androidx.compose.ui:ui-util"),
//        ui_util_android("androidx.compose.ui:ui-util-android"),
//        ui_util_desktop("androidx.compose.ui:ui-util-desktop"),
        ui_viewbinding("androidx.compose.ui:ui-viewbinding")
    }

}

@OptIn(ExperimentalEpitApi::class)
internal val Compose.moduleName: String
    get() = when (this) {
        is Compose.ComposeAnimation -> moduleName
        is Compose.ComposeBom -> moduleName
        is Compose.ComposeCompiler -> moduleName
        is Compose.ComposeFoundation -> moduleName
        is Compose.ComposeFoundationText -> moduleName
        is Compose.ComposeMaterial -> moduleName
        is Compose.ComposeMaterial3 -> moduleName
        is Compose.ComposeMaterial3Adaptive -> moduleName
        is Compose.ComposeRuntime -> moduleName
        is Compose.ComposeRuntimeSavedInstanceState -> moduleName
        is Compose.ComposeRuntimeTracing -> moduleName
        is Compose.ComposeUI -> moduleName
    }
