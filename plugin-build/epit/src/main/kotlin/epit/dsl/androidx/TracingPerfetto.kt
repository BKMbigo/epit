package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXTracingPerfettoScope internal constructor(
    private val androidxTracingPerfettoVersion: String
) {

    @ExperimentalEpitApi
    val Epit.tracing_perfetto
        get() = AndroidX.Tracing.TracingPerfetto.tracing_perfetto.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.tracing_perfetto(version: String) =
        AndroidX.Tracing.TracingPerfetto.tracing_perfetto.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.tracing_perfetto_binary
        get() = AndroidX.Tracing.TracingPerfetto.tracing_perfetto_binary.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.tracing_perfetto_binary(version: String) =
        AndroidX.Tracing.TracingPerfetto.tracing_perfetto_binary.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.tracing_perfetto_handshake
        get() = AndroidX.Tracing.TracingPerfetto.tracing_perfetto_handshake.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.tracing_perfetto_handshake(version: String) =
        AndroidX.Tracing.TracingPerfetto.tracing_perfetto_handshake.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Tracing.TracingPerfetto.dependencyAsString
        get() = moduleName joinWithColon androidxTracingPerfettoVersion

    internal fun AndroidX.Tracing.TracingPerfetto.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
