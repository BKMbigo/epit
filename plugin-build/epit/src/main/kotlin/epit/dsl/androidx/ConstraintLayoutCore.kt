package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope


@ExperimentalEpitApi
class EpitAndroidXConstraintLayoutCoreScope(
    private val androidXConstraintLayoutCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.ConstraintLayout.ConstraintLayoutCore.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutCoreVersion}"

    @ExperimentalEpitApi
    fun AndroidX.ConstraintLayout.ConstraintLayoutCore.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCore: AndroidX.ConstraintLayout.ConstraintLayoutCore) {
        add("implementation", constraintLayoutCore.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
