package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxSwipeRefreshLayoutScope internal constructor(
    private val androidxSwipeRefreshLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.swiperefreshlayout
        get() = AndroidX.SwipeRefreshLayout.swiperefreshlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.swiperefreshlayout(version: String) =
        AndroidX.SwipeRefreshLayout.swiperefreshlayout.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.SwipeRefreshLayout.dependencyAsString
        get() = moduleName joinWithColon androidxSwipeRefreshLayoutVersion

    internal fun AndroidX.SwipeRefreshLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
