package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope


class EpitAndroidXComposeCompilerScope(
    private val androidXComposeCompilerVersion: String
) {

    val Compose.ComposeCompiler.dependency
        get(): String = "${this.moduleName}:${androidXComposeCompilerVersion}"

    fun DependencyHandlerScope.implementation(composeCompiler: Compose.ComposeCompiler) {
        add("implementation", composeCompiler.dependency)
    }
}
