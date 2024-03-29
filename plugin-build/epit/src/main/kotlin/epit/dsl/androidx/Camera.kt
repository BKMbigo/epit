package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCameraScope internal constructor(
    private val androidXCameraVersion: String
) {

    /* androidx.camera.camera_core */
    @ExperimentalEpitApi
    val Epit.camera_core
        get(): String = AndroidX.Camera.camera_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_core(version: String) = AndroidX.Camera.camera_core.dependencyAsString(version)

    /* androidx.camera.camera_camera2 */
    @ExperimentalEpitApi
    val Epit.camera_camera2
        get() = AndroidX.Camera.camera_camera2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_camera2(version: String) = AndroidX.Camera.camera_camera2.dependencyAsString(version)

    /* androidx.camera.camera_view */
    @ExperimentalEpitApi
    val Epit.camera_view
        get() = AndroidX.Camera.camera_view.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_view(version: String) = AndroidX.Camera.camera_view.dependencyAsString(version)

    /* androidx.camera.camera_lifecycle */
    @ExperimentalEpitApi
    val Epit.camera_lifecycle
        get() = AndroidX.Camera.camera_lifecycle.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_lifecycle(version: String) = AndroidX.Camera.camera_lifecycle.dependencyAsString(version)

    /* androidx.camera.camera_extensions */
    @ExperimentalEpitApi
    val Epit.camera_extensions
        get() = AndroidX.Camera.camera_extensions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_extensions(version: String) = AndroidX.Camera.camera_extensions.dependencyAsString(version)

    /* androidx.camera.camera_video */
    @ExperimentalEpitApi
    val Epit.camera_video
        get() = AndroidX.Camera.camera_video.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.camera_video(version: String) = AndroidX.Camera.camera_video.dependencyAsString(version)

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Camera.dependencyAsString
        get(): String = moduleName joinWithColon androidXCameraVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Camera.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(camera: AndroidX.Camera) {
        add("implementation", camera.dependencyAsString)
    }
}
