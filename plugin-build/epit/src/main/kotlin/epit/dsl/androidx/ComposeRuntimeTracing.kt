package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.RuntimeTracing.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeRuntimeTracingVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.RuntimeTracing.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.RuntimeTracing) {
        add("implementation", composeRuntimeTracing.dependencyAsString)
    }
}
