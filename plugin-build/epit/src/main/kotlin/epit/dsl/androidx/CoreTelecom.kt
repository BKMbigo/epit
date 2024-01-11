package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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


    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreTelecom.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreTelecomVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreTelecom.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreTelecom: AndroidX.Core.CoreTelecom) {
        add("implementation", coreTelecom.dependencyAsString)
    }
}
