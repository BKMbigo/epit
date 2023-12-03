package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestExtJUnitScope internal constructor(
    private val androidXTestExtJunitVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.JUnit.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtJunitVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.JUnit.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(jUnit: AndroidX.Test.Ext.JUnit) {
        add("implementation", jUnit.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
