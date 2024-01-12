package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXProfileInstallerScope internal constructor(
    private val androidxProfileInstallerVersion: String
) {

    @ExperimentalEpitApi
    val Epit.profileinstaller
        get() = AndroidX.ProfileInstaller.profileinstaller.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.profileinstaller(version: String) =
        AndroidX.ProfileInstaller.profileinstaller.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.ProfileInstaller.dependencyAsString
        get() = moduleName joinWithColon androidxProfileInstallerVersion

    internal fun AndroidX.ProfileInstaller.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
