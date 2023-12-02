package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestRunnerScope(
    private val androidXTestCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Runner.dependency
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Runner.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(runner: AndroidX.Test.Runner) {
        add("implementation", runner.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
