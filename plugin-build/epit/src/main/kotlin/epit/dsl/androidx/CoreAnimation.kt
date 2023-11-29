package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreAnimationScope(
    private val androidXCoreAnimationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreAnimation.dependency
        get(): String = "${this.moduleName}:${androidXCoreAnimationVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreAnimation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreAnimation: AndroidX.Core.CoreAnimation) {
        add("implementation", coreAnimation.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
