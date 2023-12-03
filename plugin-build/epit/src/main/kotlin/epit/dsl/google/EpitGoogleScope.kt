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

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
