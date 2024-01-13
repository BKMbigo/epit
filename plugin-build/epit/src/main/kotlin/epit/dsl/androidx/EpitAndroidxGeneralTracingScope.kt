package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@EpitDsl
object EpitAndroidxGeneralTracingScope {

    @ExperimentalEpitApi
    fun tracing(tracingVersion: String, block: EpitAndroidXTracingScope.() -> Unit) {
        block(EpitAndroidXTracingScope(tracingVersion))
    }

    @ExperimentalEpitApi
    fun tracingperfetto(tracingPerfettoVersion: String, block: EpitAndroidXTracingPerfettoScope.() -> Unit) {
        block(EpitAndroidXTracingPerfettoScope(tracingPerfettoVersion))
    }

}
