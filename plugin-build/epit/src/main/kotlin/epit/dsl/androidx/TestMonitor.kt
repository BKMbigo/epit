package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestMonitorScope internal constructor(
    private val androidXTestMonitorVersion: String
) {

    @ExperimentalEpitApi
    val Epit.monitor
        get() = AndroidX.Test.Monitor.monitor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.monitor(version: String) =
        AndroidX.Test.Monitor.monitor.dependencyAsString(version)

    /* internal functions */

    internal val AndroidX.Test.Monitor.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestMonitorVersion

    internal fun AndroidX.Test.Monitor.dependencyAsString(version: String) = moduleName joinWithColon version

}
