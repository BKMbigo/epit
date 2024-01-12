package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXMedia2Scope internal constructor(
    private val androidxGridLayoutVersion: String
) {

    @ExperimentalEpitApi
    val Epit.media2_common
        get() = AndroidX.Media2.media2_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media2_common(version: String) =
        AndroidX.Media2.media2_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media2_exoplayer
        get() = AndroidX.Media2.media2_exoplayer.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media2_exoplayer(version: String) =
        AndroidX.Media2.media2_exoplayer.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media2_player
        get() = AndroidX.Media2.media2_player.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media2_player(version: String) =
        AndroidX.Media2.media2_player.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media2_session
        get() = AndroidX.Media2.media2_session.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media2_session(version: String) =
        AndroidX.Media2.media2_session.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media2_widget
        get() = AndroidX.Media2.media2_widget.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media2_widget(version: String) =
        AndroidX.Media2.media2_widget.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Media2.dependencyAsString
        get() = moduleName joinWithColon androidxGridLayoutVersion

    internal fun AndroidX.Media2.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
