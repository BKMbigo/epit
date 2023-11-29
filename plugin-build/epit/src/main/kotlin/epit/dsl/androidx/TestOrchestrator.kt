package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestOrchestratorScope(
    private val androidXTestOrchestratorVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestOrchestrator.dependency
        get(): String = "${this.moduleName}:${androidXTestOrchestratorVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Test.TestOrchestrator.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testCore: AndroidX.Test.TestOrchestrator) {
        add("implementation", testCore.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
