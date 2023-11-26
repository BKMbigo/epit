package epit.dsl.squareup

import epit.EpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class OkHttp3(
    internal val moduleName: String
) : EpitDependency {
    okhttp(moduleName = "com.squareup.okhttp3:okhttp"),
    okhttp_android(moduleName = "com.squareup.okhttp3:okhttp-android"),
    logging_interceptor(moduleName = "com.squareup.okhttp3:logging-interceptor"),
    okhttp_urlconnection(moduleName = "com.squareup.okhttp3:okhttp-urlconnection"),
    okhttp_tls(moduleName = "com.squareup.okhttp3:okhttp-tls"),
    okhttp_sse(moduleName = "com.squareup.okhttp3:okhttp-sse"),
    okhttp_coroutines(moduleName = "com.squareup.okhttp3:okhttp-coroutines"),
    okhttp_dnsoverhttps(moduleName = "com.squareup.okhttp3:okhttp-dnsoverhttps"),

    //    okhttp_coroutines_jvm(moduleName = "com.squareup.okhttp3:okhttp-coroutines-jvm"),
//    okhttp_coroutines_js(moduleName = "com.squareup.okhttp3:okhttp-coroutines-js"),
    okhttp_brotli(moduleName = "com.squareup.okhttp3:okhttp-brotli"),
    okcurl(moduleName = "com.squareup.okhttp3:okcurl"),

    //    okcurl_jvm(moduleName = "com.squareup.okhttp3:okcurl-jvm"),
    mockwebserver3_junit5(moduleName = "com.squareup.okhttp3:mockwebserver3-junit5"),
    mockwebserver3_junit4(moduleName = "com.squareup.okhttp3:mockwebserver3-junit4"),

    //    okhttp_jvm(moduleName = "com.squareup.okhttp3:okhttp-jvm"),
    mockwebserver3(moduleName = "com.squareup.okhttp3:mockwebserver3"),

    //    okhttp_js(moduleName = "com.squareup.okhttp3:okhttp-js"),
    mockwebserver(moduleName = "com.squareup.okhttp3:mockwebserver"),
    okhttp_bom(moduleName = "com.squareup.okhttp3:okhttp-bom"),
//    benchmarks(moduleName = "com.squareup.okhttp3:benchmarks"),
//    okhttp_apache(moduleName = "com.squareup.okhttp3:okhttp-apache"),
//    okhttp_android_support(moduleName = "com.squareup.okhttp3:okhttp-android-support"),
//    okhttp_testing_support(moduleName = "com.squareup.okhttp3:okhttp-testing-support"),
//    parent(moduleName = "com.squareup.okhttp3:parent"),
//    okhttp_ws(moduleName = "com.squareup.okhttp3:okhttp-ws")
}

class EpitSquareOkHttp3BOMScope(
    private val squareOkHttp3BOMVersion: String
) {

    val bom = "${OkHttp3.okhttp_bom.moduleName}:${squareOkHttp3BOMVersion}"

    fun bom(customVersion: String) = "${OkHttp3.okhttp_bom.moduleName}:${customVersion}"

    val OkHttp3.dependency
        get(): String = "${this.moduleName}:${squareOkHttp3BOMVersion}"

    fun OkHttp3.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(okHttp3: OkHttp3) {
        add("implementation", okHttp3.moduleName)
    }
}
