package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.EspressoDevice.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoDeviceVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.EspressoDevice.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espressoDevice: AndroidX.Test.Espresso.EspressoDevice) {
        add("implementation", espressoDevice.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
