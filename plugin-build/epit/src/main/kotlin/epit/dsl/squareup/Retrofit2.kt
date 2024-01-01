package epit.dsl.squareup

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareRetrofit2Scope internal constructor(
    private val squareRetrofit2Version: String
) {

    @ExperimentalEpitApi
    val Epit.converter_wire
        get() = SquareUp.Retrofit2.converter_wire.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_wire(version: String) =
        SquareUp.Retrofit2.converter_wire.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_simplexml
        get() = SquareUp.Retrofit2.converter_simplexml.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_simplexml(version: String) =
        SquareUp.Retrofit2.converter_simplexml.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_scalars
        get() = SquareUp.Retrofit2.converter_scalars.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_scalars(version: String) =
        SquareUp.Retrofit2.converter_scalars.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_protobuf
        get() = SquareUp.Retrofit2.converter_protobuf.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_protobuf(version: String) =
        SquareUp.Retrofit2.converter_protobuf.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_moshi
        get() = SquareUp.Retrofit2.converter_moshi.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_moshi(version: String) =
        SquareUp.Retrofit2.converter_moshi.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_jaxb
        get() = SquareUp.Retrofit2.converter_jaxb.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_jaxb(version: String) =
        SquareUp.Retrofit2.converter_jaxb.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_java8
        get() = SquareUp.Retrofit2.converter_java8.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_java8(version: String) =
        SquareUp.Retrofit2.converter_java8.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_jackson
        get() = SquareUp.Retrofit2.converter_jackson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_jackson(version: String) =
        SquareUp.Retrofit2.converter_jackson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_guava
        get() = SquareUp.Retrofit2.converter_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_guava(version: String) =
        SquareUp.Retrofit2.converter_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.converter_gson
        get() = SquareUp.Retrofit2.converter_gson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.converter_gson(version: String) =
        SquareUp.Retrofit2.converter_gson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_scala
        get() = SquareUp.Retrofit2.adapter_scala.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_scala(version: String) =
        SquareUp.Retrofit2.adapter_scala.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_rxjava3
        get() = SquareUp.Retrofit2.adapter_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_rxjava3(version: String) =
        SquareUp.Retrofit2.adapter_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_rxjava2
        get() = SquareUp.Retrofit2.adapter_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_rxjava2(version: String) =
        SquareUp.Retrofit2.adapter_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_rxjava
        get() = SquareUp.Retrofit2.adapter_rxjava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_rxjava(version: String) =
        SquareUp.Retrofit2.adapter_rxjava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_java8
        get() = SquareUp.Retrofit2.adapter_java8.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_java8(version: String) =
        SquareUp.Retrofit2.adapter_java8.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.adapter_guava
        get() = SquareUp.Retrofit2.adapter_guava.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.adapter_guava(version: String) =
        SquareUp.Retrofit2.adapter_guava.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.retrofit_mock
        get() = SquareUp.Retrofit2.retrofit_mock.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.retrofit_mock(version: String) =
        SquareUp.Retrofit2.retrofit_mock.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.retrofit
        get() = SquareUp.Retrofit2.retrofit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.retrofit(version: String) =
        SquareUp.Retrofit2.retrofit.dependencyAsString(version)


    /* Internal functions */

    @ExperimentalEpitApi
    val SquareUp.Retrofit2.dependencyAsString
        get(): String = moduleName joinWithColon squareRetrofit2Version

    @ExperimentalEpitApi
    fun SquareUp.Retrofit2.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The function has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(retrofit2: SquareUp.Retrofit2) {
        add("implementation", retrofit2.dependencyAsString)
    }
}
