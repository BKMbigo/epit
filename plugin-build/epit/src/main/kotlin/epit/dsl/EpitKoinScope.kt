package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.koin.Koin
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKoinScope(
    internal val koinBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = "${Koin.koin_bom.moduleName}:${koinBOMVersion}"

    @ExperimentalEpitApi
    fun bom(customVersion: String) = "${Koin.koin_bom.moduleName}:${customVersion}"

    @ExperimentalEpitApi
    val Koin.dependency
        get() = this.moduleName

    @ExperimentalEpitApi
    fun Koin.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(koin: Koin) {
        add("implementation", koin.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
