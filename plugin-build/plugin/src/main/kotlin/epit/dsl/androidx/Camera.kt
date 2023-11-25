package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Camera(
    internal val moduleName: String
): epit.dsl.androidx.AndroidXDependencies {
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
    val epit.dsl.androidx.Camera.dependency
        get(): String = "${this.moduleName}:${androidXCameraVersion}"

    fun DependencyHandlerScope.implementation(camera: epit.dsl.androidx.Camera) {
        add("implementation", camera.dependency)
    }
}
