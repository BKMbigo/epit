package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXAppCompatScope internal constructor(
    private val androidXAppcompatVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Appcompat.dependencyAsString
        get(): String = moduleName joinWithColon androidXAppcompatVersion

    @ExperimentalEpitApi
    fun AndroidX.Appcompat.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(appcompat: AndroidX.Appcompat) {
        add("implementation", appcompat.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
