package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestRulesScope internal constructor(
    private val androidXTestRulesVersion: String
) {

    @ExperimentalEpitApi
    val Epit.rules
        get() = AndroidX.Test.Rules.rules.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.rules(version: String) =
        AndroidX.Test.Rules.rules.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.Test.Rules.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestRulesVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Rules.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(rules: AndroidX.Test.Rules) {
        add("implementation", rules.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
