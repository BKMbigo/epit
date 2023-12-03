package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareRetrofit2Scope internal constructor(
    private val squareRetrofit2Version: String
) {
    @ExperimentalEpitApi
    val SquareUp.Retrofit2.dependencyAsString
        get(): String = moduleName joinWithColon squareRetrofit2Version

    @ExperimentalEpitApi
    fun SquareUp.Retrofit2.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(retrofit2: SquareUp.Retrofit2) {
        add("implementation", retrofit2.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
