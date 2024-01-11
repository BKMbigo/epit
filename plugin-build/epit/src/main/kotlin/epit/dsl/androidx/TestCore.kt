package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestCoreScope internal constructor(
    private val androidXTestCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core
        get() = AndroidX.Test.Core.core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core(version: String) =
        AndroidX.Test.Core.core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.core_ktx
        get() = AndroidX.Test.Core.core_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_ktx(version: String) =
        AndroidX.Test.Core.core_ktx.dependencyAsString(version)


    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Core.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Core.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: AndroidX.Test.Core) {
        add("implementation", core.dependencyAsString)
    }
}
