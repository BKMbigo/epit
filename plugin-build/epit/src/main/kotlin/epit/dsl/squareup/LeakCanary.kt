package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareLeakCanaryScope(
    private val squareLeakCanaryVersion: String
) {
    @ExperimentalEpitApi
    val SquareUp.LeakCanary.dependency
        get(): String = moduleName joinWithColon squareLeakCanaryVersion

    @ExperimentalEpitApi
    fun SquareUp.LeakCanary.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(leakCanary: SquareUp.LeakCanary) {
        add("implementation", leakCanary.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
