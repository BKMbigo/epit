package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestEspressoIdlingScope(
    private val androidXTestEspressoIdlingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.Idling.dependency
        get(): String = moduleName joinWithColon androidXTestEspressoIdlingVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.Idling.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espressoIdling: AndroidX.Test.Espresso.Idling) {
        add("implementation", espressoIdling.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
