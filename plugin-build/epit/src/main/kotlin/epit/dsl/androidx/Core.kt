package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreScope internal constructor(
    private val androidXCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core
        get() = AndroidX.Core.Core.core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core(version: String) =
        AndroidX.Core.Core.core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core_ktx
        get() = AndroidX.Core.Core.core_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_ktx(version: String) =
        AndroidX.Core.Core.core_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core_testing
        get() = AndroidX.Core.Core.core_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_testing(version: String) =
        AndroidX.Core.Core.core_testing.dependencyAsString(version)

    /* Internal Functions */

    internal val AndroidX.Core.Core.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    internal fun AndroidX.Core.Core.dependencyAsString(version: String) = moduleName joinWithColon version
}
