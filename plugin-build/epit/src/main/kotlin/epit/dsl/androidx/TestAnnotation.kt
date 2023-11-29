package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXTestAnnotationScope(
    private val androidXTestAnnotationVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.TestAnnotation.dependency
        get(): String = moduleName joinWithColon androidXTestAnnotationVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.TestAnnotation.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(testCore: AndroidX.Test.TestAnnotation) {
        add("implementation", testCore.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
