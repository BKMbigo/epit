package epit.dsl.ktor

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitExperimentalKtorScope internal constructor(
    private val ktorBOMVersion: String
) {
    /** Adds `io.ktor:ktor-client` */
    @ExperimentalEpitApi
    val Epit.ktor_client
        get() = Ktor.Ktor.ktor_client.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client(version: String) =
        Ktor.Ktor.ktor_client.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_http
        get() = Ktor.Ktor.ktor_http.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_http(version: String) =
        Ktor.Ktor.ktor_http.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_io
        get() = Ktor.Ktor.ktor_io.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_io(version: String) =
        Ktor.Ktor.ktor_io.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_network
        get() = Ktor.Ktor.ktor_network.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_network(version: String) =
        Ktor.Ktor.ktor_network.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server
        get() = Ktor.Ktor.ktor_server.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server(version: String) =
        Ktor.Ktor.ktor_server.dependencyAsString

    @ExperimentalEpitApi
    val Epit.ktor_shared
        get() = Ktor.Ktor.ktor_shared.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_shared(version: String) =
        Ktor.Ktor.ktor_shared.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_test_dispatcher
        get() = Ktor.Ktor.ktor_test_dispatcher.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_test_dispatcher(version: String) =
        Ktor.Ktor.ktor_test_dispatcher.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_utils
        get() = Ktor.Ktor.ktor_utils.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_utils(version: String) =
        Ktor.Ktor.ktor_utils.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_android
        get() = Ktor.Ktor.ktor_client_android.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_android(version: String) =
        Ktor.Ktor.ktor_client_android.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_apache
        get() = Ktor.Ktor.ktor_client_apache.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_apache(version: String) =
        Ktor.Ktor.ktor_client_apache.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_apache5
        get() = Ktor.Ktor.ktor_client_apache5.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_apache5(version: String) =
        Ktor.Ktor.ktor_client_apache5.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_cio
        get() = Ktor.Ktor.ktor_client_cio.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_cio(version: String) =
        Ktor.Ktor.ktor_client_cio.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_core
        get() = Ktor.Ktor.ktor_client_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_core(version: String) =
        Ktor.Ktor.ktor_client_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_curl
        get() = Ktor.Ktor.ktor_client_curl.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_curl(version: String) =
        Ktor.Ktor.ktor_client_curl.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_darwin
        get() = Ktor.Ktor.ktor_client_darwin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_darwin(version: String) =
        Ktor.Ktor.ktor_client_darwin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_darwin_legacy
        get() = Ktor.Ktor.ktor_client_darwin_legacy.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_darwin_legacy(version: String) =
        Ktor.Ktor.ktor_client_darwin_legacy.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_ios
        get() = Ktor.Ktor.ktor_client_ios.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_ios(version: String) =
        Ktor.Ktor.ktor_client_ios.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_java
        get() = Ktor.Ktor.ktor_client_java.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_java(version: String) =
        Ktor.Ktor.ktor_client_java.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_jetty
        get() = Ktor.Ktor.ktor_client_jetty.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_jetty(version: String) =
        Ktor.Ktor.ktor_client_jetty.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_js
        get() = Ktor.Ktor.ktor_client_js.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_js(version: String) =
        Ktor.Ktor.ktor_client_js.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_mock
        get() = Ktor.Ktor.ktor_client_mock.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_mock(version: String) =
        Ktor.Ktor.ktor_client_mock.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_plugins
        get() = Ktor.Ktor.ktor_client_plugins.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_plugins(version: String) =
        Ktor.Ktor.ktor_client_plugins.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_tests
        get() = Ktor.Ktor.ktor_client_tests.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_tests(version: String) =
        Ktor.Ktor.ktor_client_tests.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_winhttp
        get() = Ktor.Ktor.ktor_client_winhttp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_winhttp(version: String) =
        Ktor.Ktor.ktor_client_winhttp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_http_cio
        get() = Ktor.Ktor.ktor_http_cio.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_http_cio(version: String) =
        Ktor.Ktor.ktor_http_cio.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_network_tls
        get() = Ktor.Ktor.ktor_network_tls.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_network_tls(version: String) =
        Ktor.Ktor.ktor_network_tls.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_cio
        get() = Ktor.Ktor.ktor_server_cio.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_cio(version: String) =
        Ktor.Ktor.ktor_server_cio.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_config_yaml
        get() = Ktor.Ktor.ktor_server_config_yaml.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_config_yaml(version: String) =
        Ktor.Ktor.ktor_server_config_yaml.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_core
        get() = Ktor.Ktor.ktor_server_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_core(version: String) =
        Ktor.Ktor.ktor_server_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_host_common
        get() = Ktor.Ktor.ktor_server_host_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_host_common(version: String) =
        Ktor.Ktor.ktor_server_host_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_jetty
        get() = Ktor.Ktor.ktor_server_jetty.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_jetty(version: String) =
        Ktor.Ktor.ktor_server_jetty.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_netty
        get() = Ktor.Ktor.ktor_server_netty.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_netty(version: String) =
        Ktor.Ktor.ktor_server_netty.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_plugins
        get() = Ktor.Ktor.ktor_server_plugins.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_plugins(version: String) =
        Ktor.Ktor.ktor_server_plugins.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_servlet
        get() = Ktor.Ktor.ktor_server_servlet.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_servlet(version: String) =
        Ktor.Ktor.ktor_server_servlet.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_test_host
        get() = Ktor.Ktor.ktor_server_test_host.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_test_host(version: String) =
        Ktor.Ktor.ktor_server_test_host.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_test_suites
        get() = Ktor.Ktor.ktor_server_test_suites.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_test_suites(version: String) =
        Ktor.Ktor.ktor_server_test_suites.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_tests
        get() = Ktor.Ktor.ktor_server_tests.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_tests(version: String) =
        Ktor.Ktor.ktor_server_tests.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_tomcat
        get() = Ktor.Ktor.ktor_server_tomcat.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_tomcat(version: String) =
        Ktor.Ktor.ktor_server_tomcat.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_call_id
        get() = Ktor.Ktor.ktor_call_id.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_call_id(version: String) =
        Ktor.Ktor.ktor_call_id.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_events
        get() = Ktor.Ktor.ktor_events.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_events(version: String) =
        Ktor.Ktor.ktor_events.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_resources
        get() = Ktor.Ktor.ktor_resources.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_resources(version: String) =
        Ktor.Ktor.ktor_resources.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization
        get() = Ktor.Ktor.ktor_serialization.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization(version: String) =
        Ktor.Ktor.ktor_serialization.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_sse
        get() = Ktor.Ktor.ktor_sse.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_sse(version: String) =
        Ktor.Ktor.ktor_sse.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_websocket_serialization
        get() = Ktor.Ktor.ktor_websocket_serialization.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_websocket_serialization(version: String) =
        Ktor.Ktor.ktor_websocket_serialization.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_websockets
        get() = Ktor.Ktor.ktor_websockets.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_websockets(version: String) =
        Ktor.Ktor.ktor_websockets.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_auth
        get() = Ktor.Ktor.ktor_client_auth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_auth(version: String) =
        Ktor.Ktor.ktor_client_auth.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_bom_remover
        get() = Ktor.Ktor.ktor_client_bom_remover.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_bom_remover(version: String) =
        Ktor.Ktor.ktor_client_bom_remover.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_call_id
        get() = Ktor.Ktor.ktor_client_call_id.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_call_id(version: String) =
        Ktor.Ktor.ktor_client_call_id.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_content_negotiation
        get() = Ktor.Ktor.ktor_client_content_negotiation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_content_negotiation(version: String) =
        Ktor.Ktor.ktor_client_content_negotiation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_encoding
        get() = Ktor.Ktor.ktor_client_encoding.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_encoding(version: String) =
        Ktor.Ktor.ktor_client_encoding.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_json
        get() = Ktor.Ktor.ktor_client_json.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_json(version: String) =
        Ktor.Ktor.ktor_client_json.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_logging
        get() = Ktor.Ktor.ktor_client_logging.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_logging(version: String) =
        Ktor.Ktor.ktor_client_logging.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_resources
        get() = Ktor.Ktor.ktor_client_resources.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_resources(version: String) =
        Ktor.Ktor.ktor_client_resources.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_websockets
        get() = Ktor.Ktor.ktor_client_websockets.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_websockets(version: String) =
        Ktor.Ktor.ktor_client_websockets.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_network_tls_certificates
        get() = Ktor.Ktor.ktor_network_tls_certificates.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_network_tls_certificates(version: String) =
        Ktor.Ktor.ktor_network_tls_certificates.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_jetty_test_http2
        get() = Ktor.Ktor.ktor_server_jetty_test_http2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_jetty_test_http2(version: String) =
        Ktor.Ktor.ktor_server_jetty_test_http2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_auth
        get() = Ktor.Ktor.ktor_server_auth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_auth(version: String) =
        Ktor.Ktor.ktor_server_auth.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_auto_head_response
        get() = Ktor.Ktor.ktor_server_auto_head_response.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_auto_head_response(version: String) =
        Ktor.Ktor.ktor_server_auto_head_response.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_body_limit
        get() = Ktor.Ktor.ktor_server_body_limit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_body_limit(version: String) =
        Ktor.Ktor.ktor_server_body_limit.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_caching_headers
        get() = Ktor.Ktor.ktor_server_caching_headers.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_caching_headers(version: String) =
        Ktor.Ktor.ktor_server_caching_headers.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_call_id
        get() = Ktor.Ktor.ktor_server_call_id.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_call_id(version: String) =
        Ktor.Ktor.ktor_server_call_id.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_call_logging
        get() = Ktor.Ktor.ktor_server_call_logging.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_call_logging(version: String) =
        Ktor.Ktor.ktor_server_call_logging.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_compression
        get() = Ktor.Ktor.ktor_server_compression.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_compression(version: String) =
        Ktor.Ktor.ktor_server_compression.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_content_negotiation
        get() = Ktor.Ktor.ktor_server_content_negotiation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_content_negotiation(version: String) =
        Ktor.Ktor.ktor_server_content_negotiation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_cors
        get() = Ktor.Ktor.ktor_server_cors.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_cors(version: String) =
        Ktor.Ktor.ktor_server_cors.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_data_conversion
        get() = Ktor.Ktor.ktor_server_data_conversion.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_data_conversion(version: String) =
        Ktor.Ktor.ktor_server_data_conversion.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_default_headers
        get() = Ktor.Ktor.ktor_server_default_headers.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_default_headers(version: String) =
        Ktor.Ktor.ktor_server_default_headers.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_double_receive
        get() = Ktor.Ktor.ktor_server_double_receive.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_double_receive(version: String) =
        Ktor.Ktor.ktor_server_double_receive.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_forwarded_header
        get() = Ktor.Ktor.ktor_server_forwarded_header.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_forwarded_header(version: String) =
        Ktor.Ktor.ktor_server_forwarded_header.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_hsts
        get() = Ktor.Ktor.ktor_server_hsts.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_hsts(version: String) =
        Ktor.Ktor.ktor_server_hsts.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_html_builder
        get() = Ktor.Ktor.ktor_server_html_builder.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_html_builder(version: String) =
        Ktor.Ktor.ktor_server_html_builder.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_http_redirect
        get() = Ktor.Ktor.ktor_server_http_redirect.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_http_redirect(version: String) =
        Ktor.Ktor.ktor_server_http_redirect.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_jte
        get() = Ktor.Ktor.ktor_server_jte.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_jte(version: String) =
        Ktor.Ktor.ktor_server_jte.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_method_override
        get() = Ktor.Ktor.ktor_server_method_override.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_method_override(version: String) =
        Ktor.Ktor.ktor_server_method_override.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_metrics
        get() = Ktor.Ktor.ktor_server_metrics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_metrics(version: String) =
        Ktor.Ktor.ktor_server_metrics.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_mustache
        get() = Ktor.Ktor.ktor_server_mustache.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_mustache(version: String) =
        Ktor.Ktor.ktor_server_mustache.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_openapi
        get() = Ktor.Ktor.ktor_server_openapi.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_openapi(version: String) =
        Ktor.Ktor.ktor_server_openapi.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_partial_content
        get() = Ktor.Ktor.ktor_server_partial_content.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_partial_content(version: String) =
        Ktor.Ktor.ktor_server_partial_content.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_pebble
        get() = Ktor.Ktor.ktor_server_pebble.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_pebble(version: String) =
        Ktor.Ktor.ktor_server_pebble.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_rate_limit
        get() = Ktor.Ktor.ktor_server_rate_limit.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_rate_limit(version: String) =
        Ktor.Ktor.ktor_server_rate_limit.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_request_validation
        get() = Ktor.Ktor.ktor_server_request_validation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_request_validation(version: String) =
        Ktor.Ktor.ktor_server_request_validation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_resources
        get() = Ktor.Ktor.ktor_server_resources.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_resources(version: String) =
        Ktor.Ktor.ktor_server_resources.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_sessions
        get() = Ktor.Ktor.ktor_server_sessions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_sessions(version: String) =
        Ktor.Ktor.ktor_server_sessions.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_sse
        get() = Ktor.Ktor.ktor_server_sse.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_sse(version: String) =
        Ktor.Ktor.ktor_server_sse.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_status_pages
        get() = Ktor.Ktor.ktor_server_status_pages.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_status_pages(version: String) =
        Ktor.Ktor.ktor_server_status_pages.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_swagger
        get() = Ktor.Ktor.ktor_server_swagger.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_swagger(version: String) =
        Ktor.Ktor.ktor_server_swagger.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_thymeleaf
        get() = Ktor.Ktor.ktor_server_thymeleaf.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_thymeleaf(version: String) =
        Ktor.Ktor.ktor_server_thymeleaf.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_velocity
        get() = Ktor.Ktor.ktor_server_velocity.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_velocity(version: String) =
        Ktor.Ktor.ktor_server_velocity.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_webjars
        get() = Ktor.Ktor.ktor_server_webjars.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_webjars(version: String) =
        Ktor.Ktor.ktor_server_webjars.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_server_websockets
        get() = Ktor.Ktor.ktor_server_websockets.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_server_websockets(version: String) =
        Ktor.Ktor.ktor_server_websockets.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_gson
        get() = Ktor.Ktor.ktor_serialization_gson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_gson(version: String) =
        Ktor.Ktor.ktor_serialization_gson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_jackson
        get() = Ktor.Ktor.ktor_serialization_jackson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_jackson(version: String) =
        Ktor.Ktor.ktor_serialization_jackson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx
        get() = Ktor.Ktor.ktor_serialization_kotlinx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_tests
        get() = Ktor.Ktor.ktor_serialization_tests.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_tests(version: String) =
        Ktor.Ktor.ktor_serialization_tests.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_content_negotiation_tests
        get() = Ktor.Ktor.ktor_client_content_negotiation_tests.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_content_negotiation_tests(version: String) =
        Ktor.Ktor.ktor_client_content_negotiation_tests.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_gson
        get() = Ktor.Ktor.ktor_client_gson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_gson(version: String) =
        Ktor.Ktor.ktor_client_gson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_jackson
        get() = Ktor.Ktor.ktor_client_jackson.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_jackson(version: String) =
        Ktor.Ktor.ktor_client_jackson.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_client_serialization
        get() = Ktor.Ktor.ktor_client_serialization.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_client_serialization(version: String) =
        Ktor.Ktor.ktor_client_serialization.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx_cbor
        get() = Ktor.Ktor.ktor_serialization_kotlinx_cbor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx_cbor(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx_cbor.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx_json
        get() = Ktor.Ktor.ktor_serialization_kotlinx_json.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx_json(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx_json.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx_protobuf
        get() = Ktor.Ktor.ktor_serialization_kotlinx_protobuf.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx_protobuf(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx_protobuf.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx_tests
        get() = Ktor.Ktor.ktor_serialization_kotlinx_tests.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx_tests(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx_tests.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.ktor_serialization_kotlinx_xml
        get() = Ktor.Ktor.ktor_serialization_kotlinx_xml.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.ktor_serialization_kotlinx_xml(version: String) =
        Ktor.Ktor.ktor_serialization_kotlinx_xml.dependencyAsString(version)


    /*
    * =============================
    * ==== Internal Functions =====
    * =============================
    * */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = ktor_bom_module_name joinWithColon ktorBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = ktor_bom_module_name joinWithColon customVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val Ktor.Ktor.dependencyAsString
        get() = moduleName

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun Ktor.Ktor.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(ktor: Ktor.Ktor) {
        add("implementation", ktor.moduleName)
    }

    companion object {
        internal val ktor_bom_module_name = "io.ktor:ktor-bom"
    }
}
