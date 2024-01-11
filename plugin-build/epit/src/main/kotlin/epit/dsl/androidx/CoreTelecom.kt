package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreTelecomScope internal constructor(
    private val androidXCoreTelecomVersion: String
) {

    /* androidx.core:core-telecom */
    @ExperimentalEpitApi
    val Epit.core_telecom
        get() = AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_telecom(version: String) =
        AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString(version)


    internal val AndroidX.Core.CoreTelecom.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreTelecomVersion

    internal fun AndroidX.Core.CoreTelecom.dependencyAsString(version: String) = moduleName joinWithColon version

}
