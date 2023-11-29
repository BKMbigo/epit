package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXComposeBomScope(
    internal val composeBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = "${AndroidX.Compose.Bom.compose_bom.moduleName}:${composeBOMVersion}"

    @ExperimentalEpitApi
    fun bom(customVersion: String) = "${AndroidX.Compose.Bom.compose_bom.moduleName}:${customVersion}"

    @ExperimentalEpitApi
    val AndroidX.Compose.ComposeBomDependency.dependency
        get() = this.moduleName

    @ExperimentalEpitApi
    fun AndroidX.Compose.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(compose: AndroidX.Compose.ComposeBomDependency) {
        add("implementation", compose.moduleName)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(composeDependency: AndroidX.Compose) {
        throw IllegalStateException("The library is not included in the Bill Of Materials. You have to specifically include its version")
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}

