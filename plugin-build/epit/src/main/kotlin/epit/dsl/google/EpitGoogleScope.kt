package epit.dsl.google

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitGoogleScope internal constructor(
    private val dependencyHandlerScope: DependencyHandlerScope
) {

    @ExperimentalEpitApi
    fun accompanist(
        accompanistVersion: String,
        block: EpitGoogleAccompanistScope.() -> Unit
    ) {
        block(EpitGoogleAccompanistScope(accompanistVersion))
    }

    @ExperimentalEpitApi
    fun firebaseBom(bomVersion: String, block: EpitFirebaseScope.() -> Unit) {
        val firebaseScope = EpitFirebaseScope(bomVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(firebaseScope.bomAsString))
        }
        block(firebaseScope)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
