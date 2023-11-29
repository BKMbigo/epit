package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXLifecycleScope(
    private val androidXLifecycleVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Lifecycle.dependency
        get(): String = "${this.moduleName}:${androidXLifecycleVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Lifecycle.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(lifecycle: AndroidX.Lifecycle) {
        add("implementation", lifecycle.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
