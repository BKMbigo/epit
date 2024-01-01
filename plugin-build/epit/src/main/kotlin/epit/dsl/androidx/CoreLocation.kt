package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreLocationScope internal constructor(
    private val androidXCoreLocationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core_i18n
        get() = AndroidX.Core.CoreLocation.core_i18n.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_i18n(version: String) =
        AndroidX.Core.CoreLocation.core_i18n.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core_location_altitude
        get() = AndroidX.Core.CoreLocation.core_location_altitude.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_location_altitude(version: String) =
        AndroidX.Core.CoreLocation.core_location_altitude.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Core.CoreLocation.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreLocationVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreLocation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreLocation: AndroidX.Core.CoreLocation) {
        add("implementation", coreLocation.dependencyAsString)
    }
}
