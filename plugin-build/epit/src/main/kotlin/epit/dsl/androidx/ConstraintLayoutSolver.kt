package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutSolverScope internal constructor(
    private val androidXConstraintLayoutSolverVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutSolverVersion

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutSolver: AndroidX.ConstraintLayout.ConstraintLayoutSolver) {
        add("implementation", constraintLayoutSolver.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
