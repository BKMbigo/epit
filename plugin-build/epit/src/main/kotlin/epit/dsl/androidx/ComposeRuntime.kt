package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeRuntimeScope(
    private val androidXComposeRuntimeVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.Runtime.dependency
        get(): String = "${this.moduleName}:${androidXComposeRuntimeVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.Runtime.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.Runtime) {
        add("implementation", composeRuntimeTracing.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
