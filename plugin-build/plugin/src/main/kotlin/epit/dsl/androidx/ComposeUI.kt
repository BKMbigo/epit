package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeUIScope(
    private val androidXComposeUIVersion: String
) {

    val Compose.ComposeUI.dependency
        get(): String = "${this.moduleName}:${androidXComposeUIVersion}"

    fun Compose.ComposeUI.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeUI: Compose.ComposeUI) {
        add("implementation", composeUI.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
