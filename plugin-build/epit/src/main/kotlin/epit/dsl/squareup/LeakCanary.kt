package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitSquareLeakCanaryScope(
    private val squareLeakCanaryVersion: String
) {
    @ExperimentalEpitApi
    val SquareUp.LeakCanary.dependency
        get(): String = "${this.moduleName}:${squareLeakCanaryVersion}"

    @ExperimentalEpitApi
    fun SquareUp.LeakCanary.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(leakCanary: SquareUp.LeakCanary) {
        add("implementation", leakCanary.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
