package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @ExperimentalEpitApi
    val AndroidX.Compose.Foundation.FoundationText.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeFoundationTextVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Foundation.FoundationText.dependencyAsString(version: String) =
        moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeFoundationText: AndroidX.Compose.Foundation.FoundationText) {
        add("implementation", composeFoundationText.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
