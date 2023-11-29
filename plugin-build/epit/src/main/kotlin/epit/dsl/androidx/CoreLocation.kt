package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreLocationScope(
    private val androidXCoreLocationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreLocation.dependency
        get(): String = moduleName joinWithColon androidXCoreLocationVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreLocation.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreLocation: AndroidX.Core.CoreLocation) {
        add("implementation", coreLocation.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
