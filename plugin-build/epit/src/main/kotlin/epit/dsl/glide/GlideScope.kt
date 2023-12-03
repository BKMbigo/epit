package epit.dsl.glide

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope


@ExperimentalEpitApi
@EpitDsl
class EpitGlideScope internal constructor(
    private val glideVersion: String
) {
    @ExperimentalEpitApi
    val Glide.Glide.dependency
        get(): String = moduleName joinWithColon glideVersion

    @ExperimentalEpitApi
    fun Glide.Glide.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(glide: Glide.Glide) {
        add("implementation", glide.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
