package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXHiltScope internal constructor(
    private val androidxHiltVersion: String
) {

    @ExperimentalEpitApi
    val Epit.hilt_common
        get() = AndroidX.Hilt.hilt_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_common(version: String) =
        AndroidX.Hilt.hilt_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.hilt_compiler
        get() = AndroidX.Hilt.hilt_compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_compiler(version: String) =
        AndroidX.Hilt.hilt_compiler.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.hilt_navigation
        get() = AndroidX.Hilt.hilt_navigation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_navigation(version: String) =
        AndroidX.Hilt.hilt_navigation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.hilt_navigation_compose
        get() = AndroidX.Hilt.hilt_navigation_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_navigation_compose(version: String) =
        AndroidX.Hilt.hilt_navigation_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.hilt_hilt_navigation_fragmentcommon
        get() = AndroidX.Hilt.hilt_navigation_fragment.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_navigation_fragment(version: String) =
        AndroidX.Hilt.hilt_navigation_fragment.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.hilt_work
        get() = AndroidX.Hilt.hilt_work.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.hilt_work(version: String) =
        AndroidX.Hilt.hilt_work.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Hilt.dependencyAsString
        get() = moduleName joinWithColon androidxHiltVersion

    internal fun AndroidX.Hilt.dependencyAsString(version: String) =
        moduleName joinWithColon version

}

