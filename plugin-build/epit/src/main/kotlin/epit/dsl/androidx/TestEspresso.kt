package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestEspressoScope internal constructor(
    private val androidXTestEspressoVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.Espresso.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoVersion

    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.Idling.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.Espresso.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.Idling.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espresso: AndroidX.Test.Espresso.Espresso) {
        add("implementation", espresso.dependencyAsString)
    }

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espressoIdling: AndroidX.Test.Espresso.Idling) {
        add("implementation", espressoIdling.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
