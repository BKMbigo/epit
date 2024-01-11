package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreAnimation.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreAnimationVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreAnimation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreAnimation: AndroidX.Core.CoreAnimation) {
        add("implementation", coreAnimation.dependencyAsString)
    }
}
