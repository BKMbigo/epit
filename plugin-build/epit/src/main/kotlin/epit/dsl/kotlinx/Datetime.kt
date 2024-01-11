package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.KotlinX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxDatetimeScope internal constructor(
    internal val kotlinxDatetimeVersion: String
) {

    @ExperimentalEpitApi
    val Epit.datetime
        get() = KotlinX.Datetime.datetime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datetime(version: String) =
        KotlinX.Datetime.datetime.dependencyAsString(version)

    /* Internal Functions */

    internal val KotlinX.Datetime.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxDatetimeVersion


    internal fun KotlinX.Datetime.dependencyAsString(version: String) = moduleName joinWithColon version

}
