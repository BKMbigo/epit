package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXContentPagerScope internal constructor(
    private val androidXContentPagerVersion: String
) {

    @ExperimentalEpitApi
    val Epit.contentpager
        get() = AndroidX.ContentPager.contentpager.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.contentpager(version: String) =
        AndroidX.ContentPager.contentpager.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.ContentPager.dependencyAsString
        get() = moduleName joinWithColon androidXContentPagerVersion

    internal fun AndroidX.ContentPager.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
