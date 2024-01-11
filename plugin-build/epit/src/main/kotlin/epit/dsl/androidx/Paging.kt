package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXPagingScope internal constructor(
    private val androidXPagingVersion: String
) {

    @ExperimentalEpitApi
    val Epit.paging_common
        get() = AndroidX.Paging.paging_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_common(version: String) =
        AndroidX.Paging.paging_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_common_ktx
        get() = AndroidX.Paging.paging_common_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_common_ktx(version: String) =
        AndroidX.Paging.paging_common_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_compose
        get() = AndroidX.Paging.paging_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_compose(version: String) =
        AndroidX.Paging.paging_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_guava
        get() = AndroidX.Paging.paging_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_guava(version: String) =
        AndroidX.Paging.paging_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_runtime
        get() = AndroidX.Paging.paging_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_runtime(version: String) =
        AndroidX.Paging.paging_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_runtime_ktx
        get() = AndroidX.Paging.paging_runtime_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_runtime_ktx(version: String) =
        AndroidX.Paging.paging_runtime_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_rxjava2
        get() = AndroidX.Paging.paging_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_rxjava2(version: String) =
        AndroidX.Paging.paging_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_rxjava2_ktx
        get() = AndroidX.Paging.paging_rxjava2_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_rxjava2_ktx(version: String) =
        AndroidX.Paging.paging_rxjava2_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_rxjava3
        get() = AndroidX.Paging.paging_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_rxjava3(version: String) =
        AndroidX.Paging.paging_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.paging_testing
        get() = AndroidX.Paging.paging_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.paging_testing(version: String) =
        AndroidX.Paging.paging_testing.dependencyAsString(version)

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Paging.dependencyAsString
        get(): String = moduleName joinWithColon androidXPagingVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Paging.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(paging: AndroidX.Paging) {
        add("implementation", paging.dependencyAsString)
    }
}
