package epit.dsl.androidx

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
}
