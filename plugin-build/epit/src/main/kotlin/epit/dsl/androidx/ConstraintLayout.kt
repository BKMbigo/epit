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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayout: AndroidX.ConstraintLayout.ConstraintLayout) {
        add("implementation", constraintLayout.dependencyAsString)
    }
}
