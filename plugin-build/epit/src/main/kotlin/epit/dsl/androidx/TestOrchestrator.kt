package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Orchestrator.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestOrchestratorVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Orchestrator.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(orchestrator: AndroidX.Test.Orchestrator) {
        add("implementation", orchestrator.dependencyAsString)
    }
}
