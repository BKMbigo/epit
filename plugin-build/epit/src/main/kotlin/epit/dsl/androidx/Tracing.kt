package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXTracingScope internal constructor(
    private val androidxTracingVersion: String
) {

    @ExperimentalEpitApi
    val Epit.tracing
        get() = AndroidX.Tracing.Tracing.tracing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.tracing(version: String) =
        AndroidX.Tracing.Tracing.tracing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.tracing_ktx
        get() = AndroidX.Tracing.Tracing.tracing_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.tracing_ktx(version: String) =
        AndroidX.Tracing.Tracing.tracing_ktx.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Tracing.Tracing.dependencyAsString
        get() = moduleName joinWithColon androidxTracingVersion

    internal fun AndroidX.Tracing.Tracing.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
