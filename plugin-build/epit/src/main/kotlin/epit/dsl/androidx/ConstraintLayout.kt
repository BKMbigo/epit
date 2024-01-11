package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutScope internal constructor(
    private val androidXConstraintLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout
        get() = AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString(version)


    internal val AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutVersion


    internal fun AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
