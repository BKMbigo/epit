package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXDataBindingScope internal constructor(
    private val androidXDataBindingVersion: String
) {

    @ExperimentalEpitApi
    val Epit.databinding_adapters
        get() = AndroidX.DataBinding.databinding_adapters.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_adapters(version: String) =
        AndroidX.DataBinding.databinding_adapters.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.databinding_common
        get() = AndroidX.DataBinding.databinding_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_common(version: String) =
        AndroidX.DataBinding.databinding_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.databinding_compiler
        get() = AndroidX.DataBinding.databinding_compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_compiler(version: String) =
        AndroidX.DataBinding.databinding_compiler.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.databinding_compiler_common
        get() = AndroidX.DataBinding.databinding_compiler_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_compiler_common(version: String) =
        AndroidX.DataBinding.databinding_compiler_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.databinding_ktx
        get() = AndroidX.DataBinding.databinding_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_ktx(version: String) =
        AndroidX.DataBinding.databinding_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.databinding_runtime
        get() = AndroidX.DataBinding.databinding_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.databinding_runtime(version: String) =
        AndroidX.DataBinding.databinding_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.viewbinding
        get() = AndroidX.DataBinding.viewbinding.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.viewbinding(version: String) =
        AndroidX.DataBinding.viewbinding.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DataBinding.dependencyAsString
        get() = moduleName joinWithColon androidXDataBindingVersion

    internal fun AndroidX.DataBinding.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
