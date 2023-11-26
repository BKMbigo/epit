package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeRuntimeScope(
    private val androidXComposeRuntimeVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeRuntime.dependency
        get(): String = "${this.moduleName}:${androidXComposeRuntimeVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeRuntime.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntime: Compose.ComposeRuntime) {
        add("implementation", composeRuntime.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
