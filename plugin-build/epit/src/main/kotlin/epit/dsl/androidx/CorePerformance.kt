package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCorePerformanceScope internal constructor(
    private val androidXCorePerformanceVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CorePerformance.dependencyAsString
        get(): String = moduleName joinWithColon androidXCorePerformanceVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CorePerformance.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(corePerformance: AndroidX.Core.CorePerformance) {
        add("implementation", corePerformance.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
