package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXBrowserScope internal constructor(
    private val androidxBrowserVersion: String
) {

    @ExperimentalEpitApi
    val Epit.browser
        get() = AndroidX.Browser.browser.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.browser(version: String) =
        AndroidX.Browser.browser.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Browser.dependencyAsString
        get() = moduleName joinWithColon androidxBrowserVersion

    internal fun AndroidX.Browser.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
