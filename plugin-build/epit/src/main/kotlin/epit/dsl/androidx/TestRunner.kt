package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestRunnerScope(
    private val androidXTestCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestRunner.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Test.TestRunner.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testRunner: AndroidX.Test.TestRunner) {
        add("implementation", testRunner.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
