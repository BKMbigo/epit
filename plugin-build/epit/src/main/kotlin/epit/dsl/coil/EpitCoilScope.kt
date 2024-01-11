package epit.dsl.coil

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitCoilScope internal constructor(
    internal val coilBOMVersion: String
) {

    @ExperimentalEpitApi
    val Epit.coil
        get() = Coil.coil.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil(version: String): String =
        Coil.coil.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_base
        get() = Coil.coil_base.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_base(version: String): String =
        Coil.coil_base.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_compose
        get() = Coil.coil_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_compose(version: String): String =
        Coil.coil_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_compose_base
        get() = Coil.coil_compose_base.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_compose_base(version: String): String =
        Coil.coil_compose_base.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_gif
        get() = Coil.coil_gif.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_gif(version: String): String =
        Coil.coil_gif.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_svg
        get() = Coil.coil_svg.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_svg(version: String): String =
        Coil.coil_svg.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_video
        get() = Coil.coil_video.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_video(version: String): String =
        Coil.coil_video.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.coil_test
        get() = Coil.coil_test.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.coil_test(version: String): String =
        Coil.coil_test.dependencyAsString(version)

    /* Internal functions */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = Coil.coil_bom.moduleName joinWithColon coilBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = Coil.coil_bom.moduleName joinWithColon customVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    val Coil.dependencyAsString
        get() = moduleName

    @InternalEpitApi
    @ExperimentalEpitApi
    fun Coil.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coil: Coil) {
        add("implementation", coil.moduleName)
    }

}
