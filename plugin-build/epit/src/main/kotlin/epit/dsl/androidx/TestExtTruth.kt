package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Ext.Truth.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtTruthVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Ext.Truth.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(truth: AndroidX.Test.Ext.Truth) {
        add("implementation", truth.dependencyAsString)
    }
}
