package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeUIScope(
    private val androidXComposeUIVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.UI.dependency
        get(): String = moduleName joinWithColon androidXComposeUIVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.UI.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeUI: AndroidX.Compose.UI) {
        add("implementation", composeUI.dependency)
    }

    @ExperimentalEpitApi
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
