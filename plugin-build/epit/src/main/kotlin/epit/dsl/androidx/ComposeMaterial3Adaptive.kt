package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeMaterial3AdaptiveScope internal constructor(
    private val androidXComposeMaterial3AdaptiveVersion: String
) {

    @ExperimentalEpitApi
    val Epit.material3_adaptive
        get() = AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3_adaptive(version: String) =
        AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material3_adaptive_navigation_suite
        get() = AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive_navigation_suite.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3_adaptive_navigation_suite(version: String) =
        AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive_navigation_suite.dependencyAsString(version)

    /* Internal functions */

    internal val AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterial3AdaptiveVersion

    internal fun AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
