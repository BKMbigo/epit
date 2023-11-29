package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeMaterial3AdaptiveScope(
    private val androidXComposeMaterial3AdaptiveVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeMaterial3Adaptive.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterial3AdaptiveVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeMaterial3Adaptive.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3Adaptive: Compose.ComposeMaterial3Adaptive) {
        add("implementation", composeMaterial3Adaptive.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
