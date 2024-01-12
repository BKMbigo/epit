package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXDynamicAnimationScope internal constructor(
    private val androidXDynamicAnimationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.dynamicanimation
        get() = AndroidX.DynamicAnimation.dynamicanimation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.dynamicanimation(version: String) =
        AndroidX.DynamicAnimation.dynamicanimation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.dynamicanimation_ktx
        get() = AndroidX.DynamicAnimation.dynamicanimation_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.dynamicanimation_ktx(version: String) =
        AndroidX.DynamicAnimation.dynamicanimation_ktx.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DynamicAnimation.dependencyAsString
        get() = moduleName joinWithColon androidXDynamicAnimationVersion

    internal fun AndroidX.DynamicAnimation.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
