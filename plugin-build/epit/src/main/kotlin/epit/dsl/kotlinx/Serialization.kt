package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.KotlinX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxSerializationScope internal constructor(
    internal val kotlinxSerializationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.serialization_core
        get() = KotlinX.Serialization.serialization_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.serialization_core(version: String) =
        KotlinX.Serialization.serialization_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.serialization_json
        get() = KotlinX.Serialization.serialization_json.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.serialization_json(version: String) =
        KotlinX.Serialization.serialization_json.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val KotlinX.Serialization.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxSerializationVersion

    internal fun KotlinX.Serialization.dependencyAsString(version: String) = moduleName joinWithColon version

}
