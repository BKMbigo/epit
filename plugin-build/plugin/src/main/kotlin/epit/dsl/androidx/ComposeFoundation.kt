package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeFoundationScope(
    private val androidXComposeFoundationVersion: String
) {

    val Compose.ComposeFoundation.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationVersion}"

    fun Compose.ComposeFoundation.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeFoundation: Compose.ComposeFoundation) {
        add("implementation", composeFoundation.dependency)
    }
}
