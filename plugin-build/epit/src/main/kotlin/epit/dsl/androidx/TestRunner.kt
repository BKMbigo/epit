package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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
    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Runner.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Runner.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(runner: AndroidX.Test.Runner) {
        add("implementation", runner.dependencyAsString)
    }
}
