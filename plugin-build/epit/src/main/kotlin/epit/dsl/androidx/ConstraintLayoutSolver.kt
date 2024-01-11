package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    /* Internal Functions */

    internal val AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutSolverVersion


    internal fun AndroidX.ConstraintLayout.ConstraintLayoutSolver.dependencyAsString(version: String) =
        moduleName joinWithColon version
}
