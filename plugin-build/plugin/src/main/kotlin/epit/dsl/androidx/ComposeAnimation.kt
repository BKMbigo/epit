package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope


class EpitAndroidXComposeAnimationScope(
    private val androidXComposeAnimationVersion: String
) {

    val Compose.ComposeAnimation.dependency
        get(): String = "${this.moduleName}:${androidXComposeAnimationVersion}"

    fun Compose.ComposeAnimation.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeAnimation: Compose.ComposeAnimation) {
        add("implementation", composeAnimation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
