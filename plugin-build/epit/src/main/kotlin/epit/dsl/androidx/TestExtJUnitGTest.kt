package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.JUnitGTest.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtJUnitGTestVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.JUnitGTest.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(jUnitGTest: AndroidX.Test.Ext.JUnitGTest) {
        add("implementation", jUnitGTest.dependencyAsString)
    }
}
