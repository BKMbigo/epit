package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoIdlingScope(
    private val androidXTestEspressoIdlingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspressoIdling.dependency
        get(): String = "${this.moduleName}:${androidXTestEspressoIdlingVersion}"

    @ExperimentalEpitApi
    fun AndroidX.TestEspressoIdling.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspressoIdling: AndroidX.TestEspressoIdling) {
        add("implementation", testEspressoIdling.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
