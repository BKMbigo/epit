package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXCarAppScope internal constructor(
    private val androidXCarAppVersion: String
) {

    @ExperimentalEpitApi
    val Epit.app
        get() = AndroidX.Car.App.app.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.app(version: String) =
        AndroidX.Car.App.app.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.app_automotive
        get() = AndroidX.Car.App.app_automotive.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.app_automotive(version: String) =
        AndroidX.Car.App.app_automotive.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.app_projected
        get() = AndroidX.Car.App.app_projected.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.app_projected(version: String) =
        AndroidX.Car.App.app_projected.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.app_testing
        get() = AndroidX.Car.App.app_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.app_testing(version: String) =
        AndroidX.Car.App.app_testing.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Car.App.dependencyAsString
        get() = moduleName joinWithColon androidXCarAppVersion

    internal fun AndroidX.Car.App.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
