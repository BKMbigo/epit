package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestCoreScope(
    private val androidXTestCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestCore.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Test.TestCore.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testCore: AndroidX.Test.TestCore) {
        add("implementation", testCore.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
