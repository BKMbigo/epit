package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXRoomScope(
    private val androidXRoomVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Room.dependency
        get(): String = "${this.moduleName}:${androidXRoomVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Room.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(room: AndroidX.Room) {
        add("implementation", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.kapt(room: AndroidX.Room = AndroidX.Room.room_compiler) {
        add("kapt", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.ksp(room: AndroidX.Room = AndroidX.Room.room_compiler) {
        add("ksp", room.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
