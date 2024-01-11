package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreGoogleShortcutsScope internal constructor(
    private val androidXCoreGoogleShortcutsVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core_google_shortcuts
        get() = AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_google_shortcuts(version: String) =
        AndroidX.Core.CoreGoogleShortcuts.core_google_shortcuts.dependencyAsString(version)

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreGoogleShortcuts.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreGoogleShortcutsVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreGoogleShortcuts.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreGoogleShortcuts: AndroidX.Core.CoreGoogleShortcuts) {
        add("implementation", coreGoogleShortcuts.dependencyAsString)
    }
}
