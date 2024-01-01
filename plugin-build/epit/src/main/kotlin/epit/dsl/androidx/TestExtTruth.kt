package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestExtTruthScope internal constructor(
    private val androidXTestExtTruthVersion: String
) {

    @ExperimentalEpitApi
    val Epit.truth
        get() = AndroidX.Test.Ext.Truth.truth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.truth(version: String) =
        AndroidX.Test.Ext.Truth.truth.dependencyAsString(version)

    /* Internal functions */

    @ExperimentalEpitApi
    val AndroidX.Test.Ext.Truth.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtTruthVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.Truth.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(truth: AndroidX.Test.Ext.Truth) {
        add("implementation", truth.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
