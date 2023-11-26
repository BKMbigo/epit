package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Camera(
    internal val moduleName: String
) : AndroidXDependency {
    camera_camera2(moduleName = "androidx.camera:camera-camera2"),
    camera_core("androidx.camera:camera-core"),
    camera_extensions("androidx.camera:camera-extensions"),
    camera_lifecycle("androidx.camera:camera-lifecycle"),
//    camera_mlkit_vision("androidx.camera:camera-mlkit-vision"),
    camera_video("androidx.camera:camera-video"),
    camera_view("androidx.camera:camera-view"),
//    camera_viewfinder("androidx.camera:camera-viewfinder")
}

class EpitAndroidXCameraScope(
    private val androidXCameraVersion: String
) {
    val Camera.dependency
        get(): String = "${this.moduleName}:${androidXCameraVersion}"

    fun Camera.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(camera: Camera) {
        add("implementation", camera.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
