package epit.dsl.androidx

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
}
