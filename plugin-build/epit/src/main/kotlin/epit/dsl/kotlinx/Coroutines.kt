package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.KotlinX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxCoroutinesScope internal constructor(
    private val kotlinxCoroutinesVersion: String
) {

    @ExperimentalEpitApi
    val Epit.coroutines_core
        get() = KotlinX.Coroutines.coroutines_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_core(version: String) =
        KotlinX.Coroutines.coroutines_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_android
        get() = KotlinX.Coroutines.coroutines_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_android(version: String) =
        KotlinX.Coroutines.coroutines_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_debug
        get() = KotlinX.Coroutines.coroutines_debug.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_debug(version: String) =
        KotlinX.Coroutines.coroutines_debug.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_guava
        get() = KotlinX.Coroutines.coroutines_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_guava(version: String) =
        KotlinX.Coroutines.coroutines_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_javafx
        get() = KotlinX.Coroutines.coroutines_javafx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_javafx(version: String) =
        KotlinX.Coroutines.coroutines_javafx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_jdk9
        get() = KotlinX.Coroutines.coroutines_jdk9.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_jdk9(version: String) =
        KotlinX.Coroutines.coroutines_jdk9.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_play_services
        get() = KotlinX.Coroutines.coroutines_play_services.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_play_services(version: String) =
        KotlinX.Coroutines.coroutines_play_services.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_reactive
        get() = KotlinX.Coroutines.coroutines_reactive.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_reactive(version: String) =
        KotlinX.Coroutines.coroutines_reactive.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_rx2
        get() = KotlinX.Coroutines.coroutines_rx2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_rx2(version: String) =
        KotlinX.Coroutines.coroutines_rx2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_rx3
        get() = KotlinX.Coroutines.coroutines_rx3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_rx3(version: String) =
        KotlinX.Coroutines.coroutines_rx3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_slf4j
        get() = KotlinX.Coroutines.coroutines_slf4j.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_slf4j(version: String) =
        KotlinX.Coroutines.coroutines_slf4j.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_swing
        get() = KotlinX.Coroutines.coroutines_swing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_swing(version: String) =
        KotlinX.Coroutines.coroutines_swing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coroutines_test
        get() = KotlinX.Coroutines.coroutines_test.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coroutines_test(version: String) =
        KotlinX.Coroutines.coroutines_test.dependencyAsString(version)

    /* Internal Functions */

    internal val KotlinX.Coroutines.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxCoroutinesVersion

    internal fun KotlinX.Coroutines.dependencyAsString(version: String) = moduleName joinWithColon version

}
