package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeBomScope internal constructor(
    internal val composeBOMVersion: String
) {

    /* androidx.compose.animation:animation */
    @ExperimentalEpitApi
    val Epit.animation
        get() = AndroidX.Compose.Animation.animation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation(version: String) = AndroidX.Compose.Animation.animation.dependencyAsString(version)

    /* androidx.compose.animation:animation-core */
    @ExperimentalEpitApi
    val Epit.animation_core
        get() = AndroidX.Compose.Animation.animation_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_core(version: String) = AndroidX.Compose.Animation.animation_core.dependencyAsString(version)

    /* androidx.compose.animation:animation-graphics */
    @ExperimentalEpitApi
    val Epit.animation_graphics
        get() = AndroidX.Compose.Animation.animation_graphics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_graphics(version: String) =
        AndroidX.Compose.Animation.animation_graphics.dependencyAsString(version)

    /* androidx.compose.animation:animation-tooling-internal */
    @ExperimentalEpitApi
    val Epit.animation_tooling_internal
        get() = AndroidX.Compose.Animation.animation_tooling_internal.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_tooling_internal(version: String) =
        AndroidX.Compose.Animation.animation_tooling_internal.dependencyAsString(version)

    /*
    * Compiler
    * */
    /* androidx.compose.compiler:compiler */
    @ExperimentalEpitApi
    val Epit.compiler
        get() = AndroidX.Compose.Compiler.compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler(version: String) = AndroidX.Compose.Compiler.compiler.dependencyAsString(version)

    /* androidx.compose.compiler:compiler-daemon */
    @ExperimentalEpitApi
    val Epit.compiler_daemon
        get() = AndroidX.Compose.Compiler.compiler_daemon.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler_daemon(version: String) = AndroidX.Compose.Compiler.compiler_daemon.dependencyAsString(version)

    /* androidx.compose.compiler:compiler-hosted */
    @ExperimentalEpitApi
    val Epit.compiler_hosted
        get() = AndroidX.Compose.Compiler.compiler_hosted.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler_hosted(version: String) = AndroidX.Compose.Compiler.compiler_hosted.dependencyAsString(version)

    /*
    * Foundation
    * */

    @ExperimentalEpitApi
    val Epit.foundation
        get() = AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.foundation(version: String) = AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.foundation_layout
        get() = AndroidX.Compose.Foundation.Foundation.foundation_layout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.foundation_layout(version: String) =
        AndroidX.Compose.Foundation.Foundation.foundation_layout.dependencyAsString(version)

    /*
    * Material
    * */

    @ExperimentalEpitApi
    val Epit.material
        get() = AndroidX.Compose.Material.material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material(version: String) =
        AndroidX.Compose.Material.material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_icons_core
        get() = AndroidX.Compose.Material.material_icons_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_icons_core(version: String) =
        AndroidX.Compose.Material.material_icons_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_icons_extended
        get() = AndroidX.Compose.Material.material_icons_extended.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_icons_extended(version: String) =
        AndroidX.Compose.Material.material_icons_extended.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_ripple
        get() = AndroidX.Compose.Material.material_ripple.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_ripple(version: String) =
        AndroidX.Compose.Material.material_ripple.dependencyAsString(version)

    /*
    * Material 3
    * */

    /* androidx.compose.material3:material3 */
    @ExperimentalEpitApi
    val Epit.material3
        get() = AndroidX.Compose.Material3.Material3.material3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3(version: String) =
        AndroidX.Compose.Material3.Material3.material3.dependencyAsString(version)

    /* androidx.compose.material3:material3-window-size-class */
    @ExperimentalEpitApi
    val Epit.material3_window_size_class
        get() = AndroidX.Compose.Material3.Material3.material3_window_size_class.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3_window_size_class(version: String) =
        AndroidX.Compose.Material3.Material3.material3_window_size_class.dependencyAsString(version)

    /*
    * Runtime
    * */

    @ExperimentalEpitApi
    val Epit.runtime
        get() = AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_livedata
        get() = AndroidX.Compose.Runtime.Runtime.runtime_livedata.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_livedata(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_livedata.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_rxjava2
        get() = AndroidX.Compose.Runtime.Runtime.runtime_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_rxjava2(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_rxjava3
        get() = AndroidX.Compose.Runtime.Runtime.runtime_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_rxjava3(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_saveable
        get() = AndroidX.Compose.Runtime.Runtime.runtime_saveable.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_saveable(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_saveable.dependencyAsString(version)

    /*
    * UI
    * */

    @ExperimentalEpitApi
    val Epit.ui
        get() = AndroidX.Compose.UI.ui.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui(version: String) =
        AndroidX.Compose.UI.ui.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_android_stubs
        get() = AndroidX.Compose.UI.ui_android_stubs.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_android_stubs(version: String) =
        AndroidX.Compose.UI.ui_android_stubs.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_graphics
        get() = AndroidX.Compose.UI.ui_graphics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_graphics(version: String) =
        AndroidX.Compose.UI.ui_graphics.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_test
        get() = AndroidX.Compose.UI.ui_test.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_test(version: String) =
        AndroidX.Compose.UI.ui_test.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_test_junit4
        get() = AndroidX.Compose.UI.ui_test_junit4.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_test_junit4(version: String) =
        AndroidX.Compose.UI.ui_test_junit4.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_test_manifest
        get() = AndroidX.Compose.UI.ui_test_manifest.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_test_manifest(version: String) =
        AndroidX.Compose.UI.ui_test_manifest.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_text
        get() = AndroidX.Compose.UI.ui_text.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_text(version: String) =
        AndroidX.Compose.UI.ui_text.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_text_google_fonts
        get() = AndroidX.Compose.UI.ui_text_google_fonts.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_text_google_fonts(version: String) =
        AndroidX.Compose.UI.ui_text_google_fonts.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_tooling
        get() = AndroidX.Compose.UI.ui_tooling.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_tooling(version: String) =
        AndroidX.Compose.UI.ui_tooling.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_tooling_data
        get() = AndroidX.Compose.UI.ui_tooling_data.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_tooling_data(version: String) =
        AndroidX.Compose.UI.ui_tooling_data.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_tooling_preview
        get() = AndroidX.Compose.UI.ui_tooling_preview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_tooling_preview(version: String) =
        AndroidX.Compose.UI.ui_tooling_preview.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_unit
        get() = AndroidX.Compose.UI.ui_unit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_unit(version: String) =
        AndroidX.Compose.UI.ui_unit.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_util
        get() = AndroidX.Compose.UI.ui_util.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_util(version: String) =
        AndroidX.Compose.UI.ui_util.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ui_viewbinding
        get() = AndroidX.Compose.UI.ui_viewbinding.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ui_viewbinding(version: String) =
        AndroidX.Compose.UI.ui_viewbinding.dependencyAsString(version)


    /*
    * ===============================
    * ===== Internal Functions ======
    * ===============================
    * */

    /** Returns platform(bom) */
    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    /* Returns bom as a string */
    @ExperimentalEpitApi
    val bomAsString = AndroidX.Compose.Bom.compose_bom.moduleName joinWithColon composeBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = AndroidX.Compose.Bom.compose_bom.moduleName joinWithColon customVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.ComposeBomDependency.dependencyAsString
        get() = this.moduleName

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(compose: AndroidX.Compose.ComposeBomDependency) {
        add("implementation", compose.moduleName)
    }
}

