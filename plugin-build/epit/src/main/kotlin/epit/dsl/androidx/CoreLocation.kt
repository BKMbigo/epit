package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreLocationScope internal constructor(
    private val androidXCoreLocationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreLocation.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreLocationVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreLocation.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreLocation: AndroidX.Core.CoreLocation) {
        add("implementation", coreLocation.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
