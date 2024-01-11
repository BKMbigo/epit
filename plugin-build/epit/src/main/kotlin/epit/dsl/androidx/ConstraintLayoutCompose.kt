package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXConstraintLayoutComposeScope internal constructor(
    private val androidXConstraintLayoutComposeVersion: String
) {

    @ExperimentalEpitApi
    val Epit.constraintlayout_compose
        get() = AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.constraintlayout_compose(version: String) =
        AndroidX.ConstraintLayout.ConstraintLayoutCompose.constraintlayout_compose.dependencyAsString(version)

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutComposeVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCompose: AndroidX.ConstraintLayout.ConstraintLayoutCompose) {
        add("implementation", constraintLayoutCompose.dependencyAsString)
    }
}
