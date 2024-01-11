package epit.dsl.voyager

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitVoyagerScope internal constructor(
    internal val voyagerVersion: String
) {

    @ExperimentalEpitApi
    val Epit.voyager_navigator
        get() = Voyager.voyager_navigator.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_navigator(version: String) =
        Voyager.voyager_navigator.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_bottom_sheet_navigator
        get() = Voyager.voyager_bottom_sheet_navigator.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_bottom_sheet_navigator(version: String) =
        Voyager.voyager_bottom_sheet_navigator.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_tab_navigator
        get() = Voyager.voyager_tab_navigator.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_tab_navigator(version: String) =
        Voyager.voyager_tab_navigator.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_transitions
        get() = Voyager.voyager_transitions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_transitions(version: String) =
        Voyager.voyager_transitions.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_androidx
        get() = Voyager.voyager_androidx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_androidx(version: String) =
        Voyager.voyager_androidx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_koin
        get() = Voyager.voyager_koin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_koin(version: String) =
        Voyager.voyager_koin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_hilt
        get() = Voyager.voyager_hilt.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_hilt(version: String) =
        Voyager.voyager_hilt.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_kodein
        get() = Voyager.voyager_kodein.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_kodein(version: String) =
        Voyager.voyager_kodein.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.voyager_rxjava
        get() = Voyager.voyager_rxjava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.voyager_rxjava(version: String) =
        Voyager.voyager_rxjava.dependencyAsString(version)

    /* Internal Functions */
    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val Voyager.dependencyAsString
        get() = moduleName joinWithColon voyagerVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun Voyager.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(voyager: Voyager) {
        add("implementation", voyager.dependencyAsString)
    }
}
