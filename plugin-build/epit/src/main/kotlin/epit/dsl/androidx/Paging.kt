package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXPagingScope(
    private val androidXPagingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Paging.dependency
        get(): String = "${this.moduleName}:${androidXPagingVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Paging.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(paging: AndroidX.Paging) {
        add("implementation", paging.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
