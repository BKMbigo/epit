package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXBluetoothScope internal constructor(
    private val androidxBluetoothVersion: String
) {

    @ExperimentalEpitApi
    val Epit.bluetooth
        get() = AndroidX.Bluetooth.bluetooth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.bluetooth(version: String) =
        AndroidX.Bluetooth.bluetooth.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.bluetooth_testing
        get() = AndroidX.Bluetooth.bluetooth_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.bluetooth_testing(version: String) =
        AndroidX.Bluetooth.bluetooth_testing.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    *  */

    internal val AndroidX.Bluetooth.dependencyAsString
        get(): String = moduleName joinWithColon androidxBluetoothVersion

    internal fun AndroidX.Bluetooth.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
