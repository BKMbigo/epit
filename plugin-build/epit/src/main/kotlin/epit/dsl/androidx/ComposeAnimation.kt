package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeAnimationScope(
    private val androidXComposeAnimationVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.Animation.dependency
        get(): String = "${this.moduleName}:${androidXComposeAnimationVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Animation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeAnimation: AndroidX.Compose.Animation) {
        add("implementation", composeAnimation.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
