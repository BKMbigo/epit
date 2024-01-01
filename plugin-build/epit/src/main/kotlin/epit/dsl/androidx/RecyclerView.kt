package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXRecyclerViewScope internal constructor(
    private val androidXRecyclerViewVersion: String
) {

    @ExperimentalEpitApi
    val Epit.recyclerview
        get() = AndroidX.RecyclerView.recyclerview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.recyclerview(version: String) =
        AndroidX.RecyclerView.recyclerview.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.RecyclerView.dependencyAsString
        get(): String = moduleName joinWithColon androidXRecyclerViewVersion

    @ExperimentalEpitApi
    fun AndroidX.RecyclerView.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(recyclerView: AndroidX.RecyclerView) {
        add("implementation", recyclerView.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
