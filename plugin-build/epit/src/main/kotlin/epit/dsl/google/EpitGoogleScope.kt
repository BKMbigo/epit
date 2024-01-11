package epit.dsl.google

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
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
}
