package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreScope internal constructor(
    private val androidXCoreVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.Core.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.Core.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: AndroidX.Core.Core) {
        add("implementation", core.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
