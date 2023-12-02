package epit.dsl.voyager

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitVoyagerScope internal constructor(
    internal val voyagerVersion: String
) {
    @ExperimentalEpitApi
    val Voyager.dependency
        get() = moduleName joinWithColon voyagerVersion

    @ExperimentalEpitApi
    fun Voyager.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(voyager: Voyager) {
        add("implementation", voyager.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
