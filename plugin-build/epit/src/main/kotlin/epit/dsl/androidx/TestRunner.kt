package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class TestRunner(
    internal val moduleName: String
) : AndroidXDependency {
    runner("androidx.test:runner")
}

@ExperimentalEpitApi
class EpitAndroidXTestRunnerScope(
    private val androidXTestCoreVersion: String
) {
    @ExperimentalEpitApi
    val TestRunner.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    @ExperimentalEpitApi
    fun TestRunner.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testRunner: TestRunner) {
        add("implementation", testRunner.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
