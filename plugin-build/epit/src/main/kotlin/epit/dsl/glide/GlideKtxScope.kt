package epit.dsl.glide

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val Glide.GlideKtx.dependencyAsString
        get(): String = moduleName joinWithColon glideKtxVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun Glide.GlideKtx.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(glideKtx: Glide.GlideKtx) {
        add("implementation", glideKtx.dependencyAsString)
    }
}
