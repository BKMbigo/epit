package epit.dsl.google

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitGoogleAccompanistScope internal constructor(
    private val accompanistVersion: String
) {

    @ExperimentalEpitApi
    val Google.Accompanist.dependencyAsString
        get(): String = moduleName joinWithColon accompanistVersion

    @ExperimentalEpitApi
    fun Google.Accompanist.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(accompanist: Google.Accompanist) {
        add("implementation", accompanist.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
