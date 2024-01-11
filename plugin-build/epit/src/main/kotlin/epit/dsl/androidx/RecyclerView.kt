package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXRecyclerViewScope internal constructor(
    private val androidXRecyclerViewVersion: String
) {

    @ExperimentalEpitApi
    val Epit.recyclerview
        get() = AndroidX.RecyclerView.recyclerview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.recyclerview(version: String) =
        AndroidX.RecyclerView.recyclerview.dependencyAsString(version)

    /* Internal Functions  */

    internal val AndroidX.RecyclerView.dependencyAsString
        get(): String = moduleName joinWithColon androidXRecyclerViewVersion

    internal fun AndroidX.RecyclerView.dependencyAsString(version: String) = moduleName joinWithColon version

}
