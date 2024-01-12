package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXExifInterfaceScope internal constructor(
    private val androidXExifInterfaceVersion: String
) {

    @ExperimentalEpitApi
    val Epit.exifinterface
        get() = AndroidX.ExifInterface.exifinterface.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.exifinterface(version: String) =
        AndroidX.ExifInterface.exifinterface.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.ExifInterface.dependencyAsString
        get() = moduleName joinWithColon androidXExifInterfaceVersion

    internal fun AndroidX.ExifInterface.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
