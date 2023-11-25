package epit.dsl

import epit.dsl.firebase.Firebase
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitFirebaseScope(
    internal val firebaseBOMVersion: String
) {

    val bom = "${Firebase.firebase_bom.moduleName}:${firebaseBOMVersion}"

    val Firebase.dependency
        get() = this.moduleName

    fun DependencyHandlerScope.implementation(firebase: Firebase) {
        add("implementation", firebase.moduleName)
    }
}
