package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCorePerformanceScope(
    private val androidXCorePerformanceVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CorePerformance.dependency
        get(): String = moduleName joinWithColon androidXCorePerformanceVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CorePerformance.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(corePerformance: AndroidX.Core.CorePerformance) {
        add("implementation", corePerformance.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
