package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeMaterialScope(
    private val androidXComposeMaterialVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Material.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterialVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial: AndroidX.Compose.Material) {
        add("implementation", composeMaterial.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
