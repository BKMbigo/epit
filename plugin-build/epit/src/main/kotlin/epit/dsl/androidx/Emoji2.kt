package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXEmoji2Scope internal constructor(
    private val androidXEmoji2Version: String
) {

    @ExperimentalEpitApi
    val Epit.emoji2
        get() = epit.dependencies.AndroidX.Emoji2.emoji2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji2(version: String) =
        epit.dependencies.AndroidX.Emoji2.emoji2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji2_bundled
        get() = epit.dependencies.AndroidX.Emoji2.emoji2_bundled.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji2_bundled(version: String) =
        epit.dependencies.AndroidX.Emoji2.emoji2_bundled.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji2_emojipicker
        get() = epit.dependencies.AndroidX.Emoji2.emoji2_emojipicker.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji2_emojipicker(version: String) =
        epit.dependencies.AndroidX.Emoji2.emoji2_emojipicker.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji2_views
        get() = epit.dependencies.AndroidX.Emoji2.emoji2_views.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji2_views(version: String) =
        epit.dependencies.AndroidX.Emoji2.emoji2_views.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji2_views_helper
        get() = epit.dependencies.AndroidX.Emoji2.emoji2_views_helper.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji2_views_helper(version: String) =
        epit.dependencies.AndroidX.Emoji2.emoji2_views_helper.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Emoji2.dependencyAsString
        get() = moduleName joinWithColon androidXEmoji2Version

    internal fun AndroidX.Emoji2.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
