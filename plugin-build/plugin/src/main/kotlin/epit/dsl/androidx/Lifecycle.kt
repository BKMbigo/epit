package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

sealed class Lifecycle(
    internal val moduleName: String
) {
    object lifecycle_common: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-common")
    object lifecycle_common_java8: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-common-java8")
    object lifecycle_compiler: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-compiler")
//    object lifecycle_extensions: Lifecycle("androidx.lifecycle:lifecycle-extensions")
    object lifecycle_livedata: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-livedata")
    object lifecycle_livedata_core: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-livedata-core")
    object lifecycle_livedata_core_ktx: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-livedata-core-ktx")
    object lifecycle_livedata_ktx: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-livedata-ktx")
    object lifecycle_process: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-process")
    object lifecycle_reactivestreams: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-reactivestreams")
    object lifecycle_reactivestreams_ktx: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-reactivestreams-ktx")
    object lifecycle_runtime: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-runtime")
    object lifecycle_runtime_compose: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-runtime-compose")
    object lifecycle_runtime_ktx: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-ktx")
    object lifecycle_runtime_testing: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-testing")
    object lifecycle_service: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-service")
    object lifecycle_viewmodel: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-viewmodel")
    object lifecycle_viewmodel_compose: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-viewmodel-compose")
    object lifecycle_viewmodel_ktx: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-viewmodel-ktx")
    object lifecycle_viewmodel_savedstate: epit.dsl.androidx.Lifecycle("androidx.lifecycle:lifecycle-viewmodel-savedstate")
}


class EpitAndroidXLifecycleScope(
    private val androidXLifecycleVersion: String
) {
    val epit.dsl.androidx.Lifecycle.dependency
        get(): String = "${this.moduleName}:${androidXLifecycleVersion}"

    fun DependencyHandlerScope.implementation(lifecycle: epit.dsl.androidx.Lifecycle) {
        add("implementation", lifecycle.dependency)
    }
}
