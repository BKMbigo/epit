package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
