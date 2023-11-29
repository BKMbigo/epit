package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestExtTruthScope(
    private val androidXTestExtTruthVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestExt.TestExtTruth.dependency
        get(): String = moduleName joinWithColon androidXTestExtTruthVersion

    @ExperimentalEpitApi
    fun AndroidX.TestExt.TestExtTruth.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testExtTruth: AndroidX.TestExt.TestExtTruth) {
        add("implementation", testExtTruth.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
