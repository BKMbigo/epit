package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeAnimationScope internal constructor(
    private val androidXComposeAnimationVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.Animation.dependency
        get(): String = moduleName joinWithColon androidXComposeAnimationVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Animation.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeAnimation: AndroidX.Compose.Animation) {
        add("implementation", composeAnimation.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
