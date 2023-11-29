package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCameraScope(
    private val androidXCameraVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Camera.dependency
        get(): String = moduleName joinWithColon androidXCameraVersion

    @ExperimentalEpitApi
    fun AndroidX.Camera.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(camera: AndroidX.Camera) {
        add("implementation", camera.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
