package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Activity(
    internal val moduleName: String
) : AndroidXDependency {
    activity("androidx.activity:activity"),
    activity_compose("androidx.activity:activity-compose"),
    activity_ktx("androidx.activity:activity-ktx")
}

@ExperimentalEpitApi
class EpitAndroidXActivityScope(
    private val androidXActivityVersion: String
) {
    @ExperimentalEpitApi
    val Activity.dependency
        get(): String = "${this.moduleName}:${androidXActivityVersion}"

    @ExperimentalEpitApi
    fun Activity.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(activity: Activity) {
        add("implementation", activity.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
