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
    val AndroidX.Test.Rules.dependency
        get(): String = moduleName joinWithColon androidXTestRulesVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Rules.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(rules: AndroidX.Test.Rules) {
        add("implementation", rules.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
