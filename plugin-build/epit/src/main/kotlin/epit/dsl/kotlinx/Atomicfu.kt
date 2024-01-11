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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val KotlinX.AtomicFU.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxAtomicfuVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun KotlinX.AtomicFU.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(atomicFU: KotlinX.AtomicFU) {
        add("implementation", atomicFU.dependencyAsString)
    }
}

