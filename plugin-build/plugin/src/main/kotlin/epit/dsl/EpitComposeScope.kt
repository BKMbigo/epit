package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose.Compose
import epit.dsl.compose.moduleName
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitComposeScope(
    internal val composeBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = "${Compose.ComposeBom.compose_bom.moduleName}:${composeBOMVersion}"

    @ExperimentalEpitApi
    fun bom(customVersion: String) = "${Compose.ComposeBom.compose_bom.moduleName}:${customVersion}"

    @ExperimentalEpitApi
    val Compose.dependency
        get() = this.moduleName

    @ExperimentalEpitApi
    fun Compose.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(compose: Compose) {
        add("implementation", compose.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}

