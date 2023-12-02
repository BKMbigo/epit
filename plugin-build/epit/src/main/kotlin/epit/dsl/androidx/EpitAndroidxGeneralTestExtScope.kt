package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
@EpitDsl
object EpitAndroidxGeneralTestExtScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.jUnit(
        testExtJUnitVersion: String,
        block: EpitAndroidXTestExtJUnitScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtJUnitScope(testExtJUnitVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.jUnitGTest(
        testExtJUnitGTestVersion: String,
        block: EpitAndroidXTestExtJUnitGTestScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtJUnitGTestScope(testExtJUnitGTestVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.truth(
        testExtJUnitTruthVersion: String,
        block: EpitAndroidXTestExtTruthScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtTruthScope(testExtJUnitTruthVersion))
    }


}
