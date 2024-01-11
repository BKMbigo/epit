package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXRoomScope internal constructor(
    private val androidXRoomVersion: String
) {

    @ExperimentalEpitApi
    val Epit.androidx_room_gradle_plugin
        get() = AndroidX.Room.androidx_room_gradle_plugin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.androidx_room_gradle_plugin(version: String) =
        AndroidX.Room.androidx_room_gradle_plugin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_common
        get() = AndroidX.Room.room_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_common(version: String) =
        AndroidX.Room.room_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_compiler
        get() = AndroidX.Room.room_compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_compiler(version: String) =
        AndroidX.Room.room_compiler.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_compiler_processing
        get() = AndroidX.Room.room_compiler_processing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_compiler_processing(version: String) =
        AndroidX.Room.room_compiler_processing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_compiler_processing_testing
        get() = AndroidX.Room.room_compiler_processing_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_compiler_processing_testing(version: String) =
        AndroidX.Room.room_compiler_processing_testing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_gradle_plugin
        get() = AndroidX.Room.room_gradle_plugin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_gradle_plugin(version: String) =
        AndroidX.Room.room_gradle_plugin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_guava
        get() = AndroidX.Room.room_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_guava(version: String) =
        AndroidX.Room.room_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_ktx
        get() = AndroidX.Room.room_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_ktx(version: String) =
        AndroidX.Room.room_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_migration
        get() = AndroidX.Room.room_migration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_migration(version: String) =
        AndroidX.Room.room_migration.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_paging
        get() = AndroidX.Room.room_paging.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_paging(version: String) =
        AndroidX.Room.room_paging.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_paging_guava
        get() = AndroidX.Room.room_paging_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_paging_guava(version: String) =
        AndroidX.Room.room_paging_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_paging_rxjava2
        get() = AndroidX.Room.room_paging_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_paging_rxjava2(version: String) =
        AndroidX.Room.room_paging_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_paging_rxjava3
        get() = AndroidX.Room.room_paging_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_paging_rxjava3(version: String) =
        AndroidX.Room.room_paging_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_runtime
        get() = AndroidX.Room.room_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_runtime(version: String) =
        AndroidX.Room.room_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_rxjava2
        get() = AndroidX.Room.room_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_rxjava2(version: String) =
        AndroidX.Room.room_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_rxjava3
        get() = AndroidX.Room.room_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_rxjava3(version: String) =
        AndroidX.Room.room_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.room_testing
        get() = AndroidX.Room.room_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.room_testing(version: String) =
        AndroidX.Room.room_testing.dependencyAsString(version)

    /* internal functions */

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Room.dependencyAsString
        get(): String = moduleName joinWithColon androidXRoomVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Room.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
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
}
