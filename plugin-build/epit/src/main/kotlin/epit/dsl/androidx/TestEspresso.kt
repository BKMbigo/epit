package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoScope(
    private val androidXTestEspressoVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspresso.dependency
        get(): String = "${this.moduleName}:${androidXTestEspressoVersion}"

    @ExperimentalEpitApi
    fun AndroidX.TestEspresso.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspresso: AndroidX.TestEspresso) {
        add("implementation", testEspresso.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
