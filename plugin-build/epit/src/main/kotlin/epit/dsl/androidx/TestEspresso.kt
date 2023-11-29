package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoScope(
    private val androidXTestEspressoVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspresso.dependency
        get(): String = moduleName joinWithColon androidXTestEspressoVersion

    @ExperimentalEpitApi
    val AndroidX.TestEspressoIdling.dependency
        get(): String = moduleName joinWithColon androidXTestEspressoVersion

    @ExperimentalEpitApi
    fun AndroidX.TestEspresso.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun AndroidX.TestEspressoIdling.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspresso: AndroidX.TestEspresso) {
        add("implementation", testEspresso.dependency)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspressoIdling: AndroidX.TestEspressoIdling) {
        add("implementation", testEspressoIdling.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}