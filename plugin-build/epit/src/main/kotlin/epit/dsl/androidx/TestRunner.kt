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
class EpitAndroidXTestRunnerScope internal constructor(
    private val androidXTestCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.runner
        get() = AndroidX.Test.Runner.runner.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.runner(version: String) =
        AndroidX.Test.Runner.runner.dependencyAsString(version)

    /* internal dependencies */

    @ExperimentalEpitApi
    val AndroidX.Test.Runner.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Runner.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(runner: AndroidX.Test.Runner) {
        add("implementation", runner.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
