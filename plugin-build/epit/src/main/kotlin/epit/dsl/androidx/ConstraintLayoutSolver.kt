package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope


@ExperimentalEpitApi
class EpitAndroidXConstraintLayoutSolverScope(
    private val androidXConstraintLayoutSolverVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutSolverVersion}"

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutSolver: AndroidX.ConstraintLayout.ConstraintLayoutSolver) {
        add("implementation", constraintLayoutSolver.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
