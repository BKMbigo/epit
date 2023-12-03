package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquarePicassoScope internal constructor(
    private val squarePicassoVersion: String
) {
    @ExperimentalEpitApi
    val SquareUp.Picasso.dependencyAsString
        get(): String = moduleName joinWithColon squarePicassoVersion

    @ExperimentalEpitApi
    fun SquareUp.Picasso.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(picasso: SquareUp.Picasso) {
        add("implementation", picasso.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
