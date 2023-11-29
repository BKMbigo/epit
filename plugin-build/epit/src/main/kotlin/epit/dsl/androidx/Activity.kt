package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXActivityScope(
    private val androidXActivityVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Activity.dependency
        get(): String = "${this.moduleName}:${androidXActivityVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Activity.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(activity: AndroidX.Activity) {
        add("implementation", activity.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
