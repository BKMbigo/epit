package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXFragmentScope internal constructor(
    private val androidXFragmentVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Fragment.dependencyAsString
        get(): String = this.moduleName joinWithColon androidXFragmentVersion

    @ExperimentalEpitApi
    fun AndroidX.Fragment.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(fragment: AndroidX.Fragment) {
        add("implementation", fragment.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
