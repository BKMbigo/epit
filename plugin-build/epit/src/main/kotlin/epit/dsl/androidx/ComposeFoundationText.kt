package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeFoundationTextScope(
    private val androidXComposeFoundationTextVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeFoundationText.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationTextVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeFoundationText.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundationText: Compose.ComposeFoundationText) {
        add("implementation", composeFoundationText.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
