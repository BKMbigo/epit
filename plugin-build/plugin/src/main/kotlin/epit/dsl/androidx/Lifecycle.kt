package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Lifecycle(
    internal val moduleName: String
) : AndroidXDependency {
    lifecycle_common("androidx.lifecycle:lifecycle-common"),
    lifecycle_common_java8("androidx.lifecycle:lifecycle-common-java8"),
    lifecycle_compiler("androidx.lifecycle:lifecycle-compiler"),

    //    lifecycle_extensions: Lifecycle("androidx.lifecycle:lifecycle-extensions"),
    lifecycle_livedata("androidx.lifecycle:lifecycle-livedata"),
    lifecycle_livedata_core("androidx.lifecycle:lifecycle-livedata-core"),
    lifecycle_livedata_core_ktx("androidx.lifecycle:lifecycle-livedata-core-ktx"),
    lifecycle_livedata_ktx("androidx.lifecycle:lifecycle-livedata-ktx"),
    lifecycle_process("androidx.lifecycle:lifecycle-process"),
    lifecycle_reactivestreams("androidx.lifecycle:lifecycle-reactivestreams"),
    lifecycle_reactivestreams_ktx("androidx.lifecycle:lifecycle-reactivestreams-ktx"),
    lifecycle_runtime("androidx.lifecycle:lifecycle-runtime"),
    lifecycle_runtime_compose("androidx.lifecycle:lifecycle-runtime-compose"),
    lifecycle_runtime_ktx("androidx.lifecycle:lifecycle-runtime-ktx"),
    lifecycle_runtime_testing("androidx.lifecycle:lifecycle-runtime-testing"),
    lifecycle_service("androidx.lifecycle:lifecycle-service"),
    lifecycle_viewmodel("androidx.lifecycle:lifecycle-viewmodel"),
    lifecycle_viewmodel_compose("androidx.lifecycle:lifecycle-viewmodel-compose"),
    lifecycle_viewmodel_ktx("androidx.lifecycle:lifecycle-viewmodel-ktx"),
    lifecycle_viewmodel_savedstate("androidx.lifecycle:lifecycle-viewmodel-savedstate")
}

@ExperimentalEpitApi
class EpitAndroidXLifecycleScope(
    private val androidXLifecycleVersion: String
) {
    @ExperimentalEpitApi
    val Lifecycle.dependency
        get(): String = "${this.moduleName}:${androidXLifecycleVersion}"

    @ExperimentalEpitApi
    fun Lifecycle.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(lifecycle: Lifecycle) {
        add("implementation", lifecycle.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
