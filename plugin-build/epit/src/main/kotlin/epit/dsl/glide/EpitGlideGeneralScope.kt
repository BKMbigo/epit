package epit.dsl.glide

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
@EpitDsl
object EpitGlideGeneralScope {

    @ExperimentalEpitApi
    fun EpitGlideGeneralScope.glide(
        glideVersion: String,
        block: EpitGlideScope.() -> Unit
    ) {
        block(EpitGlideScope(glideVersion))
    }

    @ExperimentalEpitApi
    fun EpitGlideGeneralScope.glideKtx(
        glideKtxVersion: String,
        block: EpitGlideKtxScope.() -> Unit
    ) {
        block(EpitGlideKtxScope(glideKtxVersion))
    }
}
