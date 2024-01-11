package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
@EpitDsl
object EpitAndroidxGeneralConstraintLayoutScope {

    @ExperimentalEpitApi
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

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralConstraintLayoutScope.constraintlayoutCore(
        constraintLayoutCoreVersion: String,
        block: EpitAndroidXConstraintLayoutCoreScope.() -> Unit
    ) {
        block(EpitAndroidXConstraintLayoutCoreScope(constraintLayoutCoreVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralConstraintLayoutScope.constraintlayoutSolver(
        constraintLayoutSolverVersion: String,
        block: EpitAndroidXConstraintLayoutSolverScope.() -> Unit
    ) {
        block(EpitAndroidXConstraintLayoutSolverScope(constraintLayoutSolverVersion))
    }
}
