package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
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

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
