package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutCoreScope internal constructor(
    private val androidXConstraintLayoutCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout_core
        get() = AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout_core(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependencyAsString(version)

    /* Internal Functions */

    internal val AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutCoreVersion

    internal fun AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString(version: String) =
        moduleName joinWithColon version
}
