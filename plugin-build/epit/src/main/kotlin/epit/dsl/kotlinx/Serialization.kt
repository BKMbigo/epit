package epit.dsl.kotlinx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxSerializationScope internal constructor(
    internal val kotlinxSerializationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.serialization_core
        get() = KotlinX.Serialization.serialization_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.serialization_core(version: String) =
        KotlinX.Serialization.serialization_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.serialization_json
        get() = KotlinX.Serialization.serialization_json.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.serialization_json(version: String) =
        KotlinX.Serialization.serialization_json.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    @InternalEpitApi
    @ExperimentalEpitApi
    val KotlinX.Serialization.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxSerializationVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun KotlinX.Serialization.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(serialization: KotlinX.Serialization) {
        add("implementation", serialization.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
