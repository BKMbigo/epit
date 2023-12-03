package epit.dsl.firebase

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
        get() = platform(bomAsDependency)

    @ExperimentalEpitApi
    val bomAsDependency = Firebase.firebase_bom.moduleName joinWithColon firebaseBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsDependency(customVersion))

    @ExperimentalEpitApi
    fun bomAsDependency(customVersion: String) = Firebase.firebase_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val Firebase.dependency
        get() = moduleName

    @ExperimentalEpitApi
    fun Firebase.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(firebase: Firebase) {
        add("implementation", firebase.moduleName)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
