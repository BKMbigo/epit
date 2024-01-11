package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    /* Internal Functions */

    internal val AndroidX.Core.CoreGoogleShortcuts.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreGoogleShortcutsVersion

    internal fun AndroidX.Core.CoreGoogleShortcuts.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
