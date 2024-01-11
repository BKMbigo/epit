package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXLifecycleScope internal constructor(
    private val androidXLifecycleVersion: String
) {

    @ExperimentalEpitApi
    val Epit.lifecycle_common
        get() = AndroidX.Lifecycle.lifecycle_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_common(version: String) =
        AndroidX.Lifecycle.lifecycle_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_common_java8
        get() = AndroidX.Lifecycle.lifecycle_common_java8.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_common_java8(version: String) =
        AndroidX.Lifecycle.lifecycle_common_java8.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_compiler
        get() = AndroidX.Lifecycle.lifecycle_compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_compiler(version: String) =
        AndroidX.Lifecycle.lifecycle_compiler.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_livedata
        get() = AndroidX.Lifecycle.lifecycle_livedata.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_livedata(version: String) =
        AndroidX.Lifecycle.lifecycle_livedata.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_livedata_ktx
        get() = AndroidX.Lifecycle.lifecycle_livedata_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_livedata_ktx(version: String) =
        AndroidX.Lifecycle.lifecycle_livedata_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_livedata_core
        get() = AndroidX.Lifecycle.lifecycle_livedata_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_livedata_core(version: String) =
        AndroidX.Lifecycle.lifecycle_livedata_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_livedata_core_ktx
        get() = AndroidX.Lifecycle.lifecycle_livedata_core_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_livedata_core_ktx(version: String) =
        AndroidX.Lifecycle.lifecycle_livedata_core_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_process
        get() = AndroidX.Lifecycle.lifecycle_process.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_process(version: String) =
        AndroidX.Lifecycle.lifecycle_process.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_reactivestreams
        get() = AndroidX.Lifecycle.lifecycle_reactivestreams.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_reactivestreams(version: String) =
        AndroidX.Lifecycle.lifecycle_reactivestreams.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_reactivestreams_ktx
        get() = AndroidX.Lifecycle.lifecycle_reactivestreams_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_reactivestreams_ktx(version: String) =
        AndroidX.Lifecycle.lifecycle_reactivestreams_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_runtime
        get() = AndroidX.Lifecycle.lifecycle_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_runtime(version: String) =
        AndroidX.Lifecycle.lifecycle_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_runtime_ktx
        get() = AndroidX.Lifecycle.lifecycle_runtime_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_runtime_ktx(version: String) =
        AndroidX.Lifecycle.lifecycle_runtime_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_runtime_compose
        get() = AndroidX.Lifecycle.lifecycle_runtime_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_runtime_compose(version: String) =
        AndroidX.Lifecycle.lifecycle_runtime_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_runtime_testing
        get() = AndroidX.Lifecycle.lifecycle_runtime_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_runtime_testing(version: String) =
        AndroidX.Lifecycle.lifecycle_runtime_testing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_viewmodel
        get() = AndroidX.Lifecycle.lifecycle_viewmodel.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_viewmodel(version: String) =
        AndroidX.Lifecycle.lifecycle_viewmodel.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_viewmodel_ktx
        get() = AndroidX.Lifecycle.lifecycle_viewmodel_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_viewmodel_ktx(version: String) =
        AndroidX.Lifecycle.lifecycle_viewmodel_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_viewmodel_compose
        get() = AndroidX.Lifecycle.lifecycle_viewmodel_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_viewmodel_compose(version: String) =
        AndroidX.Lifecycle.lifecycle_viewmodel_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_viewmodel_savedstate
        get() = AndroidX.Lifecycle.lifecycle_viewmodel_savedstate.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_viewmodel_savedstate(version: String) =
        AndroidX.Lifecycle.lifecycle_viewmodel_savedstate.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.lifecycle_service
        get() = AndroidX.Lifecycle.lifecycle_service.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.lifecycle_service(version: String) =
        AndroidX.Lifecycle.lifecycle_service.dependencyAsString(version)


    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Lifecycle.dependencyAsString
        get(): String = moduleName joinWithColon androidXLifecycleVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Lifecycle.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(lifecycle: AndroidX.Lifecycle) {
        add("implementation", lifecycle.dependencyAsString)
    }
}
