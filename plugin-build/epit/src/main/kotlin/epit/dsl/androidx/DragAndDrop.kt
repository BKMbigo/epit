package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXDragAndDropScope internal constructor(
    private val androidXDragAndDropVersion: String
) {

    @ExperimentalEpitApi
    val Epit.draganddrop
        get() = AndroidX.DragAndDrop.draganddrop.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.draganddrop(version: String) =
        AndroidX.DragAndDrop.draganddrop.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DragAndDrop.dependencyAsString
        get() = moduleName joinWithColon androidXDragAndDropVersion

    internal fun AndroidX.DragAndDrop.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
