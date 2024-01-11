package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXComposeCompilerScope internal constructor(
    private val androidXComposeCompilerVersion: String
) {
    /* androidx.compose.compiler:compiler */
    @ExperimentalEpitApi
    val Epit.compiler
        get() = AndroidX.Compose.Compiler.compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler(version: String) = AndroidX.Compose.Compiler.compiler.dependencyAsString(version)

    /* androidx.compose.compiler:compiler-daemon */
    @ExperimentalEpitApi
    val Epit.compiler_daemon
        get() = AndroidX.Compose.Compiler.compiler_daemon.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler_daemon(version: String) = AndroidX.Compose.Compiler.compiler_daemon.dependencyAsString(version)

    /* androidx.compose.compiler:compiler-hosted */
    @ExperimentalEpitApi
    val Epit.compiler_hosted
        get() = AndroidX.Compose.Compiler.compiler_hosted.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler_hosted(version: String) = AndroidX.Compose.Compiler.compiler_hosted.dependencyAsString(version)

    /*
    * ==============================
    * ===== Internal Functions =====
    * ==============================
    * */

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Compose.Compiler.dependencyAsString
        get(): String = moduleName joinWithColon androidXComposeCompilerVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Compose.Compiler.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(composeCompiler: AndroidX.Compose.Compiler) {
        add("implementation", composeCompiler.dependencyAsString)
    }
}
