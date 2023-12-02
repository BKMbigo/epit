package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestExtTruthScope(
    private val androidXTestExtTruthVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.Truth.dependency
        get(): String = moduleName joinWithColon androidXTestExtTruthVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.Truth.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(truth: AndroidX.Test.Ext.Truth) {
        add("implementation", truth.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
