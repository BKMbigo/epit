package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxSavedStateScope internal constructor(
    private val androidxSavedStateVersion: String
) {

    @ExperimentalEpitApi
    val Epit.savedstate
        get() = AndroidX.SavedState.savedstate.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.savedstate(version: String) =
        AndroidX.SavedState.savedstate.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.savedstate_ktx
        get() = AndroidX.SavedState.savedstate_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.savedstate_ktx(version: String) =
        AndroidX.SavedState.savedstate_ktx.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.SavedState.dependencyAsString
        get() = moduleName joinWithColon androidxSavedStateVersion

    internal fun AndroidX.SavedState.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
