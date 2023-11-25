package epit.dsl

import epit.dsl.koin.Koin
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitKoinScope(
    internal val koinBOMVersion: String
) {

    val bom = "${Koin.koin_bom.moduleName}:${koinBOMVersion}"

    val Koin.dependency
        get() = this.moduleName

    fun DependencyHandlerScope.implementation(koin: Koin) {
        add("implementation", koin.moduleName)
    }
}
