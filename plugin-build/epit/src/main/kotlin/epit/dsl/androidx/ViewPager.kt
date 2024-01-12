package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxViewPagerScope internal constructor(
    private val androidxViewPagerVersion: String
) {

    @ExperimentalEpitApi
    val Epit.viewpager
        get() = AndroidX.ViewPager.viewpager.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.viewpager(version: String) =
        AndroidX.ViewPager.viewpager.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.ViewPager.dependencyAsString
        get() = moduleName joinWithColon androidxViewPagerVersion

    internal fun AndroidX.ViewPager.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
