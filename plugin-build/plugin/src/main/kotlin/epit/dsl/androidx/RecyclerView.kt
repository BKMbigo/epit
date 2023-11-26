package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class RecyclerView(
    internal val moduleName: String
) : AndroidXDependency {
    recyclerview(moduleName = "androidx.recyclerview:recyclerview"),
//    recyclerview_selection("androidx.recyclerview:recyclerview-selection")
}

class EpitAndroidXRecyclerViewScope(
    private val androidXRecyclerViewVersion: String
) {
    val RecyclerView.dependency
        get(): String = "${this.moduleName}:${androidXRecyclerViewVersion}"

    fun RecyclerView.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(recyclerView: RecyclerView) {
        add("implementation", recyclerView.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
