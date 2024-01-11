package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestExtJUnitGTestScope internal constructor(
    private val androidXTestExtJUnitGTestVersion: String
) {

    @ExperimentalEpitApi
    val Epit.junit_gtest
        get() = AndroidX.Test.Ext.JUnitGTest.junit_gtest.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.junit_gtest(version: String) =
        AndroidX.Test.Ext.JUnitGTest.junit_gtest.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Test.Ext.JUnitGTest.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtJUnitGTestVersion

    internal fun AndroidX.Test.Ext.JUnitGTest.dependencyAsString(version: String) = moduleName joinWithColon version

}
