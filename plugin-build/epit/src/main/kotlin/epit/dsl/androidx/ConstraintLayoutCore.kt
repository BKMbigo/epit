package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutCoreVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCore.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCore: AndroidX.ConstraintLayout.ConstraintLayoutCore) {
        add("implementation", constraintLayoutCore.dependencyAsString)
    }
}
