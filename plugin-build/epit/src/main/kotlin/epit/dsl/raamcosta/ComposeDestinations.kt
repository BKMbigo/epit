package epit.dsl.raamcosta

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@EpitDsl
class EpitComposeDestinationsScope internal constructor(
    private val composeDestinationsVersion: String
) {
    @ExperimentalEpitApi
    val Raamcosta.ComposeDestinations.dependencyAsString
        get(): String = moduleName joinWithColon composeDestinationsVersion

    @ExperimentalEpitApi
    fun Raamcosta.ComposeDestinations.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeDestinations: Raamcosta.ComposeDestinations) {
        add("implementation", composeDestinations.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
