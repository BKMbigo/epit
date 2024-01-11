package epit.dsl.squareup

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.SquareUp
import epit.utils.joinWithColon

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

    internal val SquareUp.Picasso.dependencyAsString
        get(): String = moduleName joinWithColon squarePicassoVersion

    internal fun SquareUp.Picasso.dependencyAsString(version: String) = moduleName joinWithColon version

}
