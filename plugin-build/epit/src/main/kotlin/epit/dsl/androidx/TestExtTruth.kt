package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    internal val AndroidX.Test.Ext.Truth.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestExtTruthVersion

    internal fun AndroidX.Test.Ext.Truth.dependencyAsString(version: String) = moduleName joinWithColon version

}
