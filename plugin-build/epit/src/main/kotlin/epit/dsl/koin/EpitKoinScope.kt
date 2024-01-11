package epit.dsl.koin

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKoinScope internal constructor(
    internal val koinBOMVersion: String
) {

    @ExperimentalEpitApi
    val Epit.koin_core
        get() = Koin.koin_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_core(version: String): String =
        Koin.koin_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_core_coroutines
        get() = Koin.koin_core_coroutines.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_core_coroutines(version: String): String =
        Koin.koin_core_coroutines.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_test
        get() = Koin.koin_test.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_test(version: String): String =
        Koin.koin_test.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_android
        get() = Koin.koin_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_android(version: String): String =
        Koin.koin_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_android_test
        get() = Koin.koin_android_test.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_android_test(version: String): String =
        Koin.koin_android_test.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_android_compat
        get() = Koin.koin_android_compat.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_android_compat(version: String): String =
        Koin.koin_android_compat.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_androidx_navigation
        get() = Koin.koin_androidx_navigation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_androidx_navigation(version: String): String =
        Koin.koin_androidx_navigation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_androidx_workmanager
        get() = Koin.koin_androidx_workmanager.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_androidx_workmanager(version: String): String =
        Koin.koin_androidx_workmanager.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_compose
        get() = Koin.koin_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_compose(version: String): String =
        Koin.koin_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_androidx_compose
        get() = Koin.koin_androidx_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_androidx_compose(version: String): String =
        Koin.koin_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_androidx_compose_navigation
        get() = Koin.koin_androidx_compose_navigation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_androidx_compose_navigation(version: String): String =
        Koin.koin_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_ktor
        get() = Koin.koin_ktor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_ktor(version: String): String =
        Koin.koin_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.koin_logger_slf4j
        get() = Koin.koin_logger_slf4j.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.koin_logger_slf4j(version: String): String =
        Koin.koin_core.dependencyAsString(version)

    /* Internal functions */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = Koin.koin_bom.moduleName joinWithColon koinBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = Koin.koin_bom.moduleName joinWithColon customVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    val Koin.dependencyAsString
        get() = moduleName

    @InternalEpitApi
    @ExperimentalEpitApi
    fun Koin.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("This has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(koin: Koin) {
        add("implementation", koin.moduleName)
    }
}
