package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
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

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreSplashscreen: AndroidX.Core.CoreSplashscreen) {
        add("implementation", coreSplashscreen.dependencyAsString)
    }
}
