package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXDrawerLayoutScope internal constructor(
    private val androidXDrawerLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.drawerlayout
        get() = AndroidX.DrawerLayout.drawerlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.drawerlayout(version: String) =
        AndroidX.DrawerLayout.drawerlayout.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DrawerLayout.dependencyAsString
        get() = moduleName joinWithColon androidXDrawerLayoutVersion

    internal fun AndroidX.DrawerLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
