package epit.dsl.glide

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @InternalEpitApi
    @ExperimentalEpitApi
    val Glide.GlideKtx.dependencyAsString
        get(): String = moduleName joinWithColon glideKtxVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun Glide.GlideKtx.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(glideKtx: Glide.GlideKtx) {
        add("implementation", glideKtx.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
