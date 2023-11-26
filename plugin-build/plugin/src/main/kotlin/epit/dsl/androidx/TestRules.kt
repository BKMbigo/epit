package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
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

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
