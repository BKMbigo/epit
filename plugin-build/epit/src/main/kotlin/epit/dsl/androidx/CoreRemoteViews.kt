package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreRemoteViewsScope internal constructor(
    private val androidXCoreRemoteViewsVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRemoteViews.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRemoteViewsVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRemoteViews.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRemoteViews: AndroidX.Core.CoreRemoteViews) {
        add("implementation", coreRemoteViews.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
