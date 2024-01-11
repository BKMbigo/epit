package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestEspressoDeviceScope internal constructor(
    private val androidXTestEspressoDeviceVersion: String
) {

    @ExperimentalEpitApi
    val Epit.espresso_device
        get() = AndroidX.Test.Espresso.EspressoDevice.espresso_device.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_device(version: String) =
        AndroidX.Test.Espresso.EspressoDevice.espresso_device.dependencyAsString(version)


    /* Internal Functions */

    internal val AndroidX.Test.Espresso.EspressoDevice.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoDeviceVersion

    internal fun AndroidX.Test.Espresso.EspressoDevice.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
