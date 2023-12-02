package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXNavigationScope(
    private val androidXNavigationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Navigation.dependency
        get(): String = moduleName joinWithColon androidXNavigationVersion

    @ExperimentalEpitApi
    fun AndroidX.Navigation.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(navigation: AndroidX.Navigation) {
        add("implementation", navigation.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
