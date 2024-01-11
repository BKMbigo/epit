package epit.dsl.raamcosta

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Raamcosta
import epit.utils.joinWithColon

@EpitDsl
class EpitComposeDestinationsScope internal constructor(
    private val composeDestinationsVersion: String
) {

    @ExperimentalEpitApi
    val Epit.animations_core
        get() = Raamcosta.ComposeDestinations.animations_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.animations_core(version: String) =
        Raamcosta.ComposeDestinations.animations_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.wear_core
        get() = Raamcosta.ComposeDestinations.wear_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.wear_core(version: String) =
        Raamcosta.ComposeDestinations.wear_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core
        get() = Raamcosta.ComposeDestinations.core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core(version: String) =
        Raamcosta.ComposeDestinations.core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ksp
        get() = Raamcosta.ComposeDestinations.ksp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ksp(version: String) =
        Raamcosta.ComposeDestinations.ksp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.codegen
        get() = Raamcosta.ComposeDestinations.codegen.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.codegen(version: String) =
        Raamcosta.ComposeDestinations.codegen.dependencyAsString(version)

    /*
    * ==============================
    * ====  Internal Functions  ====
    * ==============================
    * */

    internal val Raamcosta.ComposeDestinations.dependencyAsString
        get(): String = moduleName joinWithColon composeDestinationsVersion

    internal fun Raamcosta.ComposeDestinations.dependencyAsString(version: String) = moduleName joinWithColon version

}
