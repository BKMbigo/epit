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
class EpitAndroidXTestOrchestratorScope internal constructor(
    private val androidXTestOrchestratorVersion: String
) {

    @ExperimentalEpitApi
    val Epit.orchestrator
        get() = AndroidX.Test.Orchestrator.orchestrator.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.orchestrator(version: String) =
        AndroidX.Test.Orchestrator.orchestrator.dependencyAsString(version)

    /* internal dependencies */

    @ExperimentalEpitApi
    val AndroidX.Test.Orchestrator.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestOrchestratorVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Orchestrator.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(orchestrator: AndroidX.Test.Orchestrator) {
        add("implementation", orchestrator.dependencyAsString)
    }
}
