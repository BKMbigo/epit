package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeUIScope(
    private val androidXComposeUIVersion: String
) {

    val Compose.ComposeUI.dependency
        get(): String = "${this.moduleName}:${androidXComposeUIVersion}"

    fun DependencyHandlerScope.implementation(composeUI: Compose.ComposeUI) {
        add("implementation", composeUI.dependency)
    }
}
