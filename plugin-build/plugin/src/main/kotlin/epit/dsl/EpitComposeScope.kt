package epit.dsl

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

}

