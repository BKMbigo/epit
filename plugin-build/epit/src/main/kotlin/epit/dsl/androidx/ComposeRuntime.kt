package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeRuntimeScope internal constructor(
    private val androidXComposeRuntimeVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.Runtime.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeRuntimeVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.Runtime.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.Runtime) {
        add("implementation", composeRuntimeTracing.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
