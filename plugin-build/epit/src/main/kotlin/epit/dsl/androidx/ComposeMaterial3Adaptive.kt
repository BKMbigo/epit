package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @ExperimentalEpitApi
    val AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterial3AdaptiveVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material3.Material3Adaptive.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3Adaptive: AndroidX.Compose.Material3.Material3Adaptive) {
        add("implementation", composeMaterial3Adaptive.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
