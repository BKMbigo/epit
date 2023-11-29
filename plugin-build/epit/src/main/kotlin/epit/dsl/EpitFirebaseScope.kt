package epit.dsl

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.dsl.firebase.Firebase
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitFirebaseScope(
    internal val firebaseBOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = "${Firebase.firebase_bom.moduleName}:${firebaseBOMVersion}"

    @ExperimentalEpitApi
    fun bom(customVersion: String) = "${Firebase.firebase_bom.moduleName}:${customVersion}"

    @ExperimentalEpitApi
    val Firebase.dependency
        get() = this.moduleName

    @ExperimentalEpitApi
    fun Firebase.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(firebase: Firebase) {
        add("implementation", firebase.moduleName)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
