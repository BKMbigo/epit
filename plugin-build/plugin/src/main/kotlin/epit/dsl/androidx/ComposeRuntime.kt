package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeRuntimeScope(
    private val androidXComposeRuntimeVersion: String
) {

    val Compose.ComposeRuntime.dependency
        get(): String = "${this.moduleName}:${androidXComposeRuntimeVersion}"

    fun Compose.ComposeRuntime.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeRuntime: Compose.ComposeRuntime) {
        add("implementation", composeRuntime.dependency)
    }
}
