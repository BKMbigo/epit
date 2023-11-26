package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Room(
    internal val moduleName: String
) : AndroidXDependency {
    androidx_room_gradle_plugin(moduleName = "androidx.room:androidx.room.gradle.plugin"),
    room_common(moduleName = "androidx.room:room-common"),
    room_compiler(moduleName = "androidx.room:room-compiler"),
    room_compiler_processing(moduleName = "androidx.room:room-compiler-processing"),
    room_compiler_processing_testing(moduleName = "androidx.room:room-compiler-processing-testing"),

    //    room_coroutines(moduleName = "androidx.room:room-coroutines"),
    room_gradle_plugin(moduleName = "androidx.room:room-gradle-plugin"),
    room_guava(moduleName = "androidx.room:room-guava"),
    room_ktx(moduleName = "androidx.room:room-ktx"),
    room_migration(moduleName = "androidx.room:room-migration"),
    room_paging(moduleName = "androidx.room:room-paging"),
    room_paging_guava(moduleName = "androidx.room:room-paging-guava"),
    room_paging_rxjava2(moduleName = "androidx.room:room-paging-rxjava2"),
    room_paging_rxjava3(moduleName = "androidx.room:room-paging-rxjava3"),
    room_runtime(moduleName = "androidx.room:room-runtime"),
    room_rxjava2(moduleName = "androidx.room:room-rxjava2"),
    room_rxjava3(moduleName = "androidx.room:room-rxjava3"),
    room_testing(moduleName = "androidx.room:room-testing")
}

@ExperimentalEpitApi
class EpitAndroidXRoomScope(
    private val androidXRoomVersion: String
) {
    @ExperimentalEpitApi
    val Room.dependency
        get(): String = "${this.moduleName}:${androidXRoomVersion}"

    @ExperimentalEpitApi
    fun Room.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(room: Room) {
        add("implementation", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.kapt(room: Room = Room.room_compiler) {
        add("kapt", room.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.ksp(room: Room = Room.room_compiler) {
        add("ksp", room.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
