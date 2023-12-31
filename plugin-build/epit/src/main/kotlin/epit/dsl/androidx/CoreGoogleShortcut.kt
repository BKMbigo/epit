package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreGoogleShortcutsScope internal constructor(
    private val androidXCoreGoogleShortcutsVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreGoogleShortcuts.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreGoogleShortcutsVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreGoogleShortcuts.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreGoogleShortcuts: AndroidX.Core.CoreGoogleShortcuts) {
        add("implementation", coreGoogleShortcuts.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
