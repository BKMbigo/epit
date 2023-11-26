package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Serialization(
    internal val moduleName: String
) : KotlinxDependencies {
    serialization_core(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-core"),
    serialization_json(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-json")
}

class EpitKotlinxSerializationScope internal constructor(
    private val kotinxSerializationVersion: String
) {
    val Serialization.dependency
        get(): String = "${this.moduleName}:${kotinxSerializationVersion}"

    fun Serialization.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(serialization: Serialization) {
        add("implementation", serialization.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
