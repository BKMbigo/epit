package epit.dsl.glide

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Glide
import epit.utils.joinWithColon

@EpitDsl
class EpitGlideKtxScope internal constructor(
    private val glideKtxVersion: String
) {

    @ExperimentalEpitApi
    val Epit.ktx
        get() = Glide.GlideKtx.ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktx(version: String): String =
        Glide.GlideKtx.ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.compose
        get() = Glide.GlideKtx.compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compose(version: String): String =
        Glide.GlideKtx.compose.dependencyAsString(version)

    /* Internal functions */

    internal val Glide.GlideKtx.dependencyAsString
        get(): String = moduleName joinWithColon glideKtxVersion

    internal fun Glide.GlideKtx.dependencyAsString(version: String) = moduleName joinWithColon version

}
