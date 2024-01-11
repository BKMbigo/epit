package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutScope internal constructor(
    private val androidXConstraintLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout
        get() = AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayout.constraintlayout.dependencyAsString(version)

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayout: AndroidX.ConstraintLayout.ConstraintLayout) {
        add("implementation", constraintLayout.dependencyAsString)
    }
}
