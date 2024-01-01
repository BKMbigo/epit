package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
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


    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString
        get(): String = moduleName joinWithColon androidXConstraintLayoutComposeVersion

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCompose: AndroidX.ConstraintLayout.ConstraintLayoutCompose) {
        add("implementation", constraintLayoutCompose.dependencyAsString)
    }
}
