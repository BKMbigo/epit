package epit.dsl.androidx

import epit.annotations.ExperimentalEpitApi

object EpitAndroidxGeneralComposeRuntimeScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeRuntimeScope.runtime(
        runtimeVersion: String,
        block: EpitAndroidXComposeRuntimeScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeScope(runtimeVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeRuntimeScope.runtimeTracing(
        composeRuntimeTracingVersion: String,
        block: EpitAndroidXComposeRuntimeTracingScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeTracingScope(composeRuntimeTracingVersion))
    }

}
