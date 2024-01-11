package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    internal val AndroidX.Compose.Runtime.Runtime.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeRuntimeVersion

    internal fun AndroidX.Compose.Runtime.Runtime.dependencyAsString(version: String) = moduleName joinWithColon version

}
