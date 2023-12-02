package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestOrchestratorScope internal constructor(
    private val androidXTestOrchestratorVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Orchestrator.dependency
        get(): String = moduleName joinWithColon androidXTestOrchestratorVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Orchestrator.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(orchestrator: AndroidX.Test.Orchestrator) {
        add("implementation", orchestrator.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
