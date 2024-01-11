package epit.dsl.squareup

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareOkHttp3BOMScope internal constructor(
    private val squareOkHttp3BOMVersion: String
) {

    @ExperimentalEpitApi
    val Epit.okhttp
        get() = SquareUp.OkHttp3.okhttp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp(version: String) =
        SquareUp.OkHttp3.okhttp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_android
        get() = SquareUp.OkHttp3.okhttp_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_android(version: String) =
        SquareUp.OkHttp3.okhttp_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.logging_interceptor
        get() = SquareUp.OkHttp3.logging_interceptor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.logging_interceptor(version: String) =
        SquareUp.OkHttp3.logging_interceptor.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_urlconnection
        get() = SquareUp.OkHttp3.okhttp_urlconnection.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_urlconnection(version: String) =
        SquareUp.OkHttp3.okhttp_urlconnection.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_tls
        get() = SquareUp.OkHttp3.okhttp_tls.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_tls(version: String) =
        SquareUp.OkHttp3.okhttp_tls.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_sse
        get() = SquareUp.OkHttp3.okhttp_sse.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_sse(version: String) =
        SquareUp.OkHttp3.okhttp_sse.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_coroutines
        get() = SquareUp.OkHttp3.okhttp_coroutines.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_coroutines(version: String) =
        SquareUp.OkHttp3.okhttp_coroutines.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_dnsoverhttps
        get() = SquareUp.OkHttp3.okhttp_dnsoverhttps.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_dnsoverhttps(version: String) =
        SquareUp.OkHttp3.okhttp_dnsoverhttps.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okhttp_brotli
        get() = SquareUp.OkHttp3.okhttp_brotli.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okhttp_brotli(version: String) =
        SquareUp.OkHttp3.okhttp_brotli.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.okcurl
        get() = SquareUp.OkHttp3.okcurl.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.okcurl(version: String) =
        SquareUp.OkHttp3.okcurl.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.mockwebserver3_junit5
        get() = SquareUp.OkHttp3.mockwebserver3_junit5.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mockwebserver3_junit5(version: String) =
        SquareUp.OkHttp3.mockwebserver3_junit5.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.mockwebserver3_junit4
        get() = SquareUp.OkHttp3.mockwebserver3_junit4.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mockwebserver3_junit4(version: String) =
        SquareUp.OkHttp3.mockwebserver3_junit4.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.mockwebserver3
        get() = SquareUp.OkHttp3.mockwebserver3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mockwebserver3(version: String) =
        SquareUp.OkHttp3.mockwebserver3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.mockwebserver
        get() = SquareUp.OkHttp3.mockwebserver.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.mockwebserver(version: String) =
        SquareUp.OkHttp3.mockwebserver.dependencyAsString(version)


    /* Internal Functions */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = SquareUp.OkHttp3.okhttp_bom.moduleName joinWithColon squareOkHttp3BOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = SquareUp.OkHttp3.okhttp_bom.moduleName joinWithColon customVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    val SquareUp.OkHttp3.dependencyAsString
        get(): String = moduleName joinWithColon squareOkHttp3BOMVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun SquareUp.OkHttp3.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("This function has been deprecated in favour of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(okHttp3: SquareUp.OkHttp3) {
        add("implementation", okHttp3.moduleName)
    }
}
