package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeFoundationScope internal constructor(
    private val androidXComposeFoundationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.Foundation.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.Foundation.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundation: AndroidX.Compose.Foundation.Foundation) {
        add("implementation", composeFoundation.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
