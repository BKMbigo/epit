package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXAppCompatScope(
    private val androidXAppcompatVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Appcompat.dependency
        get(): String = "${this.moduleName}:${androidXAppcompatVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Appcompat.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(appcompat: AndroidX.Appcompat) {
        add("implementation", appcompat.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
