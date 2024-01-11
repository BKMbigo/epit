package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.EspressoDevice.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoDeviceVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.EspressoDevice.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espressoDevice: AndroidX.Test.Espresso.EspressoDevice) {
        add("implementation", espressoDevice.dependencyAsString)
    }
}
