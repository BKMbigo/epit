package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeCompilerScope(
    private val androidXComposeCompilerVersion: String
) {

    @ExperimentalEpitApi
    val AndroidX.Compose.Compiler.dependency
        get(): String = moduleName joinWithColon androidXComposeCompilerVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Compiler.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeCompiler: AndroidX.Compose.Compiler) {
        add("implementation", composeCompiler.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}