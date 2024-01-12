package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXCustomViewScope internal constructor(
    private val androidxCustomViewVersion: String
) {

    @ExperimentalEpitApi
    val Epit.customview
        get() = AndroidX.CustomView.customview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.customview(version: String) =
        AndroidX.CustomView.customview.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.customview_poolingcontainer
        get() = AndroidX.CustomView.customview_poolingcontainer.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.customview_poolingcontainer(version: String) =
        AndroidX.CustomView.customview_poolingcontainer.dependencyAsString(version)

    /*
    * ===========================
    * ==== Internal Function ====
    * ===========================
    * */

    internal val AndroidX.CustomView.dependencyAsString
        get() = moduleName joinWithColon androidxCustomViewVersion

    internal fun AndroidX.CustomView.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
