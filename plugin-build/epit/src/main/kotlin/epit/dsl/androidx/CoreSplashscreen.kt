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
class EpitAndroidXCoreSpashscreenScope internal constructor(
    private val androidXCoreVersion: String
) {

    /* androidx.core:core-splashscreen */
    @ExperimentalEpitApi
    val Epit.core_splashscreen
        get() = AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_splashscreen(version: String) =
        AndroidX.Core.CoreSplashscreen.core_splashscreen.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Core.CoreSplashscreen.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreSplashscreen.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreSplashscreen: AndroidX.Core.CoreSplashscreen) {
        add("implementation", coreSplashscreen.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
