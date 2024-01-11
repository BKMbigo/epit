package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.Core.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.Core.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: AndroidX.Core.Core) {
        add("implementation", core.dependencyAsString)
    }
}
