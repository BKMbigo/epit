package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxWebkitScope internal constructor(
    private val androidxWebkitVersion: String
) {

    @ExperimentalEpitApi
    val Epit.webkit
        get() = AndroidX.Webkit.webkit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.webkit(version: String) =
        AndroidX.Webkit.webkit.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Webkit.dependencyAsString
        get() = moduleName joinWithColon androidxWebkitVersion

    internal fun AndroidX.Webkit.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
