package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @InternalEpitApi
    @ExperimentalEpitApi
    val KotlinX.AtomicFU.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxAtomicfuVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun KotlinX.AtomicFU.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(atomicFU: KotlinX.AtomicFU) {
        add("implementation", atomicFU.dependencyAsString)
    }
}

