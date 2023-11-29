package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXRoomScope(
    private val androidXRoomVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Room.dependency
        get(): String = moduleName joinWithColon androidXRoomVersion

    @ExperimentalEpitApi
    fun AndroidX.Room.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(room: AndroidX.Room) {
        add("implementation", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.kapt(room: AndroidX.Room) {
        add("kapt", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.ksp(room: AndroidX.Room) {
        add("ksp", room.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
