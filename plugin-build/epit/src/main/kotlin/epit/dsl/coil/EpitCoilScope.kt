package epit.dsl.coil

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitCoilScope internal constructor(
    internal val coilBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = Coil.coil_bom.moduleName joinWithColon coilBOMVersion

    @ExperimentalEpitApi
    fun bom(customVersion: String) = Coil.coil_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val Coil.dependency
        get() = moduleName

    @ExperimentalEpitApi
    fun Coil.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coil: Coil) {
        add("implementation", coil.moduleName)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}
