package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxTransitionScope internal constructor(
    private val androidxTransitionVersion: String
) {

    @ExperimentalEpitApi
    val Epit.transition
        get() = AndroidX.Transition.transition.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.transition(version: String) =
        AndroidX.Transition.transition.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.transition_ktx
        get() = AndroidX.Transition.transition_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.transition_ktx(version: String) =
        AndroidX.Transition.transition_ktx.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Transition.dependencyAsString
        get() = moduleName joinWithColon androidxTransitionVersion

    internal fun AndroidX.Transition.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
