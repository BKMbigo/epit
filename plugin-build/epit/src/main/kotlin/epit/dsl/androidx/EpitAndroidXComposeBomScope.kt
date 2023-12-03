package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeBomScope internal constructor(
    internal val composeBOMVersion: String
) {

    /** Returns platform(bom) */
    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsDependency)

    /* Returns bom as a string */
    @ExperimentalEpitApi
    val bomAsDependency = AndroidX.Compose.Bom.compose_bom.moduleName joinWithColon composeBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsDependency(customVersion))

    @ExperimentalEpitApi
    fun bomAsDependency(customVersion: String) = AndroidX.Compose.Bom.compose_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val AndroidX.Compose.ComposeBomDependency.dependency
        get() = this.moduleName

    @ExperimentalEpitApi
    fun AndroidX.Compose.dependency(version: String) = moduleName joinWithColon version

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

