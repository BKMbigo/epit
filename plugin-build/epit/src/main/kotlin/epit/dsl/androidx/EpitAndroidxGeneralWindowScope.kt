package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@EpitDsl
object EpitAndroidxGeneralWindowScope {

    @ExperimentalEpitApi
    fun window(windowVersion: String, block: EpitAndroidXWindowScope.() -> Unit) {
        block(EpitAndroidXWindowScope(windowVersion))
    }

    @ExperimentalEpitApi
    fun windowextensionscore(
        windowExtensionsCoreVersion: String,
        block: EpitAndroidXWindowExtensionCoreScope.() -> Unit
    ) {
        block(EpitAndroidXWindowExtensionCoreScope(windowExtensionsCoreVersion))
    }

}
