package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXAutofillScope internal constructor(
    internal val androidxAutofillVersion: String
) {

    @ExperimentalEpitApi
    val Epit.autofill
        get(): String = AndroidX.Autofill.autofill.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.autofill(version: String) =
        AndroidX.Autofill.autofill.dependencyAsString(version)

    /*
    * ===========================
    * ==== Internal Function ====
    * ===========================
    *  */

    internal val AndroidX.Autofill.dependencyAsString
        get(): String = moduleName joinWithColon androidxAutofillVersion

    internal fun AndroidX.Autofill.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
