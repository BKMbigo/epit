package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Activity(
    internal val moduleName: String
) : AndroidXDependency {
    activity("androidx.activity:activity"),
    activity_compose("androidx.activity:activity-compose"),
    activity_ktx("androidx.activity:activity-ktx")
}

class EpitAndroidXActivityScope(
    private val androidXActivityVersion: String
) {
    val Activity.dependency
        get(): String = "${this.moduleName}:${androidXActivityVersion}"

    fun Activity.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(activity: Activity) {
        add("implementation", activity.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
