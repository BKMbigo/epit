package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxCoroutinesScope internal constructor(
    private val kotlinxCoroutinesVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.Coroutines.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxCoroutinesVersion

    @ExperimentalEpitApi
    fun KotlinX.Coroutines.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coroutines: KotlinX.Coroutines) {
        add("implementation", coroutines.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
