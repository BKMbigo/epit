package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXRoomScope internal constructor(
    private val androidXRoomVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Room.dependencyAsString
        get(): String = moduleName joinWithColon androidXRoomVersion

    @ExperimentalEpitApi
    fun AndroidX.Room.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(room: AndroidX.Room) {
        add("implementation", room.dependencyAsString)
    }

//    @ExperimentalEpitApi
//    fun DependencyHandlerScope.kapt(room: AndroidX.Room) {
//        add("kapt", room.dependencyAsString)
//    }
//
//    @ExperimentalEpitApi
//    fun DependencyHandlerScope.ksp(room: AndroidX.Room) {
//        add("ksp", room.dependencyAsString)
//    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
