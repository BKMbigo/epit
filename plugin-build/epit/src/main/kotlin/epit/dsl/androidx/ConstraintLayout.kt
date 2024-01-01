package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutVersion

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayout: AndroidX.ConstraintLayout.ConstraintLayout) {
        add("implementation", constraintLayout.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
