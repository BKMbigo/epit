package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXDataStoreScope internal constructor(
    private val androidXDataStoreVersion: String
) {

    @ExperimentalEpitApi
    val Epit.datastore
        get() = AndroidX.DataStore.datastore.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore(version: String) =
        AndroidX.DataStore.datastore.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_core
        get() = AndroidX.DataStore.datastore_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_core(version: String) =
        AndroidX.DataStore.datastore_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_core_okio
        get() = AndroidX.DataStore.datastore_core_okio.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_core_okio(version: String) =
        AndroidX.DataStore.datastore_core_okio.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_preferences
        get() = AndroidX.DataStore.datastore_preferences.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_preferences(version: String) =
        AndroidX.DataStore.datastore_preferences.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_preferences_core
        get() = AndroidX.DataStore.datastore_preferences_core.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_preferences_core(version: String) =
        AndroidX.DataStore.datastore_preferences_core.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_preferences_rxjava2
        get() = AndroidX.DataStore.datastore_preferences_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_preferences_rxjava2(version: String) =
        AndroidX.DataStore.datastore_preferences_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_preferences_rxjava3
        get() = AndroidX.DataStore.datastore_preferences_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_preferences_rxjava3(version: String) =
        AndroidX.DataStore.datastore_preferences_rxjava3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_rxjava2
        get() = AndroidX.DataStore.datastore_rxjava2.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_rxjava2(version: String) =
        AndroidX.DataStore.datastore_rxjava2.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.datastore_rxjava3
        get() = AndroidX.DataStore.datastore_rxjava3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datastore_rxjava3(version: String) =
        AndroidX.DataStore.datastore_rxjava3.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.DataStore.dependencyAsString
        get() = moduleName joinWithColon androidXDataStoreVersion

    internal fun AndroidX.DataStore.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
