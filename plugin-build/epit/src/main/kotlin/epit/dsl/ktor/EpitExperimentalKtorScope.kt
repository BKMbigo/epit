package epit.dsl.ktor

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitExperimentalKtorScope internal constructor(
    private val ktorBOMVersion: String
) {


    /* Internal Function */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = ktor_bom_module_name joinWithColon ktorBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = ktor_bom_module_name joinWithColon customVersion

    @ExperimentalEpitApi
    val Ktor.Ktor.dependencyAsString
        get() = moduleName

    @ExperimentalEpitApi
    fun Ktor.Ktor.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(ktor: Ktor.Ktor) {
        add("implementation", ktor.moduleName)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

    companion object {
        internal val ktor_bom_module_name = "io.ktor:ktor-bom"
    }
}
