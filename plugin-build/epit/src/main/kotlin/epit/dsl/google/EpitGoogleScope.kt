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
}
