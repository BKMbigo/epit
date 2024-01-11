package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Activity.dependencyAsString
        get(): String = moduleName joinWithColon androidXActivityVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Activity.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The api has been deprecated in favor of the new API. It will be fully deprecated in 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(activity: AndroidX.Activity) {
        add("implementation", activity.dependencyAsString)
    }
}
