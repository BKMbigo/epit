package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquarePicassoScope(
    private val squarePicassoVersion: String
) {
    @ExperimentalEpitApi
    val SquareUp.Picasso.dependency
        get(): String = moduleName joinWithColon squarePicassoVersion

    @ExperimentalEpitApi
    fun SquareUp.Picasso.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(picasso: SquareUp.Picasso) {
        add("implementation", picasso.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
