package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCameraScope(
    private val androidXCameraVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Camera.dependency
        get(): String = "${this.moduleName}:${androidXCameraVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Camera.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(camera: AndroidX.Camera) {
        add("implementation", camera.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
