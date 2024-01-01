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

    @ExperimentalEpitApi
    val AndroidX.Test.Monitor.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestMonitorVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Monitor.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(monitor: AndroidX.Test.Monitor) {
        add("implementation", monitor.dependencyAsString)
    }
}
