package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreRoleScope internal constructor(
    private val androidXCoreRoleVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRole.dependency
        get(): String = moduleName joinWithColon androidXCoreRoleVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRole.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRole: AndroidX.Core.CoreRole) {
        add("implementation", coreRole.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
