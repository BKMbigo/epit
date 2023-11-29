package epit.dsl.androidx

import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
object EpitAndroidxGeneralTestExtScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.testExtJUnit(
        testExtJUnitVersion: String,
        block: EpitAndroidXTestExtJUnitScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtJUnitScope(testExtJUnitVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.testExtJUnitGTest(
        testExtJUnitGTestVersion: String,
        block: EpitAndroidXTestExtJUnitGTestScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtJUnitGTestScope(testExtJUnitGTestVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralTestExtScope.testExtJUnitTruth(
        testExtJUnitTruthVersion: String,
        block: EpitAndroidXTestExtTruthScope.() -> Unit
    ) {
        block(EpitAndroidXTestExtTruthScope(testExtJUnitTruthVersion))
    }


}
