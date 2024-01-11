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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.FoundationText.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationTextVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.FoundationText.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundationText: AndroidX.Compose.Foundation.FoundationText) {
        add("implementation", composeFoundationText.dependencyAsString)
    }
}
