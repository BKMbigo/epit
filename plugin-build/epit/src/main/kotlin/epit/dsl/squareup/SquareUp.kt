package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.utils.joinWithColon

@ExperimentalEpitApi
sealed interface SquareUp : EpitDependency {

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
        leakcanary_android_core(moduleName = "com.squareup.leakcanary:leakcanary-android-core");
//        leakcanary_watcher(moduleName = "com.squareup.leakcanary:leakcanary-watcher"),
//        leakcanary_log(moduleName = "com.squareup.leakcanary:leakcanary-log"),
//        leaksentry(moduleName = "com.squareup.leakcanary:leaksentry"),
//        leakcanary_haha(moduleName = "com.squareup.leakcanary:leakcanary-haha"),
//        leakcanary_analyzer(moduleName = "com.squareup.leakcanary:leakcanary-analyzer"),
//        leakcanary_android_perflib(moduleName = "com.squareup.leakcanary:leakcanary-android-perflib"),
//        leakcanary_perflib_analyzer(moduleName = "com.squareup.leakcanary:leakcanary-perflib-analyzer"),
//        leakcanary_analyzer_core(moduleName = "com.squareup.leakcanary:leakcanary-analyzer-core"),
//        leakcanary_support_fragment(moduleName = "com.squareup.leakcanary:leakcanary-support-fragment"),
//        leakcanary_android_no_op(moduleName = "com.squareup.leakcanary:leakcanary-android-no-op")

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    @ExperimentalEpitApi
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

        // okhttp_coroutines_jvm(moduleName = "com.squareup.okhttp3:okhttp-coroutines-jvm"),
        // okhttp_coroutines_js(moduleName = "com.squareup.okhttp3:okhttp-coroutines-js"),
        okhttp_brotli(moduleName = "com.squareup.okhttp3:okhttp-brotli"),
        okcurl(moduleName = "com.squareup.okhttp3:okcurl"),

        //    okcurl_jvm(moduleName = "com.squareup.okhttp3:okcurl-jvm"),
        mockwebserver3_junit5(moduleName = "com.squareup.okhttp3:mockwebserver3-junit5"),
        mockwebserver3_junit4(moduleName = "com.squareup.okhttp3:mockwebserver3-junit4"),

        //    okhttp_jvm(moduleName = "com.squareup.okhttp3:okhttp-jvm"),
        mockwebserver3(moduleName = "com.squareup.okhttp3:mockwebserver3"),

        //    okhttp_js(moduleName = "com.squareup.okhttp3:okhttp-js"),
        mockwebserver(moduleName = "com.squareup.okhttp3:mockwebserver"),
        okhttp_bom(moduleName = "com.squareup.okhttp3:okhttp-bom");
//        benchmarks(moduleName = "com.squareup.okhttp3:benchmarks"),
//        okhttp_apache(moduleName = "com.squareup.okhttp3:okhttp-apache"),
//        okhttp_android_support(moduleName = "com.squareup.okhttp3:okhttp-android-support"),
//        okhttp_testing_support(moduleName = "com.squareup.okhttp3:okhttp-testing-support"),
//        parent(moduleName = "com.squareup.okhttp3:parent"),
//        okhttp_ws(moduleName = "com.squareup.okhttp3:okhttp-ws")

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

    enum class Picasso(
        internal val moduleName: String
    ) : EpitDependency {
        picasso(moduleName = "com.squareup.picasso:picasso"),

        //    picasso_sample(moduleName = "com.squareup.picasso:picasso-sample"),
        //    picasso_parent(moduleName = "com.squareup.picasso:picasso-parent"),
        picasso_pollexor(moduleName = "com.squareup.picasso:picasso-pollexor");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

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
        retrofit(moduleName = "com.squareup.retrofit2:retrofit");
//    retrofit_converters(moduleName = "com.squareup.retrofit2:retrofit-converters"),
//    retrofit_adapters(moduleName = "com.squareup.retrofit2:retrofit-adapters"),
//    parent(moduleName = "com.squareup.retrofit2:parent")
override fun withVersion(version: String): String = moduleName joinWithColon version
    }
}
