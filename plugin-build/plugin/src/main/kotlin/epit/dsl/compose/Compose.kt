package epit.dsl.compose

import epit.EpitDependency

sealed class Compose(
    internal open val moduleName: String
): EpitDependency {

    internal object compose_bom : Compose("androidx.compose:compose-bom")

    sealed class ComposeAnimation(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object animation : ComposeAnimation(moduleName = "androidx.compose.animation:animation")
        object animation_android : ComposeAnimation(moduleName = "androidx.compose.animation:animation-android")
        object animation_core : ComposeAnimation(moduleName = "androidx.compose.animation:animation-core")
        object animation_core_android :
            ComposeAnimation(moduleName = "androidx.compose.animation:animation-core-android")

        object animation_core_desktop : ComposeAnimation(moduleName = "androidx.compose.animation:animation-desktop")
        object animation_desktop : ComposeAnimation(moduleName = "androidx.compose.animation:animation-desktop")
        object animation_graphics : ComposeAnimation(moduleName = "androidx.compose.animation:animation-graphics")
        object animation_graphics_android :
            ComposeAnimation(moduleName = "androidx.compose.animation:animation-graphics-android")

        object animation_graphics_desktop :
            ComposeAnimation(moduleName = "androidx.compose.animation:animation-graphics-desktop")

        object animation_tooling_internal :
            ComposeAnimation(moduleName = "androidx.compose.animation:animation-tooling-internal")
    }

    sealed class ComposeCompiler(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object compiler : ComposeCompiler(moduleName = "androidx.compose.compiler:compiler")
        object compiler_daemon : ComposeCompiler(moduleName = "androidx.compose.compiler:compiler-daemon")
        object compiler_hosted : ComposeCompiler(moduleName = "androidx.compose.compiler:compiler-hosted")
    }

    sealed class ComposeFoundation(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object foundation : ComposeFoundation(moduleName = "androidx.compose.foundation:foundation")
        object foundation_android : ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-android")
        object foundation_desktop : ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-desktop")
        object foundation_layout : ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-layout")
        object foundation_layout_android :
            ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-layout-android")

        object foundation_layout_desktop :
            ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-desktop")
    }

    sealed class ComposeFoundationText(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object foundation_text : ComposeFoundation(moduleName = "androidx.compose.foundation:foundation-text")
    }

    sealed class ComposeMaterial(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object material : ComposeMaterial(moduleName = "androidx.compose.material:material")
        object material_android : ComposeMaterial(moduleName = "androidx.compose.material:material-android")
        object material_desktop : ComposeMaterial(moduleName = "androidx.compose.material:material-desktop")
        object material_icons_core : ComposeMaterial(moduleName = "androidx.compose.material:material-icons-core")
        object material_icons_core_android :
            ComposeMaterial(moduleName = "androidx.compose.material:material-icons-core-android")

        object material_icons_core_desktop :
            ComposeMaterial(moduleName = "androidx.compose.material:material-icons-core-desktop")

        object material_icons_extended :
            ComposeMaterial(moduleName = "androidx.compose.material:material-icons-extended")

        object material_icons_extended_android :
            ComposeMaterial(moduleName = "androidx.compose.material:material-icons-extended-android")

        object material_icons_extended_desktop :
            ComposeMaterial(moduleName = "androidx.compose.material:material-icons-extended-desktop")

        object material_ripple : ComposeMaterial(moduleName = "androidx.compose.material:material-ripple")
        object material_ripple_android :
            ComposeMaterial(moduleName = "androidx.compose.material:material-ripple-android")

        object material_ripple_desktop :
            ComposeMaterial(moduleName = "androidx.compose.material:material-ripple-desktop")
    }

    sealed class ComposeMaterial3(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object material3 : ComposeMaterial3("androidx.compose.material3:material3")
        object material3_android : ComposeMaterial3("androidx.compose.material3:material3-android")
        object material3_desktop : ComposeMaterial3("androidx.compose.material3:material3-desktop")
        object material3_window_size_class : ComposeMaterial3("androidx.compose.material3:material3-window-size-class")
        object material3_window_size_class_android :
            ComposeMaterial3("androidx.compose.material3:material3-window-size-class-android")

        object material3_window_size_class_desktop :
            ComposeMaterial3("androidx.compose.material3:material3-window-size-class-desktop")
    }

    sealed class ComposeMaterial3Adaptive(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object material3_adaptive : ComposeMaterial3("androidx.compose.material3:material3-adaptive")
        object material3_adaptive_android : ComposeMaterial3("androidx.compose.material3:material3-adaptive-android")
        object material3_adaptive_desktop : ComposeMaterial3("androidx.compose.material3:material3-adaptive-desktop")
        object material3_adaptive_navigation_suite :
            ComposeMaterial3("androidx.compose.material3:material3-adaptive-navigation-suite")

        object material3_adaptive_navigation_suite_android :
            ComposeMaterial3("androidx.compose.material3:material3-adaptive-navigation-suite-android")

        object material3_adaptive_navigation_suite_desktop :
            ComposeMaterial3("androidx.compose.material3:material3-adaptive-navigation-suite-desktop")

    }

    sealed class ComposeRuntime(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object runtime : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime")
        object runtime_android : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-android")
        object runtime_desktop : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-desktop")

        //        object runtime_dispatch : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-dispatch")
        object runtime_livedata : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-livedata")
        object runtime_rxjava2 : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-rxjava2")
        object runtime_rxjava3 : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-rxjava3")
        object runtime_saveable : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-saveable")
        object runtime_saveable_android :
            ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-saveable-android")

        object runtime_saveable_desktop :
            ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-saveable-desktop")
    }

    sealed class ComposeRuntimeSavedInstanceState(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object runtime_saved_instance_state :
            ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-saved-instance-state")
    }

    sealed class ComposeRuntimeTracing(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object runtime_tracing : ComposeRuntime(moduleName = "androidx.compose.runtime:runtime-tracing")
    }

    sealed class ComposeUI(
        override val moduleName: String
    ) : Compose(moduleName = moduleName) {
        object ui : ComposeUI("androidx.compose.ui:ui")
        object ui_android : ComposeUI("androidx.compose.ui:ui-android")
        object ui_android_stubs : ComposeUI("androidx.compose.ui:ui-android-stubs")
        object ui_desktop : ComposeUI("androidx.compose.ui:ui-desktop")
        object ui_geometry : ComposeUI("androidx.compose.ui:ui-goemetry")
        object ui_geometry_android : ComposeUI("androidx.compose.ui:ui-geometry")
        object ui_geometry_desktop : ComposeUI("androidx.compose.ui:ui-geometry-desktop")
        object ui_graphics : ComposeUI("androidx.compose.ui:ui-graphics")
        object ui_graphics_android : ComposeUI("androidx.compose.ui:ui-graphics-android")
        object ui_graphics_desktop : ComposeUI("androidx.compose.ui:ui-graphics-desktop")
        object ui_test : ComposeUI("androidx.compose.ui:ui-ui-test")
        object ui_test_android : ComposeUI("androidx.compose.ui:ui-test-android")
        object ui_test_desktop : ComposeUI("androidx.compose.ui:ui-test-desktop")
        object ui_test_junit4 : ComposeUI("androidx.compose.ui:ui-test-junit4")
        object ui_test_junit4_android : ComposeUI("androidx.compose.ui:ui-test-junit4-android")
        object ui_test_junit4_desktop : ComposeUI("androidx.compose.ui:ui-test-junit4-desktop")
        object ui_test_manifest : ComposeUI("androidx.compose.ui:ui-test-manifest")
        object ui_text : ComposeUI("androidx.compose.ui:ui-text")
        object ui_text_android : ComposeUI("androidx.compose.ui:ui-ui-text-android")
        object ui_text_desktop : ComposeUI("androidx.compose.ui:ui-text-desktop")
        object ui_text_google_fonts : ComposeUI("androidx.compose.ui:ui-text-google-fonts")
        object ui_tooling : ComposeUI("androidx.compose.ui:ui-tooling")
        object ui_tooling_android : ComposeUI("androidx.compose.ui:ui-tooling-android")
        object ui_tooling_data : ComposeUI("androidx.compose.ui:ui-tooling-data")
        object ui_tooling_data_android : ComposeUI("androidx.compose.ui:ui-tooling-data-android")
        object ui_tooling_data_desktop : ComposeUI("androidx.compose.ui:ui-tooling-data-desktop")
        object ui_tooling_desktop : ComposeUI("androidx.compose.ui:ui-tooling-desktop")
        object ui_tooling_preview : ComposeUI("androidx.compose.ui:ui-tooling-preview")
        object ui_tooling_preview_android : ComposeUI("androidx.compose.ui:ui-tooling-preview-android")
        object ui_tooling_preview_desktop : ComposeUI("androidx.compose.ui:ui-tooling-preview-desktop")
        object ui_unit : ComposeUI("androidx.compose.ui:ui-unit")
        object ui_unit_android : ComposeUI("androidx.compose.ui:ui-unit-android")
        object ui_unit_desktop : ComposeUI("androidx.compose.ui:ui-unit-desktop")
        object ui_util : ComposeUI("androidx.compose.ui:ui-util")
        object ui_util_android : ComposeUI("androidx.compose.ui:ui-util-android")
        object ui_util_desktop : ComposeUI("androidx.compose.ui:ui-util-desktop")
        object ui_viewbinding : ComposeUI("androidx.compose.ui:ui-viewbinding")
    }

}
