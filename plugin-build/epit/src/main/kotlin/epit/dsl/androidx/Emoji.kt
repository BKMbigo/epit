package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXEmojiScope internal constructor(
    private val androidXEmojiVersion: String
) {

    @ExperimentalEpitApi
    val Epit.emoji
        get() = epit.dependencies.AndroidX.Emoji.emoji.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji(version: String) =
        epit.dependencies.AndroidX.Emoji.emoji.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji_appcompat
        get() = epit.dependencies.AndroidX.Emoji.emoji_appcompat.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji_appcompat(version: String) =
        epit.dependencies.AndroidX.Emoji.emoji_appcompat.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.emoji_bundled
        get() = epit.dependencies.AndroidX.Emoji.emoji_bundled.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.emoji_bundled(version: String) =
        epit.dependencies.AndroidX.Emoji.emoji_bundled.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Emoji.dependencyAsString
        get() = moduleName joinWithColon androidXEmojiVersion

    internal fun AndroidX.Emoji.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
