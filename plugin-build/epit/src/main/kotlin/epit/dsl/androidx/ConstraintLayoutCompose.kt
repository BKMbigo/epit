package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class ConstraintLayoutCompose(
    internal val moduleName: String
) : AndroidXDependency {
    //    constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout"),
    constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose"),
    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android"),
//    constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core"),
//    constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver")
}

@ExperimentalEpitApi
class EpitAndroidXConstraintLayoutComposeScope(
    private val androidXConstraintLayoutComposeVersion: String
) {
    @ExperimentalEpitApi
    val ConstraintLayoutCompose.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutComposeVersion}"

    @ExperimentalEpitApi
    fun ConstraintLayoutCompose.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(constraintLayoutCompose: ConstraintLayoutCompose) {
        add("implementation", constraintLayoutCompose.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
