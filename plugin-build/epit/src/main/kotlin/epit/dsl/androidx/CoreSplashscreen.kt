package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreSpashscreenScope(
    private val androidXCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreSplashscreen.dependency
        get(): String = "${this.moduleName}:${androidXCoreVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreSplashscreen.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreSplashscreen: AndroidX.Core.CoreSplashscreen) {
        add("implementation", coreSplashscreen.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
