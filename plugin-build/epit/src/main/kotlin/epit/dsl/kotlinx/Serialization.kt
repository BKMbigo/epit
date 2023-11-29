package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxSerializationScope internal constructor(
    private val kotlinxSerializationVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.Serialization.dependency
        get(): String = moduleName joinWithColon kotlinxSerializationVersion

    @ExperimentalEpitApi
    fun KotlinX.Serialization.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(serialization: KotlinX.Serialization) {
        add("implementation", serialization.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
