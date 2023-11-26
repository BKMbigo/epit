package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeMaterialScope(
    private val androidXComposeMaterialVersion: String
) {
    @ExperimentalEpitApi
    val Compose.ComposeMaterial.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterialVersion}"

    @ExperimentalEpitApi
    fun Compose.ComposeMaterial.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial: Compose.ComposeMaterial) {
        add("implementation", composeMaterial.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
