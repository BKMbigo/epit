package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreSpashscreenScope internal constructor(
    private val androidXCoreVersion: String
) {

    /* androidx.core:core-splashscreen */
    @ExperimentalEpitApi
    val Epit.core_splashscreen
        get() = AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_splashscreen(version: String) =
        AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Core.CoreSplashscreen.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    internal fun AndroidX.Core.CoreSplashscreen.dependencyAsString(version: String) = moduleName joinWithColon version

}
