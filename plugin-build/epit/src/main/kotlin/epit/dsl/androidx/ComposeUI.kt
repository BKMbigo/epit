package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeUIScope internal constructor(
    private val androidXComposeUIVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.UI.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeUIVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.UI.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeUI: AndroidX.Compose.UI) {
        add("implementation", composeUI.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
