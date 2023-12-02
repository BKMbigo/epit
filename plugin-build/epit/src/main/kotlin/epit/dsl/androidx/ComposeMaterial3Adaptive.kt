package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeMaterial3AdaptiveScope(
    private val androidXComposeMaterial3AdaptiveVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Material3.Material3Adaptive.dependency
        get(): String = moduleName joinWithColon androidXComposeMaterial3AdaptiveVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material3.Material3Adaptive.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3Adaptive: AndroidX.Compose.Material3.Material3Adaptive) {
        add("implementation", composeMaterial3Adaptive.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
