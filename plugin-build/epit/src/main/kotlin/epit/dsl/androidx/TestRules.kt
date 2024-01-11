package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Rules.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestRulesVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Rules.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(rules: AndroidX.Test.Rules) {
        add("implementation", rules.dependencyAsString)
    }
}
