package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeRuntimeTracingScope internal constructor(
    private val androidXComposeRuntimeTracingVersion: String
) {

    @ExperimentalEpitApi
    val Epit.runtime_tracing
        get() = AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_tracing(version: String) =
        AndroidX.Compose.Runtime.RuntimeTracing.runtime_tracing.dependencyAsString(version)

    /* internal function */
    internal val AndroidX.Compose.Runtime.RuntimeTracing.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeRuntimeTracingVersion

    internal fun AndroidX.Compose.Runtime.RuntimeTracing.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
