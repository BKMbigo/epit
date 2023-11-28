package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXFragmentScope(
    private val androidXFragmentVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Fragment.dependency
        get(): String = "${this.moduleName}:${androidXFragmentVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Fragment.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(fragment: AndroidX.Fragment) {
        add("implementation", fragment.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
