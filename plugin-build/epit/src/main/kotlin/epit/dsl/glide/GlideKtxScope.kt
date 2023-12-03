package epit.dsl.glide

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@EpitDsl
class EpitGlideKtxScope internal constructor(
    private val glideKtxVersion: String
) {
    @ExperimentalEpitApi
    val Glide.GlideKtx.dependencyAsString
        get(): String = moduleName joinWithColon glideKtxVersion

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
