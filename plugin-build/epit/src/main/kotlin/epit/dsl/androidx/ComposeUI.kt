package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeUIScope internal constructor(
    private val androidXComposeUIVersion: String
) {

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
    * ==================================
    * ====== Internal Functions ========
    * ==================================
    * */

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.UI.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeUIVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.UI.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeUI: AndroidX.Compose.UI) {
        add("implementation", composeUI.dependencyAsString)
    }
}
