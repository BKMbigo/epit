package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

object EpitAndroidxGeneralTestScope {

    fun EpitAndroidxGeneralTestScope.testCore(testCoreVersion: String, block: EpitAndroidXTestCoreScope.() -> Unit) {
        block(EpitAndroidXTestCoreScope(testCoreVersion))
    }

    fun EpitAndroidxGeneralTestScope.testRules(testRulesVersion: String, block: EpitAndroidXTestRulesScope.() -> Unit) {
        block(EpitAndroidXTestRulesScope(testRulesVersion))
    }

    fun EpitAndroidxGeneralTestScope.testRunner(
        testRunnerVersion: String,
        block: EpitAndroidXTestRunnerScope.() -> Unit
    ) {
        block(EpitAndroidXTestRunnerScope(testRunnerVersion))
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
