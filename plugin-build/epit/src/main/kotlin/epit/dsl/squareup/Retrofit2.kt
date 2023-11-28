package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitSquareRetrofit2Scope(
    private val squareRetrofit2Version: String
) {
    @ExperimentalEpitApi
    val SquareUp.Retrofit2.dependency
        get(): String = "${this.moduleName}:${squareRetrofit2Version}"

    @ExperimentalEpitApi
    fun SquareUp.Retrofit2.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(retrofit2: SquareUp.Retrofit2) {
        add("implementation", retrofit2.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
