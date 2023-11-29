package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeFoundationScope(
    private val androidXComposeFoundationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.Foundation.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.Foundation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundation: AndroidX.Compose.Foundation.Foundation) {
        add("implementation", composeFoundation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
