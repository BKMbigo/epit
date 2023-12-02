package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestMonitorScope(
    private val androidXTestMonitorVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Test.Monitor.dependency
        get(): String = moduleName joinWithColon androidXTestMonitorVersion

    @ExperimentalEpitApi
    fun AndroidX.Test.Monitor.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(monitor: AndroidX.Test.Monitor) {
        add("implementation", monitor.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
