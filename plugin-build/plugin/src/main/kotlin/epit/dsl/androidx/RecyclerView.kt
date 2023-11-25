package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class RecyclerView(
    internal val moduleName: String
) : AndroidXDependencies {
    recyclerview(moduleName = "androidx.recyclerview:recyclerview"),
//    recyclerview_selection("androidx.recyclerview:recyclerview-selection")
}

class EpitAndroidXRecyclerViewScope(
    private val androidXRecyclerViewVersion: String
) {
    val RecyclerView.dependency
        get(): String = "${this.moduleName}:${androidXRecyclerViewVersion}"

    fun DependencyHandlerScope.implementation(recyclerView: RecyclerView) {
        add("implementation", recyclerView.dependency)
    }
}
