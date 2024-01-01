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


    @ExperimentalEpitApi
    val AndroidX.Test.Core.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Core.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: AndroidX.Test.Core) {
        add("implementation", core.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
