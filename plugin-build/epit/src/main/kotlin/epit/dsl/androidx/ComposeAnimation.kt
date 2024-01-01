package epit.dsl.androidx

import Epit
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

    /* androidx.compose.animation:animation */
    @ExperimentalEpitApi
    val Epit.animation
        get() = AndroidX.Compose.Animation.animation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation(version: String) = AndroidX.Compose.Animation.animation.dependencyAsString(version)

    /* androidx.compose.animation:animation-core */
    @ExperimentalEpitApi
    val Epit.animation_core
        get() = AndroidX.Compose.Animation.animation_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_core(version: String) = AndroidX.Compose.Animation.animation_core.dependencyAsString(version)

    /* androidx.compose.animation:animation-graphics */
    @ExperimentalEpitApi
    val Epit.animation_graphics
        get() = AndroidX.Compose.Animation.animation_graphics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_graphics(version: String) =
        AndroidX.Compose.Animation.animation_graphics.dependencyAsString(version)

    /* androidx.compose.animation:animation-tooling-internal */
    @ExperimentalEpitApi
    val Epit.animation_tooling_internal
        get() = AndroidX.Compose.Animation.animation_tooling_internal.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animation_tooling_internal(version: String) =
        AndroidX.Compose.Animation.animation_tooling_internal.dependencyAsString(version)

    /* internal functions */

    @ExperimentalEpitApi
    val AndroidX.Compose.Animation.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeAnimationVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Animation.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeAnimation: AndroidX.Compose.Animation) {
        add("implementation", composeAnimation.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
