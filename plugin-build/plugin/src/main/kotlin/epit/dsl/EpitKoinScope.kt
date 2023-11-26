package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.koin.Koin
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitKoinScope(
    internal val koinBOMVersion: String
) {

    val bom = "${Koin.koin_bom.moduleName}:${koinBOMVersion}"

    fun bom(customVersion: String) = "${Koin.koin_bom.moduleName}:${customVersion}"

    val Koin.dependency
        get() = this.moduleName

    fun Koin.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(koin: Koin) {
        add("implementation", koin.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
