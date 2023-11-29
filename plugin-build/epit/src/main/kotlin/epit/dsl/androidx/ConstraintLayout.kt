package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXConstraintLayoutScope(
    private val androidXConstraintLayoutVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayout.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutVersion}"

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayout.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayout: AndroidX.ConstraintLayout.ConstraintLayout) {
        add("implementation", constraintLayout.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
