package epit.dsl.androidx

import Epit
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

    /* androidx.core:core-role */
    @ExperimentalEpitApi
    val Epit.core_role
        get() = AndroidX.Core.CoreRole.core_role.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_role(version: String) =
        AndroidX.Core.CoreRole.core_role.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Core.CoreRole.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRoleVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRole.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRole: AndroidX.Core.CoreRole) {
        add("implementation", coreRole.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
