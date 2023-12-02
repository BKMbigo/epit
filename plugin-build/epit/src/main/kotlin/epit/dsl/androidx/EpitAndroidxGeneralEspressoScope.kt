package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@EpitDsl
object EpitAndroidxGeneralEspressoScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralEspressoScope.espresso(
        espressoVersion: String,
        block: EpitAndroidXTestEspressoScope.() -> Unit
    ) {
        block(EpitAndroidXTestEspressoScope(espressoVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralEspressoScope.espressoDevice(
        espressoDeviceVersion: String,
        block: EpitAndroidXTestEspressoDeviceScope.() -> Unit
    ) {
        block(EpitAndroidXTestEspressoDeviceScope(espressoDeviceVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralEspressoScope.espressoIdling(
        espressoIdlingVersion: String,
        block: EpitAndroidXTestEspressoIdlingScope.() -> Unit
    ) {
        block(EpitAndroidXTestEspressoIdlingScope(espressoIdlingVersion))
    }
}
