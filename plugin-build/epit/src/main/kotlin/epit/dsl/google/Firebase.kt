package epit.dsl.google

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitFirebaseScope internal constructor(
    internal val firebaseBOMVersion: String
) {

    @ExperimentalEpitApi
    val Epit.firebase_analytics
        get() = Google.Firebase.firebase_analytics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_analytics(version: String): String =
        Google.Firebase.firebase_analytics.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_analytics_ktx
        get() = Google.Firebase.firebase_analytics_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_analytics_ktx(version: String): String =
        Google.Firebase.firebase_analytics_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_appcheck
        get() = Google.Firebase.firebase_appcheck.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_appcheck(version: String): String =
        Google.Firebase.firebase_appcheck.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_appcheck_debug
        get() = Google.Firebase.firebase_appcheck_debug.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_appcheck_debug(version: String): String =
        Google.Firebase.firebase_appcheck_debug.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_appcheck_debug_testing
        get() = Google.Firebase.firebase_appcheck_debug_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_appcheck_debug_testing(version: String): String =
        Google.Firebase.firebase_appcheck_debug_testing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_appcheck_ktx
        get() = Google.Firebase.firebase_appcheck_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_appcheck_ktx(version: String): String =
        Google.Firebase.firebase_appcheck_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_appcheck_playintegrity
        get() = Google.Firebase.firebase_appcheck_playintegrity.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_appcheck_playintegrity(version: String): String =
        Google.Firebase.firebase_appcheck_playintegrity.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_auth
        get() = Google.Firebase.firebase_auth.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_auth(version: String): String =
        Google.Firebase.firebase_auth.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_auth_ktx
        get() = Google.Firebase.firebase_auth_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_auth_ktx(version: String): String =
        Google.Firebase.firebase_auth_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_common
        get() = Google.Firebase.firebase_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_common(version: String): String =
        Google.Firebase.firebase_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_common_ktx
        get() = Google.Firebase.firebase_common_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_common_ktx(version: String): String =
        Google.Firebase.firebase_common_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_config
        get() = Google.Firebase.firebase_config.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_config(version: String): String =
        Google.Firebase.firebase_config.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_config_ktx
        get() = Google.Firebase.firebase_config_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_config_ktx(version: String): String =
        Google.Firebase.firebase_config_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_crashlytics
        get() = Google.Firebase.firebase_crashlytics.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_crashlytics(version: String): String =
        Google.Firebase.firebase_crashlytics.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_crashlytics_ktx
        get() = Google.Firebase.firebase_crashlytics_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_crashlytics_ktx(version: String): String =
        Google.Firebase.firebase_crashlytics_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_crashlytics_ndk
        get() = Google.Firebase.firebase_crashlytics_ndk.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_crashlytics_ndk(version: String): String =
        Google.Firebase.firebase_crashlytics_ndk.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_database
        get() = Google.Firebase.firebase_database.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_database(version: String): String =
        Google.Firebase.firebase_database.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_database_collection
        get() = Google.Firebase.firebase_database_collection.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_database_collection(version: String): String =
        Google.Firebase.firebase_database_collection.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_database_ktx
        get() = Google.Firebase.firebase_database_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_database_ktx(version: String): String =
        Google.Firebase.firebase_database_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_dynamic_links
        get() = Google.Firebase.firebase_dynamic_links.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_dynamic_links(version: String): String =
        Google.Firebase.firebase_dynamic_links.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_dynamic_links_ktx
        get() = Google.Firebase.firebase_dynamic_links_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_dynamic_links_ktx(version: String): String =
        Google.Firebase.firebase_dynamic_links_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_encoders
        get() = Google.Firebase.firebase_encoders.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_encoders(version: String): String =
        Google.Firebase.firebase_encoders.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_firestore
        get() = Google.Firebase.firebase_firestore.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_firestore(version: String): String =
        Google.Firebase.firebase_firestore.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_firestore_ktx
        get() = Google.Firebase.firebase_firestore_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_firestore_ktx(version: String): String =
        Google.Firebase.firebase_firestore_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_functions
        get() = Google.Firebase.firebase_functions.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_functions(version: String): String =
        Google.Firebase.firebase_functions.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_functions_ktx
        get() = Google.Firebase.firebase_functions_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_functions_ktx(version: String): String =
        Google.Firebase.firebase_functions_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_inappmessaging
        get() = Google.Firebase.firebase_inappmessaging.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_inappmessaging(version: String): String =
        Google.Firebase.firebase_inappmessaging.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_inappmessaging_display
        get() = Google.Firebase.firebase_inappmessaging_display.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_inappmessaging_display(version: String): String =
        Google.Firebase.firebase_inappmessaging_display.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_inappmessaging_display_ktx
        get() = Google.Firebase.firebase_inappmessaging_display_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_inappmessaging_display_ktx(version: String): String =
        Google.Firebase.firebase_inappmessaging_display_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_inappmessaging_ktx
        get() = Google.Firebase.firebase_inappmessaging_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_inappmessaging_ktx(version: String): String =
        Google.Firebase.firebase_inappmessaging_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_installations
        get() = Google.Firebase.firebase_installations.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_installations(version: String): String =
        Google.Firebase.firebase_installations.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_installations_ktx
        get() = Google.Firebase.firebase_installations_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_installations_ktx(version: String): String =
        Google.Firebase.firebase_installations_ktx.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_messaging
        get() = Google.Firebase.firebase_messaging.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_messaging(version: String): String =
        Google.Firebase.firebase_messaging.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_messaging_directboot
        get() = Google.Firebase.firebase_messaging_directboot.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_messaging_directboot(version: String): String =
        Google.Firebase.firebase_messaging_directboot.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_messaging_ktx
        get() = Google.Firebase.firebase_messaging_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_messaging_ktx(version: String): String =
        Google.Firebase.firebase_messaging_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_ml_modeldownloader
        get() = Google.Firebase.firebase_ml_modeldownloader.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_ml_modeldownloader(version: String): String =
        Google.Firebase.firebase_ml_modeldownloader.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_ml_modeldownloader_ktx
        get() = Google.Firebase.firebase_ml_modeldownloader_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_ml_modeldownloader_ktx(version: String): String =
        Google.Firebase.firebase_ml_modeldownloader_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.firebase_perf
        get() = Google.Firebase.firebase_perf.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_perf(version: String): String =
        Google.Firebase.firebase_perf.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_perf_ktx
        get() = Google.Firebase.firebase_perf_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_perf_ktx(version: String): String =
        Google.Firebase.firebase_perf_ktx.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_storage
        get() = Google.Firebase.firebase_storage.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_storage(version: String): String =
        Google.Firebase.firebase_storage.dependencyAsString(version)


    @ExperimentalEpitApi
    val Epit.firebase_storage_ktx
        get() = Google.Firebase.firebase_storage_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.firebase_storage_ktx(version: String): String =
        Google.Firebase.firebase_storage_ktx.dependencyAsString(version)

    /* Internal functions */

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsString)

    @ExperimentalEpitApi
    val bomAsString = Google.Firebase.firebase_bom.moduleName joinWithColon firebaseBOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsString(customVersion))

    @ExperimentalEpitApi
    fun bomAsString(customVersion: String) = Google.Firebase.firebase_bom.moduleName joinWithColon customVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    val Google.Firebase.dependencyAsString
        get() = moduleName

    @InternalEpitApi
    @ExperimentalEpitApi
    fun Google.Firebase.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(firebase: Google.Firebase) {
        add("implementation", firebase.moduleName)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
