package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeFoundationTextScope(
    private val androidXComposeFoundationTextVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.FoundationText.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationTextVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.FoundationText.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundationText: AndroidX.Compose.Foundation.FoundationText) {
        add("implementation", composeFoundationText.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
