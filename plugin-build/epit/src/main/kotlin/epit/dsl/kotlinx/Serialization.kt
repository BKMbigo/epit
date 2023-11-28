package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxSerializationScope internal constructor(
    private val kotinxSerializationVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.Serialization.dependency
        get(): String = "${this.moduleName}:${kotinxSerializationVersion}"

    @ExperimentalEpitApi
    fun KotlinX.Serialization.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(serialization: KotlinX.Serialization) {
        add("implementation", serialization.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
