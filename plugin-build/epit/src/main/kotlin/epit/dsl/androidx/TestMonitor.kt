package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Monitor.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestMonitorVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Monitor.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(monitor: AndroidX.Test.Monitor) {
        add("implementation", monitor.dependencyAsString)
    }
}
