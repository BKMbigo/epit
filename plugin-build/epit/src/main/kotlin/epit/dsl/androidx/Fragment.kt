package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXFragmentScope(
    private val androidXFragmentVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Fragment.dependency
        get(): String = this.moduleName joinWithColon androidXFragmentVersion

    @ExperimentalEpitApi
    fun AndroidX.Fragment.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(fragment: AndroidX.Fragment) {
        add("implementation", fragment.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
