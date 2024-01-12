package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXDocumentFileScope internal constructor(
    private val androidXDocumentFileVersion: String
) {

    @ExperimentalEpitApi
    val Epit.documentfile
        get() = AndroidX.DocumentFile.documentfile.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.documentfile(version: String) =
        AndroidX.DocumentFile.documentfile.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DocumentFile.dependencyAsString
        get() = moduleName joinWithColon androidXDocumentFileVersion

    internal fun AndroidX.DocumentFile.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
