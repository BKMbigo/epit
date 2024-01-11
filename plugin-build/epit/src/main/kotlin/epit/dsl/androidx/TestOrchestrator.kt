package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    internal val AndroidX.Test.Orchestrator.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestOrchestratorVersion

    internal fun AndroidX.Test.Orchestrator.dependencyAsString(version: String) = moduleName joinWithColon version

}
