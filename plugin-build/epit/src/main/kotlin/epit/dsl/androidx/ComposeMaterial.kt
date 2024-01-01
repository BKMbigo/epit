package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeMaterialScope internal constructor(
    private val androidXComposeMaterialVersion: String
) {

    @ExperimentalEpitApi
    val Epit.material
        get() = AndroidX.Compose.Material.material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material(version: String) =
        AndroidX.Compose.Material.material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_icons_core
        get() = AndroidX.Compose.Material.material_icons_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_icons_core(version: String) =
        AndroidX.Compose.Material.material_icons_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_icons_extended
        get() = AndroidX.Compose.Material.material_icons_extended.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_icons_extended(version: String) =
        AndroidX.Compose.Material.material_icons_extended.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.material_ripple
        get() = AndroidX.Compose.Material.material_ripple.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.material_ripple(version: String) =
        AndroidX.Compose.Material.material_ripple.dependencyAsString(version)

    /* internal function */

    @ExperimentalEpitApi
    val AndroidX.Compose.Material.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeMaterialVersion

    @ExperimentalEpitApi
    fun AndroidX.Compose.Material.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeMaterial: AndroidX.Compose.Material) {
        add("implementation", composeMaterial.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
