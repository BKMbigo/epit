package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXConstraintLayoutComposeScope(
    private val androidXConstraintLayoutComposeVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutComposeVersion}"

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCompose.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCompose: AndroidX.ConstraintLayout.ConstraintLayoutCompose) {
        add("implementation", constraintLayoutCompose.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
