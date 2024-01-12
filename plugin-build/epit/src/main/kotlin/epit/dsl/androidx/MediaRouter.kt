package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXMediaRouterScope internal constructor(
    private val androidxMediaRouterVersion: String
) {

    @ExperimentalEpitApi
    val Epit.mediarouter
        get() = AndroidX.MediaRouter.mediarouter.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mediarouter(version: String) =
        AndroidX.MediaRouter.mediarouter.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.mediarouter_testing
        get() = AndroidX.MediaRouter.mediarouter_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mediarouter_testing(version: String) =
        AndroidX.MediaRouter.mediarouter_testing.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.MediaRouter.dependencyAsString
        get() = moduleName joinWithColon androidxMediaRouterVersion

    internal fun AndroidX.MediaRouter.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
