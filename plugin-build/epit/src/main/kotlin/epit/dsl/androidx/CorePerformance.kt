package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCorePerformanceScope internal constructor(
    private val androidXCorePerformanceVersion: String
) {

    /* androidx.core:core-performance */
    @ExperimentalEpitApi
    val Epit.core_performance
        get() = AndroidX.Core.CorePerformance.core_performance.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_performance(version: String) =
        AndroidX.Core.CorePerformance.core_performance.dependencyAsString(version)

    /* androidx.core:core-performance-play-services */
    @ExperimentalEpitApi
    val Epit.core_performance_play_services
        get() = AndroidX.Core.CorePerformance.core_performance_play_services.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_performance_play_services(version: String) =
        AndroidX.Core.CorePerformance.core_performance_play_services.dependencyAsString(version)

    /* androidx.core:core-performance-testing */
    @ExperimentalEpitApi
    val Epit.core_performance_testing
        get() = AndroidX.Core.CorePerformance.core_performance_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_performance_testing(version: String) =
        AndroidX.Core.CorePerformance.core_performance_testing.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Core.CorePerformance.dependencyAsString
        get(): String = moduleName joinWithColon androidXCorePerformanceVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Core.CorePerformance.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(corePerformance: AndroidX.Core.CorePerformance) {
        add("implementation", corePerformance.dependencyAsString)
    }
}
