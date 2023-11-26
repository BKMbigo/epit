package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeCompilerScope(
    private val androidXComposeCompilerVersion: String
) {

    @ExperimentalEpitApi
    val Compose.ComposeCompiler.dependency
        get(): String = "${this.moduleName}:${androidXComposeCompilerVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeCompiler.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeCompiler: Compose.ComposeCompiler) {
        add("implementation", composeCompiler.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
