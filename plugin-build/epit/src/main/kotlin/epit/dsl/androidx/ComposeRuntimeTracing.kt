package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeRuntimeTracingScope internal constructor(
    private val androidXComposeRuntimeTracingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Runtime.RuntimeTracing.dependency
        get(): String = moduleName joinWithColon androidXComposeRuntimeTracingVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Runtime.RuntimeTracing.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeRuntimeTracing: AndroidX.Compose.Runtime.RuntimeTracing) {
        add("implementation", composeRuntimeTracing.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
