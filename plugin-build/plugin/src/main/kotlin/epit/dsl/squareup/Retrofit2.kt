package epit.dsl.squareup

import epit.EpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Retrofit2(
    internal val moduleName: String
) : EpitDependency {
    converter_wire(moduleName = "com.squareup.retrofit2:converter-wire"),
    converter_simplexml(moduleName = "com.squareup.retrofit2:converter-simplexml"),
    converter_scalars(moduleName = "com.squareup.retrofit2:converter-scalars"),
    converter_protobuf(moduleName = "com.squareup.retrofit2:converter-protobuf"),
    converter_moshi(moduleName = "com.squareup.retrofit2:converter-moshi"),
    converter_jaxb(moduleName = "com.squareup.retrofit2:converter-jaxb"),
    converter_java8(moduleName = "com.squareup.retrofit2:converter-java8"),
    converter_jackson(moduleName = "com.squareup.retrofit2:converter-jackson"),
    converter_guava(moduleName = "com.squareup.retrofit2:converter-guava"),
    converter_gson(moduleName = "com.squareup.retrofit2:converter-gson"),
    adapter_scala(moduleName = "com.squareup.retrofit2:adapter-scala"),
    adapter_rxjava3(moduleName = "com.squareup.retrofit2:adapter-rxjava3"),
    adapter_rxjava2(moduleName = "com.squareup.retrofit2:adapter-rxjava2"),
    adapter_rxjava(moduleName = "com.squareup.retrofit2:adapter-rxjava"),
    adapter_java8(moduleName = "com.squareup.retrofit2:adapter-java8"),
    adapter_guava(moduleName = "com.squareup.retrofit2:adapter-guava"),
    retrofit_mock(moduleName = "com.squareup.retrofit2:retrofit-mock"),
    retrofit(moduleName = "com.squareup.retrofit2:retrofit"),
//    retrofit_converters(moduleName = "com.squareup.retrofit2:retrofit-converters"),
//    retrofit_adapters(moduleName = "com.squareup.retrofit2:retrofit-adapters"),
//    parent(moduleName = "com.squareup.retrofit2:parent")
}

class EpitSquareRetrofit2Scope(
    private val squareRetrofit2Version: String
) {
    val Retrofit2.dependency
        get(): String = "${this.moduleName}:${squareRetrofit2Version}"

    fun Retrofit2.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(retrofit2: Retrofit2) {
        add("implementation", retrofit2.dependency)
    }
}
