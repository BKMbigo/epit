package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutSolverScope internal constructor(
    private val androidXConstraintLayoutSolverVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout_solver
        get() = AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout_solver(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayoutSolver.constraintlayout_solver.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutSolverVersion

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutSolver: AndroidX.ConstraintLayout.ConstraintLayoutSolver) {
        add("implementation", constraintLayoutSolver.dependencyAsString)
    }
}
