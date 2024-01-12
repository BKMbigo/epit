package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXPreferenceScope internal constructor(
    private val androidxPreferenceVersion: String
) {

    @ExperimentalEpitApi
    val Epit.preference
        get() = AndroidX.Preference.preference.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.preference(version: String) =
        AndroidX.Preference.preference.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.preference_ktx
        get() = AndroidX.Preference.preference_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.preference_ktx(version: String) =
        AndroidX.Preference.preference_ktx.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Preference.dependencyAsString
        get() = moduleName joinWithColon androidxPreferenceVersion

    internal fun AndroidX.Preference.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
