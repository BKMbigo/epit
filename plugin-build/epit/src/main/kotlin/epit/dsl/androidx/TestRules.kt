package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestRulesScope(
    private val androidXTestRulesVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestRules.dependency
        get(): String = "${this.moduleName}:${androidXTestRulesVersion}"

    @ExperimentalEpitApi
    fun AndroidX.TestRules.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testRules: AndroidX.TestRules) {
        add("implementation", testRules.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
