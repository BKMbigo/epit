package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.firebase.Firebase
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitFirebaseScope(
    internal val firebaseBOMVersion: String
) {

    val bom = "${Firebase.firebase_bom.moduleName}:${firebaseBOMVersion}"

    fun bom(customVersion: String) = "${Firebase.firebase_bom.moduleName}:${customVersion}"

    val Firebase.dependency
        get() = this.moduleName

    fun Firebase.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(firebase: Firebase) {
        add("implementation", firebase.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
