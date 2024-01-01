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
class EpitAndroidXTestEspressoIdlingScope internal constructor(
    private val androidXTestEspressoIdlingVersion: String
) {
    @ExperimentalEpitApi
    val Epit.idling_concurrent
        get() = AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.idling_concurrent(version: String) =
        AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.idling_net
        get() = AndroidX.Test.Espresso.Idling.idling_net.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.idling_net(version: String) =
        AndroidX.Test.Espresso.Idling.idling_net.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.Test.Espresso.Idling.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoIdlingVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Espresso.Idling.dependencyAsString(version: String) = moduleName joinWithColon version

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
