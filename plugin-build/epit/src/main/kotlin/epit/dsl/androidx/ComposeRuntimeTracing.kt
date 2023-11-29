package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope


@ExperimentalEpitApi
class EpitAndroidXComposeRuntimeTracingScope(
    private val androidXComposeRuntimeTracingVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeRuntimeTracing.dependency
        get(): String = "${this.moduleName}:${androidXComposeRuntimeTracingVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeRuntimeTracing.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: Compose.ComposeRuntimeTracing) {
        add("implementation", composeRuntimeTracing.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
