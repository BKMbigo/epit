package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoDeviceScope(
    private val androidXTestEspressoDeviceVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspressoDevice.dependency
        get(): String = moduleName joinWithColon androidXTestEspressoDeviceVersion

    @ExperimentalEpitApi
    fun AndroidX.TestEspressoDevice.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspressoDevice: AndroidX.TestEspressoDevice) {
        add("implementation", testEspressoDevice.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
