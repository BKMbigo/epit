package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestExtJUnitScope(
    private val androidXTestExtJunitVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestExt.TestExtJUnit.dependency
        get(): String = moduleName joinWithColon androidXTestExtJunitVersion

    @ExperimentalEpitApi
    fun AndroidX.TestExt.TestExtJUnit.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testExtJUnit: AndroidX.TestExt.TestExtJUnit) {
        add("implementation", testExtJUnit.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
