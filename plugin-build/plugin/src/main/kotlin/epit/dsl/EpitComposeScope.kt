package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.compose.Compose
import epit.dsl.compose.moduleName
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitComposeScope(
    internal val composeBOMVersion: String
) {

    val bom = "${Compose.ComposeBom.compose_bom.moduleName}:${composeBOMVersion}"

    fun bom(customVersion: String) = "${Compose.ComposeBom.compose_bom.moduleName}:${customVersion}"

    val Compose.dependency
        get() = this.moduleName

    fun Compose.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(compose: Compose) {
        add("implementation", compose.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}

