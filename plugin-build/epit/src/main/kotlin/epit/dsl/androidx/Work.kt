package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXWorkScope internal constructor(
    private val androidxWorkVersion: String
) {

    @ExperimentalEpitApi
    val Epit.work_gcm
        get() = AndroidX.Work.work_gcm.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_gcm(version: String) =
        AndroidX.Work.work_gcm.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_multiprocess
        get() = AndroidX.Work.work_multiprocess.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_multiprocess(version: String) =
        AndroidX.Work.work_multiprocess.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_runtime
        get() = AndroidX.Work.work_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_runtime(version: String) =
        AndroidX.Work.work_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_runtime_ktx
        get() = AndroidX.Work.work_runtime_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_runtime_ktx(version: String) =
        AndroidX.Work.work_runtime_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_rxjava2
        get() = AndroidX.Work.work_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_rxjava2(version: String) =
        AndroidX.Work.work_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_rxjava3
        get() = AndroidX.Work.work_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_rxjava3(version: String) =
        AndroidX.Work.work_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.work_testing
        get() = AndroidX.Work.work_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.work_testing(version: String) =
        AndroidX.Work.work_testing.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Work.dependencyAsString
        get() = moduleName joinWithColon androidxWorkVersion

    internal fun AndroidX.Work.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
