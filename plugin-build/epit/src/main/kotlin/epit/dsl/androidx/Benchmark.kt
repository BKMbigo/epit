package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon


class EpitAndroidXBenchmarkScope internal constructor(
    internal val androidxBenchmarkVersion: String
) {

    @ExperimentalEpitApi
    val Epit.benchmark_common
        get() = AndroidX.Benchmark.benchmark_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.benchmark_common(version: String) =
        AndroidX.Benchmark.benchmark_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.benchmark_gradle_plugin
        get() = AndroidX.Benchmark.benchmark_gradle_plugin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.benchmark_gradle_plugin(version: String) =
        AndroidX.Benchmark.benchmark_gradle_plugin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.benchmark_junit4
        get() = AndroidX.Benchmark.benchmark_junit4.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.benchmark_junit4(version: String) =
        AndroidX.Benchmark.benchmark_junit4.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.benchmark_macro
        get() = AndroidX.Benchmark.benchmark_macro.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.benchmark_macro(version: String) =
        AndroidX.Benchmark.benchmark_macro.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.benchmark_macro_junit4
        get() = AndroidX.Benchmark.benchmark_macro_junit4.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.benchmark_macro_junit4(version: String) =
        AndroidX.Benchmark.benchmark_macro_junit4.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Benchmark.dependencyAsString
        get() = moduleName joinWithColon androidxBenchmarkVersion

    internal fun AndroidX.Benchmark.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
