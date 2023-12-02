package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxAtomicFUScope internal constructor(
    internal val kotlinxAtomicfuVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.AtomicFU.dependency
        get(): String = moduleName joinWithColon kotlinxAtomicfuVersion

    @ExperimentalEpitApi
    fun KotlinX.AtomicFU.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(atomicFU: KotlinX.AtomicFU) {
        add("implementation", atomicFU.dependency)
    }

    @ExperimentalEpitApi
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}

