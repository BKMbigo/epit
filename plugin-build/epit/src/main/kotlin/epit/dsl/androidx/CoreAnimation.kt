package epit.dsl.androidx

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
