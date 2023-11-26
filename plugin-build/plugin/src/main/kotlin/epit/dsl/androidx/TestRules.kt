package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class TestRules(
    internal val moduleName: String
) : AndroidXDependency {
    rules(moduleName = "androidx.test:rules")
}

class EpitAndroidXTestRulesScope(
    private val androidXTestRulesVersion: String
) {
    val TestRules.dependency
        get(): String = "${this.moduleName}:${androidXTestRulesVersion}"

    fun TestRules.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(testRules: TestRules) {
        add("implementation", testRules.dependency)
    }
}
