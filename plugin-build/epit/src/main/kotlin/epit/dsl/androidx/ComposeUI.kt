package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeUIScope(
    private val androidXComposeUIVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.UI.dependency
        get(): String = "${this.moduleName}:${androidXComposeUIVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.UI.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeUI: AndroidX.Compose.UI) {
        add("implementation", composeUI.dependency)
    }

    @ExperimentalEpitApi
    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
