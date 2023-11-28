package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXRecyclerViewScope(
    private val androidXRecyclerViewVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.RecyclerView.dependency
        get(): String = "${this.moduleName}:${androidXRecyclerViewVersion}"

    @ExperimentalEpitApi
    fun AndroidX.RecyclerView.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(recyclerView: AndroidX.RecyclerView) {
        add("implementation", recyclerView.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
