package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class ConstraintLayout(
    internal val moduleName: String
) : AndroidXDependencies {
    constraintlayout(moduleName = "androidx.constraintlayout:constraintlayout"),
//    constraintlayout_compose(moduleName = "androidx.constraintlayout:constraintlayout-compose"),
//    constraintlayout_compose_android(moduleName = "androidx.constraintlayout:constraintlayout-compose-android"),
//    constraintlayout_core(moduleName = "androidx.constraintlayout:constraintlayout-core"),
//    constraintlayout_solver(moduleName = "androidx.constraintlayout:constraintlayout-solver")
}

class EpitAndroidXConstraintLayoutScope(
    private val androidXConstraintLayoutVersion: String
) {
    val ConstraintLayout.dependency
        get(): String = "${this.moduleName}:${androidXConstraintLayoutVersion}"

    fun DependencyHandlerScope.implementation(constraintLayout: ConstraintLayout) {
        add("implementation", constraintLayout.dependency)
    }
}
