package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    internal val AndroidX.Compose.Foundation.FoundationText.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationTextVersion

    internal fun AndroidX.Compose.Foundation.FoundationText.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
