package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @ExperimentalEpitApi
    val AndroidX.Compose.Material3.Material3.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterial3Version

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material3.Material3.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3: AndroidX.Compose.Material3.Material3) {
        add("implementation", composeMaterial3.dependencyAsString)
    }
}
