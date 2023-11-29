package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestExtJUnitGTestScope(
    private val androidXTestExtJUnitGTestVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.TestExt.TestExtJUnitGTest.dependency
        get(): String = "${this.moduleName}:${androidXTestExtJUnitGTestVersion}"

    @ExperimentalEpitApi
    fun AndroidX.TestExt.TestExtJUnitGTest.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testExtJUnitGTest: AndroidX.TestExt.TestExtJUnitGTest) {
        add("implementation", testExtJUnitGTest.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
