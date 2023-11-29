package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestRulesScope(
    private val androidXTestRulesVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestRules.dependency
        get(): String = moduleName joinWithColon androidXTestRulesVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.TestRules.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testRules: AndroidX.Test.TestRules) {
        add("implementation", testRules.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
