package epit.dsl.google

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Google
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitGoogleAccompanistScope internal constructor(
    private val accompanistVersion: String
) {

    @ExperimentalEpitApi
    val Epit.accompanist_permissions
        get() = Google.Accompanist.accompanist_permissions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_permissions(version: String): String =
        Google.Accompanist.accompanist_permissions.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_navigation_material
        get() = Google.Accompanist.accompanist_navigation_material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_navigation_material(version: String): String =
        Google.Accompanist.accompanist_navigation_material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_drawablepainter
        get() = Google.Accompanist.accompanist_drawablepainter.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_drawablepainter(version: String): String =
        Google.Accompanist.accompanist_drawablepainter.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_adaptive
        get() = Google.Accompanist.accompanist_adaptive.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_adaptive(version: String): String =
        Google.Accompanist.accompanist_adaptive.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_systemuicontroller
        get() = Google.Accompanist.accompanist_systemuicontroller.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_systemuicontroller(version: String): String =
        Google.Accompanist.accompanist_systemuicontroller.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_webview
        get() = Google.Accompanist.accompanist_webview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_webview(version: String): String =
        Google.Accompanist.accompanist_webview.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_themeadapter_material3
        get() = Google.Accompanist.accompanist_themeadapter_material3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_themeadapter_material3(version: String): String =
        Google.Accompanist.accompanist_themeadapter_material3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_themeadapter_material
        get() = Google.Accompanist.accompanist_themeadapter_material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_themeadapter_material(version: String): String =
        Google.Accompanist.accompanist_themeadapter_material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_themeadapter_core
        get() = Google.Accompanist.accompanist_themeadapter_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_themeadapter_core(version: String): String =
        Google.Accompanist.accompanist_themeadapter_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_themeadapter_appcompat
        get() = Google.Accompanist.accompanist_themeadapter_appcompat.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_themeadapter_appcompat(version: String): String =
        Google.Accompanist.accompanist_themeadapter_appcompat.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_testharness
        get() = Google.Accompanist.accompanist_testharness.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_testharness(version: String): String =
        Google.Accompanist.accompanist_testharness.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_swiperefresh
        get() = Google.Accompanist.accompanist_swiperefresh.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_swiperefresh(version: String): String =
        Google.Accompanist.accompanist_swiperefresh.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_placeholder_material3
        get() = Google.Accompanist.accompanist_placeholder_material3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_placeholder_material3(version: String): String =
        Google.Accompanist.accompanist_placeholder_material3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_placeholder_material
        get() = Google.Accompanist.accompanist_placeholder_material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_placeholder_material(version: String): String =
        Google.Accompanist.accompanist_placeholder_material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_placeholder
        get() = Google.Accompanist.accompanist_placeholder.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_placeholder(version: String): String =
        Google.Accompanist.accompanist_placeholder.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_pager_indicators
        get() = Google.Accompanist.accompanist_pager_indicators.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_pager_indicators(version: String): String =
        Google.Accompanist.accompanist_pager_indicators.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_pager
        get() = Google.Accompanist.accompanist_pager.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_pager(version: String): String =
        Google.Accompanist.accompanist_pager.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_navigation_animation
        get() = Google.Accompanist.accompanist_navigation_animation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_navigation_animation(version: String): String =
        Google.Accompanist.accompanist_navigation_animation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_insets_ui
        get() = Google.Accompanist.accompanist_insets_ui.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_insets_ui(version: String): String =
        Google.Accompanist.accompanist_insets_ui.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_flowlayout
        get() = Google.Accompanist.accompanist_flowlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_flowlayout(version: String): String =
        Google.Accompanist.accompanist_flowlayout.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.accompanist_appcompat_theme
        get() = Google.Accompanist.accompanist_appcompat_theme.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.accompanist_appcompat_theme(version: String): String =
        Google.Accompanist.accompanist_appcompat_theme.dependencyAsString(version)

    /* Internal functions */

    internal val Google.Accompanist.dependencyAsString
        get(): String = moduleName joinWithColon accompanistVersion

    internal fun Google.Accompanist.dependencyAsString(version: String) = moduleName joinWithColon version

}
