package epit.dsl.androidx

import Epit
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXBiometricScope internal constructor(
    private val androidXBiometric: String
) {

    val Epit.biometric
        get(): String = AndroidX.Biometric.biometric.dependencyAsString

    fun Epit.biometric(version: String) =
        AndroidX.Biometric.biometric.dependencyAsString(version)

    val Epit.biometric_ktx
        get(): String = AndroidX.Biometric.biometric_ktx.dependencyAsString

    fun Epit.biometric_ktx(version: String) =
        AndroidX.Biometric.biometric_ktx.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Biometric.dependencyAsString
        get(): String = moduleName joinWithColon androidXBiometric

    internal fun AndroidX.Biometric.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
