package epit.dsl.koin

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKoinScope internal constructor(
    internal val koinBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = Koin.koin_bom.moduleName joinWithColon koinBOMVersion

    @ExperimentalEpitApi
    fun bom(customVersion: String) = Koin.koin_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val Koin.dependency
        get() = moduleName

    @ExperimentalEpitApi
    fun Koin.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(koin: Koin) {
        add("implementation", koin.moduleName)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
