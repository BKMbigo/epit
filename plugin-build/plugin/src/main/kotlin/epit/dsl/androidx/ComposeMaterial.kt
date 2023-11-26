package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeMaterialScope(
    private val androidXComposeMaterialVersion: String
) {

    val Compose.ComposeMaterial.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterialVersion}"

    fun Compose.ComposeMaterial.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeMaterial: Compose.ComposeMaterial) {
        add("implementation", composeMaterial.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
