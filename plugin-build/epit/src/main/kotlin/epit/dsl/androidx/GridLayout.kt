package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXGridLayoutScope internal constructor(
    private val androidxGridLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.gridlayout
        get() = AndroidX.GridLayout.gridlayout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.gridlayout(version: String) =
        AndroidX.GridLayout.gridlayout.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.GridLayout.dependencyAsString
        get() = moduleName joinWithColon androidxGridLayoutVersion

    internal fun AndroidX.GridLayout.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
