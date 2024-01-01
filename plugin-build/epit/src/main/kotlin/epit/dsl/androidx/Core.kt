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
