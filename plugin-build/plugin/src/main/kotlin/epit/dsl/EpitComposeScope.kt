package epit.dsl

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitComposeScope(
    internal val composeBOMVersion: String
) {

    val bom = "${Compose.compose_bom.moduleName}:${composeBOMVersion}"

    val Compose.dependency
        get() = this.moduleName

    fun DependencyHandlerScope.implementation(compose: Compose) {
        add("implementation", compose.moduleName)
    }

}

