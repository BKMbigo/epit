package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeFoundationTextScope internal constructor(
    private val androidXComposeFoundationTextVersion: String
) {

    @ExperimentalEpitApi
    val Epit.foundation_text
        get() = AndroidX.Compose.Foundation.FoundationText.foundation_text.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.foundation_text(version: String): String =
        AndroidX.Compose.Foundation.FoundationText.foundation_text.dependencyAsString(version)

    /* internal functions */

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.FoundationText.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationTextVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.FoundationText.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundationText: AndroidX.Compose.Foundation.FoundationText) {
        add("implementation", composeFoundationText.dependencyAsString)
    }
}
