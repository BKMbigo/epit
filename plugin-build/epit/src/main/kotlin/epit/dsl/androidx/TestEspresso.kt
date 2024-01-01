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
class EpitAndroidXTestEspressoScope internal constructor(
    private val androidXTestEspressoVersion: String
) {

    @ExperimentalEpitApi
    val Epit.espresso_accessibility
        get() = AndroidX.Test.Espresso.Espresso.espresso_accessibility.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_accessibility(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_accessibility.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_contrib
        get() = AndroidX.Test.Espresso.Espresso.espresso_contrib.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_contrib(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_contrib.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_core
        get() = AndroidX.Test.Espresso.Espresso.espresso_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_core(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_idling_resource
        get() = AndroidX.Test.Espresso.Espresso.espresso_idling_resource.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_idling_resource(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_idling_resource.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_intents
        get() = AndroidX.Test.Espresso.Espresso.espresso_intents.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_intents(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_intents.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_remote
        get() = AndroidX.Test.Espresso.Espresso.espresso_remote.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_remote(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_remote.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.espresso_web
        get() = AndroidX.Test.Espresso.Espresso.espresso_web.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.espresso_web(version: String) =
        AndroidX.Test.Espresso.Espresso.espresso_web.dependencyAsString(version)

    // Idling
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

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(espressoIdling: AndroidX.Test.Espresso.Idling) {
        add("implementation", espressoIdling.dependencyAsString)
    }
}
