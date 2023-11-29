package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCorePerformanceScope(
    private val androidXCorePerformanceVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CorePerformance.dependency
        get(): String = "${this.moduleName}:${androidXCorePerformanceVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CorePerformance.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(corePerformance: AndroidX.Core.CorePerformance) {
        add("implementation", corePerformance.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
