package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
object EpitAndroidxGeneralTestScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.testAnnotation(testAnnotationVersion: String, block: EpitAndroidXTestAnnotationScope.() -> Unit) {
        block(EpitAndroidXTestAnnotationScope(testAnnotationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.testCore(testCoreVersion: String, block: EpitAndroidXTestCoreScope.() -> Unit) {
        block(EpitAndroidXTestCoreScope(testCoreVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.testMonitor(testMonitorVersion: String, block: EpitAndroidXTestMonitorScope.() -> Unit) {
        block(EpitAndroidXTestMonitorScope(testMonitorVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.testOrchestrator(testOrchestratorVersion: String, block: EpitAndroidXTestOrchestratorScope.() -> Unit) {
        block(EpitAndroidXTestOrchestratorScope(testOrchestratorVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.testRules(testRulesVersion: String, block: EpitAndroidXTestRulesScope.() -> Unit) {
        block(EpitAndroidXTestRulesScope(testRulesVersion))
    }

    @ExperimentalEpitApi
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
