package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestRulesScope internal constructor(
    private val androidXTestRulesVersion: String
) {

    @ExperimentalEpitApi
    val Epit.rules
        get() = AndroidX.Test.Rules.rules.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.rules(version: String) =
        AndroidX.Test.Rules.rules.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    *  */

    internal val AndroidX.Test.Rules.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestRulesVersion

    internal fun AndroidX.Test.Rules.dependencyAsString(version: String) = moduleName joinWithColon version

}
