package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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
    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterial3AdaptiveVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3Adaptive: AndroidX.Compose.Material3.Material3Adaptive) {
        add("implementation", composeMaterial3Adaptive.dependencyAsString)
    }
}
