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
class EpitAndroidXActivityScope internal constructor(
    private val androidXActivityVersion: String
) {
    @ExperimentalEpitApi
    val Epit.activity
        get() = AndroidX.Activity.activity.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.activity(version: String) =
        AndroidX.Activity.activity.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.activity_ktx
        get() = AndroidX.Activity.activity_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.activity_ktx(version: String) =
        AndroidX.Activity.activity_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.activity_compose
        get() = AndroidX.Activity.activity_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.activity_compose(version: String) =
        AndroidX.Activity.activity_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Activity.dependencyAsString
        get(): String = moduleName joinWithColon androidXActivityVersion

    @ExperimentalEpitApi
    fun AndroidX.Activity.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(activity: AndroidX.Activity) {
        add("implementation", activity.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
