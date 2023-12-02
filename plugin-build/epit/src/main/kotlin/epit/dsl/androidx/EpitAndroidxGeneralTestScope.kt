package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
object EpitAndroidxGeneralTestScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.annotation(
        testAnnotationVersion: String,
        block: EpitAndroidXTestAnnotationScope.() -> Unit
    ) {
        block(EpitAndroidXTestAnnotationScope(testAnnotationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.core(testCoreVersion: String, block: EpitAndroidXTestCoreScope.() -> Unit) {
        block(EpitAndroidXTestCoreScope(testCoreVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.monitor(
        testMonitorVersion: String,
        block: EpitAndroidXTestMonitorScope.() -> Unit
    ) {
        block(EpitAndroidXTestMonitorScope(testMonitorVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.orchestrator(
        testOrchestratorVersion: String,
        block: EpitAndroidXTestOrchestratorScope.() -> Unit
    ) {
        block(EpitAndroidXTestOrchestratorScope(testOrchestratorVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.rules(testRulesVersion: String, block: EpitAndroidXTestRulesScope.() -> Unit) {
        block(EpitAndroidXTestRulesScope(testRulesVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.runner(
        testRunnerVersion: String,
        block: EpitAndroidXTestRunnerScope.() -> Unit
    ) {
        block(EpitAndroidXTestRunnerScope(testRunnerVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.espresso(block: EpitAndroidxGeneralEspressoScope.() -> Unit) {
        block(EpitAndroidxGeneralEspressoScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestScope.ext(block: EpitAndroidxGeneralTestExtScope.() -> Unit) {
        block(EpitAndroidxGeneralTestExtScope)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
