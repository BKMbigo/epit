package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Lifecycle(
    internal val moduleName: String
) : AndroidXDependencies {
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


class EpitAndroidXLifecycleScope(
    private val androidXLifecycleVersion: String
) {
    val Lifecycle.dependency
        get(): String = "${this.moduleName}:${androidXLifecycleVersion}"

    fun DependencyHandlerScope.implementation(lifecycle: Lifecycle) {
        add("implementation", lifecycle.dependency)
    }
}
