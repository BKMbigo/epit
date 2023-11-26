package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class AtomicFU(
    internal val moduleName: String
) : KotlinxDependencies {
    atomicfu(moduleName = "org.jetbrains.kotlinx:atomicfu")
}

@ExperimentalEpitApi
class EpitKotlinxAtomicFUScope internal constructor(
    private val kotinxAtomicfuVersion: String
) {
    @ExperimentalEpitApi
    val AtomicFU.dependency
        get(): String = "${this.moduleName}:${kotinxAtomicfuVersion}"

    @ExperimentalEpitApi
    fun AtomicFU.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(atomicFU: AtomicFU) {
        add("implementation", atomicFU.dependency)
    }

    @ExperimentalEpitApi
    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}

