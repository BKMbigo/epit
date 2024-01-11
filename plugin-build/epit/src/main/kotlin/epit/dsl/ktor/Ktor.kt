package epit.dsl.ktor

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon

@InternalEpitApi
@ExperimentalEpitApi
sealed interface Ktor : EpitDependency {

    @InternalEpitApi
    @ExperimentalEpitApi
    enum class Ktor(
        internal val moduleName: String,
    ) : MainKtor {
        ktor_client(moduleName = "io.ktor:ktor-client"),

        ktor_http(moduleName = "io.ktor:ktor-http"),

        ktor_io(moduleName = "io.ktor:ktor-io"),

        ktor_network(moduleName = "io.ktor:ktor-network"),

        ktor_server(moduleName = "io.ktor:ktor-server"),

        ktor_shared(moduleName = "io.ktor:ktor-shared"),

        ktor_test_dispatcher(moduleName = "io.ktor:ktor-test-dispatcher"),

        ktor_utils(moduleName = "io.ktor:ktor-utils"),

        ktor_client_android(moduleName = "io.ktor:ktor-client-android"),
        ktor_client_apache(moduleName = "io.ktor:ktor-client-apache"),
        ktor_client_apache5(moduleName = "io.ktor:ktor-client-apache5"),
        ktor_client_cio(moduleName = "io.ktor:ktor-client-cio"),
        ktor_client_core(moduleName = "io.ktor:ktor-client-core"),
        ktor_client_curl(moduleName = "io.ktor:ktor-client-curl"),
        ktor_client_darwin(moduleName = "io.ktor:ktor-client-darwin"),
        ktor_client_darwin_legacy(moduleName = "io.ktor:ktor-client-darwin-legacy"),
        ktor_client_ios(moduleName = "io.ktor:ktor-client-ios"),
        ktor_client_java(moduleName = "io.ktor:ktor-client-java"),
        ktor_client_jetty(moduleName = "io.ktor:ktor-client-jetty"),
        ktor_client_js(moduleName = "io.ktor:ktor-client-js"),
        ktor_client_mock(moduleName = "io.ktor:ktor-client-mock"),
        ktor_client_plugins(moduleName = "io.ktor:ktor-client-plugins"),
        ktor_client_tests(moduleName = "io.ktor:ktor-client-tests"),
        ktor_client_winhttp(moduleName = "io.ktor:ktor-client-winhttp"),

        ktor_http_cio(moduleName = "io.ktor:ktor-http-cio"),

        ktor_network_tls(moduleName = "io.ktor:ktor-network-tls"),

        ktor_server_cio(moduleName = "io.ktor:ktor-server-cio"),
        ktor_server_config_yaml(moduleName = "io.ktor:ktor-server-config-yaml"),
        ktor_server_core(moduleName = "io.ktor:ktor-server-core"),
        ktor_server_host_common(moduleName = "io.ktor:ktor-server-host-common"),
        ktor_server_jetty(moduleName = "io.ktor:ktor-server-jetty"),
        ktor_server_netty(moduleName = "io.ktor:ktor-server-netty"),
        ktor_server_plugins(moduleName = "io.ktor:ktor-server-plugins"),
        ktor_server_servlet(moduleName = "io.ktor:ktor-server-servlet"),
        ktor_server_test_host(moduleName = "io.ktor:ktor-server-test-host"),
        ktor_server_test_suites(moduleName = "io.ktor:ktor-server-test-suites"),
        ktor_server_tests(moduleName = "io.ktor:ktor-server-tests"),
        ktor_server_tomcat(moduleName = "io.ktor:ktor-server-tomcat"),

        ktor_call_id(moduleName = "io.ktor:ktor-call-id"),

        ktor_events(moduleName = "io.ktor:ktor-events"),

        ktor_resources(moduleName = "io.ktor:ktor-resources"),

        ktor_serialization(moduleName = "io.ktor:ktor-serialization"),

        ktor_sse(moduleName = "io.ktor:ktor-sse"),

        ktor_websocket_serialization(moduleName = "io.ktor:ktor-websocket-serialization"),
        ktor_websockets(moduleName = "io.ktor:ktor-websockets"),

        ktor_client_auth(moduleName = "io.ktor:ktor-client-auth"),
        ktor_client_bom_remover(moduleName = "io.ktor:ktor-client-bom-remover"),
        ktor_client_call_id(moduleName = "io.ktor:ktor-client-call-id"),
        ktor_client_content_negotiation(moduleName = "io.ktor:ktor-client-content-negotiation"),
        ktor_client_encoding(moduleName = "io.ktor:ktor-client-encoding"),
        ktor_client_json(moduleName = "io.ktor:ktor-client-json"),
        ktor_client_logging(moduleName = "io.ktor:ktor-client-logging"),
        ktor_client_resources(moduleName = "io.ktor:ktor-client-resources"),
        ktor_client_websockets(moduleName = "io.ktor:ktor-client-websockets"),

        ktor_network_tls_certificates(moduleName = "io.ktor:ktor-network-tls-certificates"),

        ktor_server_jetty_test_http2(moduleName = "io.ktor:ktor-server-jetty-test-http2"),
        ktor_server_auth(moduleName = "io.ktor:ktor-server-auth"),
        ktor_server_auto_head_response(moduleName = "io.ktor:ktor-server-auto-head-response"),
        ktor_server_body_limit(moduleName = "io.ktor:ktor-server-body-limit"),
        ktor_server_caching_headers(moduleName = "io.ktor:ktor-server-caching-headers"),
        ktor_server_call_id(moduleName = "io.ktor:ktor-server-call-id"),
        ktor_server_call_logging(moduleName = "io.ktor:ktor-server-call-logging"),
        ktor_server_compression(moduleName = "io.ktor:ktor-server-compression"),
        ktor_server_content_negotiation(moduleName = "io.ktor:ktor-server-content-negotiation"),
        ktor_server_cors(moduleName = "io.ktor:ktor-server-cors"),
        ktor_server_data_conversion(moduleName = "io.ktor:ktor-server-data-conversion"),
        ktor_server_default_headers(moduleName = "io.ktor:ktor-server-default-headers"),
        ktor_server_double_receive(moduleName = "io.ktor:ktor-server-double-receive"),
        ktor_server_forwarded_header(moduleName = "io.ktor:ktor-server-forwarded-header"),
        ktor_server_hsts(moduleName = "io.ktor:ktor-server-hsts"),
        ktor_server_html_builder(moduleName = "io.ktor:ktor-server-html-builder"),
        ktor_server_http_redirect(moduleName = "io.ktor:ktor-server-http-redirect"),
        ktor_server_jte(moduleName = "io.ktor:ktor-server-jte"),
        ktor_server_method_override(moduleName = "io.ktor:ktor-server-method-override"),
        ktor_server_metrics(moduleName = "io.ktor:ktor-server-metrics"),
        ktor_server_mustache(moduleName = "io.ktor:ktor-server-mustache"),
        ktor_server_openapi(moduleName = "io.ktor:ktor-server-openapi"),
        ktor_server_partial_content(moduleName = "io.ktor:ktor-server-partial-content"),
        ktor_server_pebble(moduleName = "io.ktor:ktor-server-pebble"),
        ktor_server_rate_limit(moduleName = "io.ktor:ktor-server-rate-limit"),
        ktor_server_request_validation(moduleName = "io.ktor:ktor-server-request-validation"),
        ktor_server_resources(moduleName = "io.ktor:ktor-server-resources"),
        ktor_server_sessions(moduleName = "io.ktor:ktor-server-sessions"),
        ktor_server_sse(moduleName = "io.ktor:ktor-server-sse"),
        ktor_server_status_pages(moduleName = "io.ktor:ktor-server-status-pages"),
        ktor_server_swagger(moduleName = "io.ktor:ktor-server-swagger"),
        ktor_server_thymeleaf(moduleName = "io.ktor:ktor-server-thymeleaf"),
        ktor_server_velocity(moduleName = "io.ktor:ktor-server-velocity"),
        ktor_server_webjars(moduleName = "io.ktor:ktor-server-webjars"),
        ktor_server_websockets(moduleName = "io.ktor:ktor-server-websockets"),

        ktor_serialization_gson(moduleName = "io.ktor:ktor-serialization-gson"),
        ktor_serialization_jackson(moduleName = "io.ktor:ktor-serialization-jackson"),
        ktor_serialization_kotlinx(moduleName = "io.ktor:ktor-serialization-kotlinx"),
        ktor_serialization_tests(moduleName = "io.ktor:ktor-serialization-tests"),

        ktor_client_content_negotiation_tests(moduleName = "io.ktor:ktor-client-content-negotiation-tests"),
        ktor_client_gson(moduleName = "io.ktor:ktor-client-gson"),
        ktor_client_jackson(moduleName = "io.ktor:ktor-client-jackson"),
        ktor_client_serialization(moduleName = "io.ktor:ktor-client-serialization"),

        ktor_serialization_kotlinx_cbor(moduleName = "io.ktor:ktor-serialization-kotlinx-cbor"),
        ktor_serialization_kotlinx_json(moduleName = "io.ktor:ktor-serialization-kotlinx-json"),
        ktor_serialization_kotlinx_protobuf(moduleName = "io.ktor:ktor-serialization-kotlinx-protobuf"),
        ktor_serialization_kotlinx_tests(moduleName = "io.ktor:ktor-serialization-kotlinx-tests"),
        ktor_serialization_kotlinx_xml(moduleName = "io.ktor:ktor-serialization-kotlinx-xml"), ;

        override fun withVersion(version: String): String = moduleName joinWithColon version

    }
}

private typealias MainKtor = Ktor
