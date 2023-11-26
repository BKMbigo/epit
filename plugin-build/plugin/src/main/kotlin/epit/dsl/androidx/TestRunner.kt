package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class TestRunner(
    internal val moduleName: String
) : AndroidXDependency {
    runner("androidx.test:runner")
}

class EpitAndroidXTestRunnerScope(
    private val androidXTestCoreVersion: String
) {
    val TestRunner.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    fun TestRunner.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(testRunner: TestRunner) {
        add("implementation", testRunner.dependency)
    }
}
