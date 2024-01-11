package epit.dsl.glide

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Glide
import epit.utils.joinWithColon


@ExperimentalEpitApi
@EpitDsl
class EpitGlideScope internal constructor(
    private val glideVersion: String
) {

    @ExperimentalEpitApi
    val Epit.glide
        get() = Glide.Glide.glide.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glide(version: String): String =
        Glide.Glide.glide.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.compiler
        get() = Glide.Glide.compiler.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.compiler(version: String): String =
        Glide.Glide.compiler.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.glfdecoder
        get() = Glide.Glide.glfdecoder.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glfdecoder(version: String): String =
        Glide.Glide.glfdecoder.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.disklrucache
        get() = Glide.Glide.disklrucache.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.disklrucache(version: String): String =
        Glide.Glide.disklrucache.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.volley_integration
        get() = Glide.Glide.volley_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.volley_integration(version: String): String =
        Glide.Glide.volley_integration.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.sqljournaldiskcache
        get() = Glide.Glide.sqljournaldiskcache.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.sqljournaldiskcache(version: String): String =
        Glide.Glide.sqljournaldiskcache.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.recyclerview_integration
        get() = Glide.Glide.recyclerview_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.recyclerview_integration(version: String): String =
        Glide.Glide.recyclerview_integration.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp4_integration
        get() = Glide.Glide.okhttp4_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp4_integration(version: String): String =
        Glide.Glide.okhttp4_integration.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp3_integration
        get() = Glide.Glide.okhttp3_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp3_integration(version: String): String =
        Glide.Glide.okhttp3_integration.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_integration
        get() = Glide.Glide.okhttp_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_integration(version: String): String =
        Glide.Glide.okhttp_integration.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.gifencoder_integration
        get() = Glide.Glide.gifencoder_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.gifencoder_integration(version: String): String =
        Glide.Glide.gifencoder_integration.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.cronet_integration
        get() = Glide.Glide.cronet_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.cronet_integration(version: String): String =
        Glide.Glide.cronet_integration.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.concurrent_integration
        get() = Glide.Glide.concurrent_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.concurrent_integration(version: String): String =
        Glide.Glide.concurrent_integration.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.avif_integration
        get() = Glide.Glide.avif_integration.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.avif_integration(version: String): String =
        Glide.Glide.avif_integration.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.ksp
        get() = Glide.Glide.ksp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ksp(version: String): String =
        Glide.Glide.ksp.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.mocks
        get() = Glide.Glide.mocks.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mocks(version: String): String =
        Glide.Glide.mocks.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.annotations
        get() = Glide.Glide.annotations.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.annotations(version: String): String =
        Glide.Glide.annotations.dependencyAsString(version)

    /* Internal functions */

    internal val Glide.Glide.dependencyAsString
        get(): String = moduleName joinWithColon glideVersion

    internal fun Glide.Glide.dependencyAsString(version: String) = moduleName joinWithColon version

}
