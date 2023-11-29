package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestEspressoIdlingScope(
    private val androidXTestEspressoIdlingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestEspressoIdling.dependency
        get(): String = moduleName joinWithColon androidXTestEspressoIdlingVersion

    @ExperimentalEpitApi
    fun AndroidX.TestEspressoIdling.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testEspressoIdling: AndroidX.TestEspressoIdling) {
        add("implementation", testEspressoIdling.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
