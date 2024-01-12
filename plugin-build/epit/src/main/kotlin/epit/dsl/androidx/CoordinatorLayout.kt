package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXCoordinatorLayoutScope internal constructor(
    private val androidXCoordinatorLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.coordinatorlayout
        get() = AndroidX.CoordinatorLayout.coordinatorlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coordinatorlayout(version: String) =
        AndroidX.CoordinatorLayout.coordinatorlayout.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.CoordinatorLayout.dependencyAsString
        get() = moduleName joinWithColon androidXCoordinatorLayoutVersion

    internal fun AndroidX.CoordinatorLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
