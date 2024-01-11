package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreRemoteViewsScope internal constructor(
    private val androidXCoreRemoteViewsVersion: String
) {

    /* androidx.core:core-remoteviews */
    @ExperimentalEpitApi
    val Epit.core_remoteviews
        get() = AndroidX.Core.CoreRemoteViews.core_remoteviews.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_remoteviews(version: String) =
        AndroidX.Core.CoreRemoteViews.core_remoteviews.dependencyAsString(version)

    /* Internal Functions */

    internal val AndroidX.Core.CoreRemoteViews.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRemoteViewsVersion

    internal fun AndroidX.Core.CoreRemoteViews.dependencyAsString(version: String) = moduleName joinWithColon version

}
