package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXRecyclerViewScope(
    private val androidXRecyclerViewVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.RecyclerView.dependency
        get(): String = moduleName joinWithColon androidXRecyclerViewVersion

    @ExperimentalEpitApi
    fun AndroidX.RecyclerView.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(recyclerView: AndroidX.RecyclerView) {
        add("implementation", recyclerView.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
