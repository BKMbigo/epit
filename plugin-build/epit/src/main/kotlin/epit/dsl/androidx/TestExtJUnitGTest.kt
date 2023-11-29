package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestExtJUnitGTestScope(
    private val androidXTestExtJUnitGTestVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestExt.TestExtJUnitGTest.dependency
        get(): String = moduleName joinWithColon androidXTestExtJUnitGTestVersion

    @ExperimentalEpitApi
    fun AndroidX.TestExt.TestExtJUnitGTest.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testExtJUnitGTest: AndroidX.TestExt.TestExtJUnitGTest) {
        add("implementation", testExtJUnitGTest.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
