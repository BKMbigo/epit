package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRole.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRoleVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRole.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRole: AndroidX.Core.CoreRole) {
        add("implementation", coreRole.dependencyAsString)
    }
}
