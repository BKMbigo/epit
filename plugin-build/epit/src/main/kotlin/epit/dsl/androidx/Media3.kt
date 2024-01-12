package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXMedia3Scope internal constructor(
    private val androidxMedia3Version: String
) {

    @ExperimentalEpitApi
    val Epit.media3_cast
        get() = AndroidX.Media3.media3_cast.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_cast(version: String) =
        AndroidX.Media3.media3_cast.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_common
        get() = AndroidX.Media3.media3_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_common(version: String) =
        AndroidX.Media3.media3_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_container
        get() = AndroidX.Media3.media3_container.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_container(version: String) =
        AndroidX.Media3.media3_container.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_database
        get() = AndroidX.Media3.media3_database.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_database(version: String) =
        AndroidX.Media3.media3_database.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_datasource
        get() = AndroidX.Media3.media3_datasource.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_datasource(version: String) =
        AndroidX.Media3.media3_datasource.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_datasource_cronet
        get() = AndroidX.Media3.media3_datasource_cronet.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_datasource_cronet(version: String) =
        AndroidX.Media3.media3_datasource_cronet.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_datasource_okhttp
        get() = AndroidX.Media3.media3_datasource_okhttp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_datasource_okhttp(version: String) =
        AndroidX.Media3.media3_datasource_okhttp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_datasource_rtmp
        get() = AndroidX.Media3.media3_datasource_rtmp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_datasource_rtmp(version: String) =
        AndroidX.Media3.media3_datasource_rtmp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_decoder
        get() = AndroidX.Media3.media3_decoder.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_decoder(version: String) =
        AndroidX.Media3.media3_decoder.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_effect
        get() = AndroidX.Media3.media3_effect.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_effect(version: String) =
        AndroidX.Media3.media3_effect.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer
        get() = AndroidX.Media3.media3_exoplayer.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer(version: String) =
        AndroidX.Media3.media3_exoplayer.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_dash
        get() = AndroidX.Media3.media3_exoplayer_dash.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_dash(version: String) =
        AndroidX.Media3.media3_exoplayer_dash.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_hls
        get() = AndroidX.Media3.media3_exoplayer_hls.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_hls(version: String) =
        AndroidX.Media3.media3_exoplayer_hls.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_ima
        get() = AndroidX.Media3.media3_exoplayer_ima.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_ima(version: String) =
        AndroidX.Media3.media3_exoplayer_ima.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_midi
        get() = AndroidX.Media3.media3_exoplayer_midi.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_midi(version: String) =
        AndroidX.Media3.media3_exoplayer_midi.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_rtmp
        get() = AndroidX.Media3.media3_exoplayer_rtmp.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_rtmp(version: String) =
        AndroidX.Media3.media3_exoplayer_rtmp.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_smoothstreaming
        get() = AndroidX.Media3.media3_exoplayer_smoothstreaming.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_smoothstreaming(version: String) =
        AndroidX.Media3.media3_exoplayer_smoothstreaming.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_exoplayer_workmanager
        get() = AndroidX.Media3.media3_exoplayer_workmanager.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_exoplayer_workmanager(version: String) =
        AndroidX.Media3.media3_exoplayer_workmanager.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_extractor
        get() = AndroidX.Media3.media3_extractor.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_extractor(version: String) =
        AndroidX.Media3.media3_extractor.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_muxer
        get() = AndroidX.Media3.media3_muxer.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_muxer(version: String) =
        AndroidX.Media3.media3_muxer.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_session
        get() = AndroidX.Media3.media3_session.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_session(version: String) =
        AndroidX.Media3.media3_session.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_test_utils
        get() = AndroidX.Media3.media3_test_utils.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_test_utils(version: String) =
        AndroidX.Media3.media3_test_utils.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_test_utils_robolectric
        get() = AndroidX.Media3.media3_test_utils_robolectric.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_test_utils_robolectric(version: String) =
        AndroidX.Media3.media3_test_utils_robolectric.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_transformer
        get() = AndroidX.Media3.media3_transformer.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_transformer(version: String) =
        AndroidX.Media3.media3_transformer.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_ui
        get() = AndroidX.Media3.media3_ui.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_ui(version: String) =
        AndroidX.Media3.media3_ui.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.media3_ui_leanback
        get() = AndroidX.Media3.media3_ui_leanback.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.media3_ui_leanback(version: String) =
        AndroidX.Media3.media3_ui_leanback.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Media3.dependencyAsString
        get() = moduleName joinWithColon androidxMedia3Version

    internal fun AndroidX.Media3.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
