package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeMaterial3Scope(
    private val androidXComposeMaterial3Version: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Material3.Material3.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterial3Version}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material3.Material3.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial3: AndroidX.Compose.Material3.Material3) {
        add("implementation", composeMaterial3.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
