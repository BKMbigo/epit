package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutComposeScope internal constructor(
    private val androidXConstraintLayoutComposeVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout_compose
        get() = AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout_compose(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString(version)

    /* Internal Functions */

    internal val AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutComposeVersion

    internal fun AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString(version: String) =
        moduleName joinWithColon version
}
