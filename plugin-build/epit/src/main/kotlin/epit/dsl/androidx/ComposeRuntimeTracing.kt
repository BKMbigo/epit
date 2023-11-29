package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeRuntimeTracingScope(
    private val androidXComposeRuntimeTracingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.RuntimeTracing.dependency
        get(): String = "${this.moduleName}:${androidXComposeRuntimeTracingVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.RuntimeTracing.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.RuntimeTracing) {
        add("implementation", composeRuntimeTracing.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
