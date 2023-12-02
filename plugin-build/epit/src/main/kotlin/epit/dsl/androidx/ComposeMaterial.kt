package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeMaterialScope(
    private val androidXComposeMaterialVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Compose.Material.dependency
        get(): String = moduleName joinWithColon androidXComposeMaterialVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial: AndroidX.Compose.Material) {
        add("implementation", composeMaterial.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
