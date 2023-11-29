package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxAtomicFUScope internal constructor(
    private val kotinxAtomicfuVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.AtomicFU.dependency
        get(): String = "${this.moduleName}:${kotinxAtomicfuVersion}"

    @ExperimentalEpitApi
    fun KotlinX.AtomicFU.dependency(version: String) = "${this.moduleName}:${version}"

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

