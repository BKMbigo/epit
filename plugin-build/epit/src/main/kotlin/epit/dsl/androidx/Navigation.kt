package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXNavigationScope(
    private val androidXNavigationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Navigation.dependency
        get(): String = "${this.moduleName}:${androidXNavigationVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Navigation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(navigation: AndroidX.Navigation) {
        add("implementation", navigation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
