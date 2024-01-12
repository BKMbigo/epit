package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXCardViewScope internal constructor(
    private val androidXCardViewVersion: String
) {

    @ExperimentalEpitApi
    val Epit.cardview
        get() = AndroidX.CardView.cardview.dependencyAsString

    fun Epit.cardview(version: String) =
        AndroidX.CardView.cardview.dependencyAsString(version)

    /*
    * ===========================
    * ==== Internal Function ====
    * ===========================
    * */

    internal val AndroidX.CardView.dependencyAsString
        get() = moduleName joinWithColon androidXCardViewVersion

    internal fun AndroidX.CardView.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
