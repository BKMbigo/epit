package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Serialization(
    internal val moduleName: String
) : KotlinxDependencies {
    serialization_core(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-core"),
    serialization_json(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-json")
}

@ExperimentalEpitApi
class EpitKotlinxSerializationScope internal constructor(
    private val kotinxSerializationVersion: String
) {
    @ExperimentalEpitApi
    val Serialization.dependency
        get(): String = "${this.moduleName}:${kotinxSerializationVersion}"

    @ExperimentalEpitApi
    fun Serialization.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(serialization: Serialization) {
        add("implementation", serialization.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
