package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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


    internal val AndroidX.Core.CoreRole.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRoleVersion

    internal fun AndroidX.Core.CoreRole.dependencyAsString(version: String) = moduleName joinWithColon version

}
