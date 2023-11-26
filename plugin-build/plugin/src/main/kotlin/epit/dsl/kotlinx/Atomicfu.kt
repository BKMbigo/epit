package epit.dsl.kotlinx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class AtomicFU(
    internal val moduleName: String
) : KotlinxDependencies {
    atomicfu(moduleName = "org.jetbrains.kotlinx:atomicfu")
}

class EpitKotlinxAtomicFUScope internal constructor(
    private val kotinxAtomicfuVersion: String
) {
    val AtomicFU.dependency
        get(): String = "${this.moduleName}:${kotinxAtomicfuVersion}"

    fun AtomicFU.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(atomicFU: AtomicFU) {
        add("implementation", atomicFU.dependency)
    }
}

