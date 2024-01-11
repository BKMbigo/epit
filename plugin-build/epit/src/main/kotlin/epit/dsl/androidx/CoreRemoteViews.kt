package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRemoteViews.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreRemoteViewsVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRemoteViews.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRemoteViews: AndroidX.Core.CoreRemoteViews) {
        add("implementation", coreRemoteViews.dependencyAsString)
    }
}
