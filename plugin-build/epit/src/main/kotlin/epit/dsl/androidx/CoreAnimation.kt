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

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreAnimation: AndroidX.Core.CoreAnimation) {
        add("implementation", coreAnimation.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
