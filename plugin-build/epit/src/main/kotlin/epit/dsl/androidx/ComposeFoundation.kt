package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeFoundationScope internal constructor(
    private val androidXComposeFoundationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.foundation
        get() = AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.foundation(version: String) = AndroidX.Compose.Foundation.Foundation.foundation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.foundation_layout
        get() = AndroidX.Compose.Foundation.Foundation.foundation_layout.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.foundation_layout(version: String) =
        AndroidX.Compose.Foundation.Foundation.foundation_layout.dependencyAsString(version)

    /*
    * ==============================
    * ==== Internal Functions ======
    * ==============================
    * */

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.Foundation.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.Foundation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundation: AndroidX.Compose.Foundation.Foundation) {
        add("implementation", composeFoundation.dependencyAsString)
    }
}
