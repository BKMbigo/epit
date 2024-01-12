package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXConcurrentScope internal constructor(
    private val androidXConcurrentVersion: String
) {

    @ExperimentalEpitApi
    val Epit.concurrent_futures
        get() = AndroidX.Concurrent.concurrent_futures.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.concurrent_futures(version: String) =
        AndroidX.Concurrent.concurrent_futures.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.concurrent_futures_ktx
        get() = AndroidX.Concurrent.concurrent_futures.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.concurrent_futures_ktx(version: String) =
        AndroidX.Concurrent.concurrent_futures.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Concurrent.dependencyAsString
        get() = moduleName joinWithColon androidXConcurrentVersion

    internal fun AndroidX.Concurrent.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
