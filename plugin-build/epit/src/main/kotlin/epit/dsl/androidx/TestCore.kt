package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestCoreScope(
    private val androidXTestCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Core.dependency
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Core.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: AndroidX.Test.Core) {
        add("implementation", core.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
