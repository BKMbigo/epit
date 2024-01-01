package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutCoreScope internal constructor(
    private val androidXConstraintLayoutCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout_core
        get() = AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout_core(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayoutCore.constraintlayout_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCore: AndroidX.ConstraintLayout.ConstraintLayoutCore) {
        add("implementation", constraintLayoutCore.dependencyAsString)
    }
}
