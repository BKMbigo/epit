package epit.dsl.google

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitFirebaseScope internal constructor(
    internal val firebaseBOMVersion: String
) {

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = Google.Firebase.firebase_bom.moduleName joinWithColon firebaseBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = Google.Firebase.firebase_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val Google.Firebase.dependencyAsString
        get() = moduleName

    @ExperimentalEpitApi
    fun Google.Firebase.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(firebase: Google.Firebase) {
        add("implementation", firebase.moduleName)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
