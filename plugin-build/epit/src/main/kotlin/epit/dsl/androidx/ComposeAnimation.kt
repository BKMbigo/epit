package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeAnimationScope(
    private val androidXComposeAnimationVersion: String
) {

    @ExperimentalEpitApi
    val Compose.ComposeAnimation.dependency
        get(): String = "${this.moduleName}:${androidXComposeAnimationVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeAnimation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeAnimation: Compose.ComposeAnimation) {
        add("implementation", composeAnimation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
