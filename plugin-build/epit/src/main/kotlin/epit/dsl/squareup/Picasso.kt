package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitSquarePicassoScope(
    private val squarePicassoVersion: String
) {
    @ExperimentalEpitApi
    val SquareUp.Picasso.dependency
        get(): String = "${this.moduleName}:${squarePicassoVersion}"

    @ExperimentalEpitApi
    fun SquareUp.Picasso.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(picasso: SquareUp.Picasso) {
        add("implementation", picasso.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
