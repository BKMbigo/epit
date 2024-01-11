package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    internal val AndroidX.Test.Runner.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestCoreVersion

    internal fun AndroidX.Test.Runner.dependencyAsString(version: String) = moduleName joinWithColon version

}
