package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeRuntimeScope internal constructor(
    private val androidXComposeRuntimeVersion: String
) {

    @ExperimentalEpitApi
    val Epit.runtime
        get() = AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_livedata
        get() = AndroidX.Compose.Runtime.Runtime.runtime_livedata.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_livedata(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_livedata.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_rxjava2
        get() = AndroidX.Compose.Runtime.Runtime.runtime_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_rxjava2(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_rxjava3
        get() = AndroidX.Compose.Runtime.Runtime.runtime_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_rxjava3(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.runtime_saveable
        get() = AndroidX.Compose.Runtime.Runtime.runtime_saveable.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runtime_saveable(version: String) =
        AndroidX.Compose.Runtime.Runtime.runtime_saveable.dependencyAsString(version)

    /*
    * ================================
    * ===== Internal functions =======
    * ================================
    * */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.Runtime.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeRuntimeVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.Runtime.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.Runtime) {
        add("implementation", composeRuntimeTracing.dependencyAsString)
    }
}
