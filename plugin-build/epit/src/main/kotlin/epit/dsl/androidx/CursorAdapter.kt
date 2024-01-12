package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXCursorAdaptiveScope internal constructor(
    private val androidxCursorAdaptiveVersion: String
) {

    @ExperimentalEpitApi
    val Epit.cursoradapter
        get() = AndroidX.CursorAdapter.cursoradapter.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.cursoradapter(version: String) =
        AndroidX.CursorAdapter.cursoradapter.dependencyAsString(version)

    /*
    * ===========================
    * ==== Internal Function ====
    * ===========================
    * */

    internal val AndroidX.CursorAdapter.dependencyAsString
        get() = moduleName joinWithColon androidxCursorAdaptiveVersion

    internal fun AndroidX.CursorAdapter.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
