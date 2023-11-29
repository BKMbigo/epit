package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestMonitorScope(
    private val androidXTestMonitorVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestMonitor.dependency
        get(): String = "${this.moduleName}:${androidXTestMonitorVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Test.TestMonitor.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testCore: AndroidX.Test.TestMonitor) {
        add("implementation", testCore.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
