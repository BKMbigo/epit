package epit.dsl.squareup

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareLeakCanaryScope internal constructor(
    private val squareLeakCanaryVersion: String
) {

    @ExperimentalEpitApi
    val Epit.leakcanary_android
        get() = SquareUp.LeakCanary.leakcanary_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android(version: String) =
        SquareUp.LeakCanary.leakcanary_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark_log
        get() = SquareUp.LeakCanary.shark_log.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark_log(version: String) =
        SquareUp.LeakCanary.shark_log.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark_hprof
        get() = SquareUp.LeakCanary.shark_hprof.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark_hprof(version: String) =
        SquareUp.LeakCanary.shark_hprof.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark_graph
        get() = SquareUp.LeakCanary.shark_graph.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark_graph(version: String) =
        SquareUp.LeakCanary.shark_graph.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark_cli
        get() = SquareUp.LeakCanary.shark_cli.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark_cli(version: String) =
        SquareUp.LeakCanary.shark_cli.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark_android
        get() = SquareUp.LeakCanary.shark_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark_android(version: String) =
        SquareUp.LeakCanary.shark_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.shark
        get() = SquareUp.LeakCanary.shark.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.shark(version: String) =
        SquareUp.LeakCanary.shark.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.plumber_android_startup
        get() = SquareUp.LeakCanary.plumber_android_startup.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.plumber_android_startup(version: String) =
        SquareUp.LeakCanary.plumber_android_startup.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.plumber_android_core
        get() = SquareUp.LeakCanary.plumber_android_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.plumber_android_core(version: String) =
        SquareUp.LeakCanary.plumber_android_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.plumber_android
        get() = SquareUp.LeakCanary.plumber_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.plumber_android(version: String) =
        SquareUp.LeakCanary.plumber_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher_android_support_fragments
        get() = SquareUp.LeakCanary.leakcanary_object_watcher_android_support_fragments.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher_android_support_fragments(version: String) =
        SquareUp.LeakCanary.leakcanary_object_watcher_android_support_fragments.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher_android_startup
        get() = SquareUp.LeakCanary.leakcanary_object_watcher_android_startup.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher_android_startup(version: String) =
        SquareUp.LeakCanary.leakcanary_object_watcher_android_startup.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher_android_core
        get() = SquareUp.LeakCanary.leakcanary_object_watcher_android_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher_android_core(version: String) =
        SquareUp.LeakCanary.leakcanary_object_watcher_android_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher_android_androidx
        get() = SquareUp.LeakCanary.leakcanary_object_watcher_android_androidx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher_android_androidx(version: String) =
        SquareUp.LeakCanary.leakcanary_object_watcher_android_androidx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher_android
        get() = SquareUp.LeakCanary.leakcanary_object_watcher_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher_android(version: String) =
        SquareUp.LeakCanary.leakcanary_object_watcher_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_object_watcher
        get() = SquareUp.LeakCanary.leakcanary_object_watcher.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_object_watcher(version: String) =
        SquareUp.LeakCanary.leakcanary_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_deobfuscation_gradle_plugin
        get() = SquareUp.LeakCanary.leakcanary_deobfuscation_gradle_plugin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_deobfuscation_gradle_plugin(version: String) =
        SquareUp.LeakCanary.leakcanary_deobfuscation_gradle_plugin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_utils
        get() = SquareUp.LeakCanary.leakcanary_android_utils.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_utils(version: String) =
        SquareUp.LeakCanary.leakcanary_android_utils.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_startup
        get() = SquareUp.LeakCanary.leakcanary_android_startup.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_startup(version: String) =
        SquareUp.LeakCanary.leakcanary_android_startup.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_release
        get() = SquareUp.LeakCanary.leakcanary_android_release.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_release(version: String) =
        SquareUp.LeakCanary.leakcanary_android_release.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_process
        get() = SquareUp.LeakCanary.leakcanary_android_process.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_process(version: String) =
        SquareUp.LeakCanary.leakcanary_android_process.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_instrumentation
        get() = SquareUp.LeakCanary.leakcanary_android_instrumentation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_instrumentation(version: String) =
        SquareUp.LeakCanary.leakcanary_android_instrumentation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.leakcanary_android_core
        get() = SquareUp.LeakCanary.leakcanary_android_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.leakcanary_android_core(version: String) =
        SquareUp.LeakCanary.leakcanary_android_core.dependencyAsString(version)

    /* Internal Functions */

    @InternalEpitApi
    @ExperimentalEpitApi
    val SquareUp.LeakCanary.dependencyAsString
        get(): String = moduleName joinWithColon squareLeakCanaryVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun SquareUp.LeakCanary.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("This function has been deprecated in favour of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(leakCanary: SquareUp.LeakCanary) {
        add("implementation", leakCanary.dependencyAsString)
    }
}
