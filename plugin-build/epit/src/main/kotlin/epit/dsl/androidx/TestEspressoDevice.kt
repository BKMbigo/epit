package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoDeviceScope(
    private val androidXTestEspressoDeviceVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspressoDevice.dependency
        get(): String = "${this.moduleName}:${androidXTestEspressoDeviceVersion}"

    @ExperimentalEpitApi
    fun AndroidX.TestEspressoDevice.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspressoDevice: AndroidX.TestEspressoDevice) {
        add("implementation", testEspressoDevice.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
