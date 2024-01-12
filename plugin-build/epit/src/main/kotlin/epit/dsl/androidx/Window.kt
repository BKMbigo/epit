package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXWindowScope internal constructor(
    private val androidxWindowVersion: String
) {

    @ExperimentalEpitApi
    val Epit.window
        get() = AndroidX.Window.Window.window.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window(version: String) =
        AndroidX.Window.Window.window.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_core
        get() = AndroidX.Window.Window.window_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_core(version: String) =
        AndroidX.Window.Window.window_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_core_jvm
        get() = AndroidX.Window.Window.window_core_jvm.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_core_jvm(version: String) =
        AndroidX.Window.Window.window_core_jvm.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_extensions
        get() = AndroidX.Window.Window.window_extensions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_extensions(version: String) =
        AndroidX.Window.Window.window_extensions.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_java
        get() = AndroidX.Window.Window.window_java.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_java(version: String) =
        AndroidX.Window.Window.window_java.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_rxjava2
        get() = AndroidX.Window.Window.window_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_rxjava2(version: String) =
        AndroidX.Window.Window.window_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_rxjava3
        get() = AndroidX.Window.Window.window_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_rxjava3(version: String) =
        AndroidX.Window.Window.window_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.window_testing
        get() = AndroidX.Window.Window.window_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.window_testing(version: String) =
        AndroidX.Window.Window.window_testing.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Window.Window.dependencyAsString
        get() = moduleName joinWithColon androidxWindowVersion

    internal fun AndroidX.Window.Window.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
