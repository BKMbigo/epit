package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXLifecycleScope internal constructor(
    private val androidXLifecycleVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Lifecycle.dependency
        get(): String = moduleName joinWithColon androidXLifecycleVersion

    @ExperimentalEpitApi
    fun AndroidX.Lifecycle.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(lifecycle: AndroidX.Lifecycle) {
        add("implementation", lifecycle.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
