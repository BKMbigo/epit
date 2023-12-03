package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestExtJUnitGTestScope internal constructor(
    private val androidXTestExtJUnitGTestVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.JUnitGTest.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtJUnitGTestVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.JUnitGTest.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(jUnitGTest: AndroidX.Test.Ext.JUnitGTest) {
        add("implementation", jUnitGTest.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
