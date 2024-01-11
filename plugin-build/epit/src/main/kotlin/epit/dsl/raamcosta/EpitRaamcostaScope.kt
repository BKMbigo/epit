package epit.dsl.raamcosta

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

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
}
