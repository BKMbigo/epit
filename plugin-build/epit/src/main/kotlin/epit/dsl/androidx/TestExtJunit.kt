package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestExtJUnitScope internal constructor(
    private val androidXTestExtJunitVersion: String
) {

    @ExperimentalEpitApi
    val Epit.junit
        get() = AndroidX.Test.Ext.JUnit.junit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.junit(version: String) =
        AndroidX.Test.Ext.JUnit.junit.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.junit_ktx
        get() = AndroidX.Test.Ext.JUnit.junit_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.junit_ktx(version: String) =
        AndroidX.Test.Ext.JUnit.junit_ktx.dependencyAsString(version)

    /* internal functions */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.JUnit.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtJunitVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.JUnit.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(jUnit: AndroidX.Test.Ext.JUnit) {
        add("implementation", jUnit.dependencyAsString)
    }
}
