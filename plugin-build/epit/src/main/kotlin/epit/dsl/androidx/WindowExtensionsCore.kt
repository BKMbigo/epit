package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXWindowExtensionCoreScope internal constructor(
    private val androidXWindowExtensionsCoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.core
        get() = AndroidX.Window.WindowExtensionsCore.core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core(version: String) =
        AndroidX.Window.WindowExtensionsCore.core.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Window.WindowExtensionsCore.dependencyAsString
        get() = moduleName joinWithColon androidXWindowExtensionsCoreVersion

    internal fun AndroidX.Window.WindowExtensionsCore.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
