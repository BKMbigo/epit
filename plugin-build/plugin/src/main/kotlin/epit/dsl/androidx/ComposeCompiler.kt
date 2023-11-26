package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope


class EpitAndroidXComposeCompilerScope(
    private val androidXComposeCompilerVersion: String
) {

    val Compose.ComposeCompiler.dependency
        get(): String = "${this.moduleName}:${androidXComposeCompilerVersion}"

    fun Compose.ComposeCompiler.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeCompiler: Compose.ComposeCompiler) {
        add("implementation", composeCompiler.dependency)
    }
}
