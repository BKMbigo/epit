package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXMediaScope internal constructor(
    private val androidxMediaVersion: String
) {

    @ExperimentalEpitApi
    val Epit.media
        get() = AndroidX.Media.media.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media(version: String) =
        AndroidX.Media.media.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media_widget
        get() = AndroidX.Media.media_widget.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media_widget(version: String) =
        AndroidX.Media.media_widget.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Media.dependencyAsString
        get() = moduleName joinWithColon androidxMediaVersion

    internal fun AndroidX.Media.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
