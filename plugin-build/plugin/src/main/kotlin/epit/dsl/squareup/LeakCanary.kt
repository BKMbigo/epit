package epit.dsl.squareup

import epit.EpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class LeakCanary(
    internal val moduleName: String
) : EpitDependency {
    leakcanary_android(moduleName = "com.squareup.leakcanary:leakcanary-android"),
    shark_log(moduleName = "com.squareup.leakcanary:shark-log"),
    shark_hprof(moduleName = "com.squareup.leakcanary:shark-hprof"),
    shark_graph(moduleName = "com.squareup.leakcanary:shark-graph"),
    shark_cli(moduleName = "com.squareup.leakcanary:shark-cli"),
    shark_android(moduleName = "com.squareup.leakcanary:shark-android"),
    shark(moduleName = "com.squareup.leakcanary:shark"),
    plumber_android_startup(moduleName = "com.squareup.leakcanary:plumber-android-startup"),
    plumber_android_core(moduleName = "com.squareup.leakcanary:plumber-android-core"),
    plumber_android(moduleName = "com.squareup.leakcanary:plumber-android"),
    leakcanary_object_watcher_android_support_fragments(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher-android-support-fragments"),
    leakcanary_object_watcher_android_startup(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher-android-startup"),
    leakcanary_object_watcher_android_core(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher-android-core"),
    leakcanary_object_watcher_android_androidx(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher-android-androidx"),
    leakcanary_object_watcher_android(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher-android"),
    leakcanary_object_watcher(moduleName = "com.squareup.leakcanary:leakcanary-object-watcher"),
    leakcanary_deobfuscation_gradle_plugin(moduleName = "com.squareup.leakcanary:leakcanary-deobfuscation-gradle-plugin"),
    leakcanary_android_utils(moduleName = "com.squareup.leakcanary:leakcanary-android-utils"),
    leakcanary_android_startup(moduleName = "com.squareup.leakcanary:leakcanary-android-startup"),
    leakcanary_android_release(moduleName = "com.squareup.leakcanary:leakcanary-android-release"),
    leakcanary_android_process(moduleName = "com.squareup.leakcanary:leakcanary-android-process"),
    leakcanary_android_instrumentation(moduleName = "com.squareup.leakcanary:leakcanary-android-instrumentation"),
    leakcanary_android_core(moduleName = "com.squareup.leakcanary:leakcanary-android-core"),
//    leakcanary_watcher(moduleName = "com.squareup.leakcanary:leakcanary-watcher"),
//    leakcanary_log(moduleName = "com.squareup.leakcanary:leakcanary-log"),
//    leaksentry(moduleName = "com.squareup.leakcanary:leaksentry"),
//    leakcanary_haha(moduleName = "com.squareup.leakcanary:leakcanary-haha"),
//    leakcanary_analyzer(moduleName = "com.squareup.leakcanary:leakcanary-analyzer"),
//    leakcanary_android_perflib(moduleName = "com.squareup.leakcanary:leakcanary-android-perflib"),
//    leakcanary_perflib_analyzer(moduleName = "com.squareup.leakcanary:leakcanary-perflib-analyzer"),
//    leakcanary_analyzer_core(moduleName = "com.squareup.leakcanary:leakcanary-analyzer-core"),
//    leakcanary_support_fragment(moduleName = "com.squareup.leakcanary:leakcanary-support-fragment"),
//    leakcanary_android_no_op(moduleName = "com.squareup.leakcanary:leakcanary-android-no-op")
}

class EpitSquareLeakCanaryScope(
    private val squareLeakCanaryVersion: String
) {
    val LeakCanary.dependency
        get(): String = "${this.moduleName}:${squareLeakCanaryVersion}"

    fun DependencyHandlerScope.implementation(leakCanary: LeakCanary) {
        add("implementation", leakCanary.dependency)
    }
}
