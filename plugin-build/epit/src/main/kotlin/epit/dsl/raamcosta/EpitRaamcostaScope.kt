package epit.dsl.raamcosta

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
object EpitRaamcostaScope {

    @ExperimentalEpitApi
    fun EpitRaamcostaScope.composeDestinations(
        composeDestinationsVersion: String,
        block: EpitComposeDestinationsScope.() -> Unit
    ) {
        block(EpitComposeDestinationsScope(composeDestinationsVersion))
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
