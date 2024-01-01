package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreAnimationScope internal constructor(
    private val androidXCoreAnimationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core_animation
        get() = AndroidX.Core.CoreAnimation.core_animation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_animation(version: String) =
        AndroidX.Core.CoreAnimation.core_animation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core_animation_testing
        get() = AndroidX.Core.CoreAnimation.core_animation_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_animation_testing(version: String) =
        AndroidX.Core.CoreAnimation.core_animation_testing.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Core.CoreAnimation.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreAnimationVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreAnimation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreAnimation: AndroidX.Core.CoreAnimation) {
        add("implementation", coreAnimation.dependencyAsString)
    }
}
