package epit.dsl.google

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencyhandler.EpitDependencyHandler

@ExperimentalEpitApi
@EpitDsl
class EpitGoogleScope internal constructor(
    private val dependencyHandler: EpitDependencyHandler
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
        with(dependencyHandler) {
            implementation(platform(firebaseScope.bomAsString))
        }
        block(firebaseScope)
    }
}
