package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreSplashscreen.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreSplashscreen.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreSplashscreen: AndroidX.Core.CoreSplashscreen) {
        add("implementation", coreSplashscreen.dependencyAsString)
    }
}
