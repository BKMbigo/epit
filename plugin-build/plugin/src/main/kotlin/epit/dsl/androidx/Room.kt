package epit.dsl.androidx

import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

sealed class Room(
    internal val moduleName: String
) : AndroidXDependencies {
    object androidx_room_gradle_plugin : Room(moduleName = "androidx.room:androidx.room.gradle.plugin")
    object room_common : Room(moduleName = "androidx.room:room-common")
    object room_compiler : Room(moduleName = "androidx.room:room-compiler")
    object room_compiler_processing : Room(moduleName = "androidx.room:room-compiler-processing")
    object room_compiler_processing_testing : Room(moduleName = "androidx.room:room-compiler-processing-testing")
//    object room_coroutines : Room(moduleName = "androidx.room:room-coroutines")
    object room_gradle_plugin : Room(moduleName = "androidx.room:room-gradle-plugin")
    object room_guava : Room(moduleName = "androidx.room:room-guava")
    object room_ktx : Room(moduleName = "androidx.room:room-ktx")
    object room_migration : Room(moduleName = "androidx.room:room-migration")
    object room_paging : Room(moduleName = "androidx.room:room-paging")
    object room_paging_guava : Room(moduleName = "androidx.room:room-paging-guava")
    object room_paging_rxjava2 : Room(moduleName = "androidx.room:room-paging-rxjava2")
    object room_paging_rxjava3 : Room(moduleName = "androidx.room:room-paging-rxjava3")
    object room_runtime : Room(moduleName = "androidx.room:room-runtime")
    object room_rxjava2 : Room(moduleName = "androidx.room:room-rxjava2")
    object room_rxjava3 : Room(moduleName = "androidx.room:room-rxjava3")
    object room_testing : Room(moduleName = "androidx.room:room-testing")
}

class EpitAndroidXRoomScope(
    private val androidXRoomVersion: String
) {
    val Room.dependency
        get(): String = "${this.moduleName}:${androidXRoomVersion}"

    fun DependencyHandlerScope.implementation(room: Room) {
        add("implementation", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.kapt(room: Room.room_compiler = Room.room_compiler) {
        add("kapt", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.ksp(room: Room.room_compiler = Room.room_compiler) {
        add("ksp", room.dependency)
    }
}
