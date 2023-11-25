package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class ConstraintLayoutCompose(
    internal val moduleName: String
) : AndroidXDependencies {
    //    constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout"),
    constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose"),
    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android"),
//    constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core"),
//    constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver")
}

class EpitAndroidXConstraintLayoutComposeScope(
    private val androidXConstraintLayoutComposeVersion: String
) {
    val ConstraintLayoutCompose.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutComposeVersion}"

    fun DependencyHandlerScope.implementation(constraintLayoutCompose: ConstraintLayoutCompose) {
        add("implementation", constraintLayoutCompose.dependency)
    }
}
