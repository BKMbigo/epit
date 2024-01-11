package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.KotlinX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxAtomicFUScope internal constructor(
    internal val kotlinxAtomicfuVersion: String
) {

    @ExperimentalEpitApi
    val Epit.atomicfu
        get() = KotlinX.AtomicFU.atomicfu.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.atomicfu(version: String) =
        KotlinX.AtomicFU.atomicfu.dependencyAsString(version)

    /* Internal functions */

    internal val KotlinX.AtomicFU.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxAtomicfuVersion

    internal fun KotlinX.AtomicFU.dependencyAsString(version: String) = moduleName joinWithColon version

}

