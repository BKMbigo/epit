package epit.dsl.androidx

import epit.annotations.ExperimentalEpitApi

object EpitAndroidxGeneralConstraintLayoutScope {

    fun EpitAndroidxGeneralConstraintLayoutScope.constraintlayout(
        constraintLayoutVersion: String,
        block: EpitAndroidXConstraintLayoutScope.() -> Unit
    ) {
        block(EpitAndroidXConstraintLayoutScope(constraintLayoutVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralConstraintLayoutScope.constraintlayoutCompose(
        constraintLayoutComposeVersion: String,
        block: EpitAndroidXConstraintLayoutComposeScope.() -> Unit
    ) {
        block(EpitAndroidXConstraintLayoutComposeScope(constraintLayoutComposeVersion))
    }

}
