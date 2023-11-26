package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeFoundationScope(
    private val androidXComposeFoundationVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeFoundation.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeFoundation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundation: Compose.ComposeFoundation) {
        add("implementation", composeFoundation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
