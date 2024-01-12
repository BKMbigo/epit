package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXCredentialsScope internal constructor(
    private val androidXCredentialsVersion: String
) {

    @ExperimentalEpitApi
    val Epit.credentials
        get() = AndroidX.Credentials.credentials.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.credentials(version: String) =
        AndroidX.Credentials.credentials.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.credentials_play_services_auth
        get() = AndroidX.Credentials.credentials_play_services_auth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.credentials_play_services_auth(version: String) =
        AndroidX.Credentials.credentials_play_services_auth.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Credentials.dependencyAsString
        get() = moduleName joinWithColon androidXCredentialsVersion

    internal fun AndroidX.Credentials.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
