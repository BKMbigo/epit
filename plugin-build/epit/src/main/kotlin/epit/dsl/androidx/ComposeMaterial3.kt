package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeMaterial3Scope internal constructor(
    private val androidXComposeMaterial3Version: String
) {

    /* androidx.compose.material3:material3 */
    @ExperimentalEpitApi
    val Epit.material3
        get() = AndroidX.Compose.Material3.Material3.material3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3(version: String) =
        AndroidX.Compose.Material3.Material3.material3.dependencyAsString(version)

    /* androidx.compose.material3:material3-window-size-class */
    @ExperimentalEpitApi
    val Epit.material3_window_size_class
        get() = AndroidX.Compose.Material3.Material3.material3_window_size_class.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material3_window_size_class(version: String) =
        AndroidX.Compose.Material3.Material3.material3_window_size_class.dependencyAsString(version)

    /*
    * ===============================
    * ===== Internal Functions ======
    * ===============================
    * */

    internal val AndroidX.Compose.Material3.Material3.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterial3Version

    internal fun AndroidX.Compose.Material3.Material3.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
