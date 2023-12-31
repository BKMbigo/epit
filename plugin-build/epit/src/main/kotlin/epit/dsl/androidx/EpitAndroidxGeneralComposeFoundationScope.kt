package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
@EpitDsl
object EpitAndroidxGeneralComposeFoundationScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeFoundationScope.foundation(
        foundationVersion: String,
        block: EpitAndroidXComposeFoundationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationScope(foundationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeFoundationScope.foundationText(
        foundationTextVersion: String,
        block: EpitAndroidXComposeFoundationTextScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationTextScope(foundationTextVersion))
    }
}
