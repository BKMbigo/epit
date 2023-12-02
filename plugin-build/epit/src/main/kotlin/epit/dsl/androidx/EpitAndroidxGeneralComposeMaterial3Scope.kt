package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
@EpitDsl
object EpitAndroidxGeneralComposeMaterial3Scope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeMaterial3Scope.material3(
        material3Version: String,
        block: EpitAndroidXComposeMaterial3Scope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3Scope(material3Version))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeMaterial3Scope.material3Adaptive(
        composeMaterial3AdaptiveVersion: String,
        block: EpitAndroidXComposeMaterial3AdaptiveScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3AdaptiveScope(composeMaterial3AdaptiveVersion))
    }

}
