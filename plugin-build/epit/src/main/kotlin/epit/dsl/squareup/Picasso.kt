package epit.dsl.squareup

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquarePicassoScope internal constructor(
    private val squarePicassoVersion: String
) {

    @ExperimentalEpitApi
    val Epit.picasso
        get() = SquareUp.Picasso.picasso.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.picasso(version: String) =
        SquareUp.Picasso.picasso.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.picasso_pollexor
        get() = SquareUp.Picasso.picasso_pollexor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.picasso_pollexor(version: String) =
        SquareUp.Picasso.picasso_pollexor.dependencyAsString(version)

    /* Internal Functions */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val SquareUp.Picasso.dependencyAsString
        get(): String = moduleName joinWithColon squarePicassoVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun SquareUp.Picasso.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(picasso: SquareUp.Picasso) {
        add("implementation", picasso.dependencyAsString)
    }
}
