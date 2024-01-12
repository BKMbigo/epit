package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxViewPager2Scope internal constructor(
    private val androidxViewPager2Version: String
) {

    @ExperimentalEpitApi
    val Epit.viewpager2
        get() = AndroidX.ViewPager2.viewpager2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.viewpager(version: String) =
        AndroidX.ViewPager2.viewpager2.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.ViewPager2.dependencyAsString
        get() = moduleName joinWithColon androidxViewPager2Version

    internal fun AndroidX.ViewPager2.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
