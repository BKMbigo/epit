package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreRemoteViewsScope(
    private val androidXCoreRemoteViewsVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRemoteViews.dependency
        get(): String = "${this.moduleName}:${androidXCoreRemoteViewsVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRemoteViews.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRemoteViews: AndroidX.Core.CoreRemoteViews) {
        add("implementation", coreRemoteViews.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
