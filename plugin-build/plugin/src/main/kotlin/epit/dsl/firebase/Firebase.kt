package epit.dsl.firebase

import epit.EpitDependency

enum class Firebase(
    internal val moduleName: String
): EpitDependency {
    //    crash_plugin(moduleName = "com.google.firebase:firebase-crash"),
//    firebase_abt(moduleName = "com.google.firebase:firebase-abt"),
//    firebase_ads(moduleName = "com.google.firebase:firebase-ads"),
//    firebase_ads_lite(moduleName = "com.google.firebase:firebase-ads-lite"),
    firebase_analytics(moduleName = "com.google.firebase:firebase-analytics"),

    //    firebase_analytics_impl(moduleName = "com.google.firebase:firebase-analytics-impl"),
//    firebase_analytics_impl_license(moduleName = "com.google.firebase:firebase-analytics-impl-license"),
    firebase_analytics_ktx(moduleName = "com.google.firebase:firebase-analytics-ktx"),

    //    firebase_analytics_license(moduleName = "com.google.firebase:firebase-analytics-license"),
//    firebase_annotations(moduleName = "com.google.firebase:firebase-annotations"),
    firebase_appcheck(moduleName = "com.google.firebase:firebase-appcheck"),
    firebase_appcheck_debug(moduleName = "com.google.firebase:firebase-appcheck-debug"),
    firebase_appcheck_debug_testing(moduleName = "com.google.firebase:firebase-appcheck-debug-testing"),

    //    firebase_appcheck_interop(moduleName = "com.google.firebase:firebase-appcheck-interop"),
    firebase_appcheck_ktx(moduleName = "com.google.firebase:firebase-appcheck-ktx"),
    firebase_appcheck_playintegrity(moduleName = "com.google.firebase:firebase-appcheck-playintegrity"),

    //    firebase_appcheck_safetynet(moduleName = "com.google.firebase:firebase-appcheck-safetynet"),
//    firebase_appdistribution(moduleName = "com.google.firebase:firebase-appdistribution"),
//    firebase_appdistribution_api(moduleName = "com.google.firebase:firebase-appdistribution-api"),
//    firebase_appdistribution_api_ktx(moduleName = "com.google.firebase:firebase-appdistribution-api-ktx"),
//    firebase_appdistribution_gradle(moduleName = "com.google.firebase:firebase-appdistribution-gradle"),
//    firebase_appdistribution_ktx(moduleName = "com.google.firebase:firebase-appdistribution-ktx"),
//    firebase_appindexing(moduleName = "com.google.firebase:firebase-appindexing"),
//    firebase_appindexing_license(moduleName = "com.google.firebase:firebase-appindexing-license"),
    firebase_auth(moduleName = "com.google.firebase:firebase-auth"),

    //    firebase_auth_common(moduleName = "com.google.firebase:firebase-auth-common"),
//    firebase_auth_impl(moduleName = "com.google.firebase:firebase-auth-impl"),
//    firebase_auth_interop(moduleName = "com.google.firebase:firebase-auth-interop"),
    firebase_auth_ktx(moduleName = "com.google.firebase:firebase-auth-ktx"),

    //    firebase_auth_license(moduleName = "com.google.firebase:firebase-auth-license"),
//    firebase_auth_module(moduleName = "com.google.firebase:firebase-auth-module"),
    firebase_bom(moduleName = "com.google.firebase:firebase-bom"),
    firebase_common(moduleName = "com.google.firebase:firebase-common"),
    firebase_common_ktx(moduleName = "com.google.firebase:firebase-common-ktx"),

    //    firebase_common_license(moduleName = "com.google.firebase:firebase-common-license"),
//    firebase_components(moduleName = "com.google.firebase:firebase-components"),
    firebase_config(moduleName = "com.google.firebase:firebase-config"),

    //    firebase_config_interop(moduleName = "com.google.firebase:firebase-config-interop"),
    firebase_config_ktx(moduleName = "com.google.firebase:firebase-config-ktx"),

    //    firebase_config_license(moduleName = "com.google.firebase:firebase-config-license"),
//    firebase_core(moduleName = "com.google.firebase:firebase-core"),
//    firebase_crash(moduleName = "com.google.firebase:firebase-crash"),
//    firebase_crash_license(moduleName = "com.google.firebase:firebase-crash-license"),
    firebase_crashlytics(moduleName = "com.google.firebase:firebase-crashlytics"),

    //    firebase_crashlytics_buildtools(moduleName = "com.google.firebase:firebase-crashlytics-buildtools"),
//    firebase_crashlytics_gradle(moduleName = "com.google.firebase:firebase-crashlytics-gradle"),
    firebase_crashlytics_ktx(moduleName = "com.google.firebase:firebase-crashlytics-ktx"),
    firebase_crashlytics_ndk(moduleName = "com.google.firebase:firebase-crashlytics-ndk"),
    firebase_database(moduleName = "com.google.firebase:firebase-database"),
    firebase_database_collection(moduleName = "com.google.firebase:firebase-database-collection"),

    //    firebase_database_connection(moduleName = "com.google.firebase:firebase-database-connection"),
//    firebase_database_connection_license(moduleName = "com.google.firebase:firebase-database-connection-license"),
    firebase_database_ktx(moduleName = "com.google.firebase:firebase-database-ktx"),

    //    firebase_database_license(moduleName = "com.google.firebase:firebase-database-license"),
//    firebase_datatransport(moduleName = "com.google.firebase:firebase-datatransport"),
    firebase_dynamic_links(moduleName = "com.google.firebase:firebase-dynamic-links"),
    firebase_dynamic_links_ktx(moduleName = "com.google.firebase:firebase-dynamic-links-ktx"),

    //    firebase_dynamic_links_license(moduleName = "com.google.firebase:firebase-dynamic-links-license"),
//    firebase_dynamic_module_support(moduleName = "com.google.firebase:firebase-dynamic-module-support"),
    firebase_encoders(moduleName = "com.google.firebase:firebase-encoders"),

    //    firebase_encoders_json(moduleName = "com.google.firebase:firebase-encoders-json"),
//    firebase_encoders_proto(moduleName = "com.google.firebase:firebase-encoders-proto"),
    firebase_firestore(moduleName = "com.google.firebase:firebase-firestore"),
    firebase_firestore_ktx(moduleName = "com.google.firebase:firebase-firestore-ktx"),
    firebase_functions(moduleName = "com.google.firebase:firebase-functions"),
    firebase_functions_ktx(moduleName = "com.google.firebase:firebase-functions-ktx"),

    //    firebase_functions_license(moduleName = "com.google.firebase:firebase-functions-license"),
//    firebase_iid(moduleName = "com.google.firebase:firebase-iid"),
//    firebase_iid_interop(moduleName = "com.google.firebase:firebase-iid-interop"),
//    firebase_iid_license(moduleName = "com.google.firebase:firebase-iid-license"),
    firebase_inappmessaging(moduleName = "com.google.firebase:firebase-inappmessaging"),
    firebase_inappmessaging_display(moduleName = "com.google.firebase:firebase-inappmessaging-display"),
    firebase_inappmessaging_display_ktx(moduleName = "com.google.firebase:firebase-inappmessaging-display-ktx"),
    firebase_inappmessaging_ktx(moduleName = "com.google.firebase:firebase-inappmessaging-ktx"),
    firebase_installations(moduleName = "com.google.firebase:firebase-installations"),

    //    firebase_installations_interop(moduleName = "com.google.firebase:firebase-installations-interop"),
    firebase_installations_ktx(moduleName = "com.google.firebase:firebase-installations-ktx"),

    //    firebase_invites(moduleName = "com.google.firebase:firebase-invites"),
//    firebase_measurement_connector(moduleName = "com.google.firebase:firebase-measurement-connector"),
//    firebase_measurement_connector_impl(moduleName = "com.google.firebase:firebase-measurement-connector-impl"),
    firebase_messaging(moduleName = "com.google.firebase:firebase-messaging"),
    firebase_messaging_directboot(moduleName = "com.google.firebase:firebase-messaging-directboot"),
    firebase_messaging_ktx(moduleName = "com.google.firebase:firebase-messaging-ktx"),

    //    firebase_messaging_license(moduleName = "com.google.firebase:firebase-messaging-license"),
//    firebase_ml_common(moduleName = "com.google.firebase:firebase-ml-common"),
//    firebase_ml_model_interpreter(moduleName = "com.google.firebase:firebase-ml-model-interpreter"),
    firebase_ml_modeldownloader(moduleName = "com.google.firebase:firebase-ml-modeldownloader"),
    firebase_ml_modeldownloader_ktx(moduleName = "com.google.firebase:firebase-ml-modeldownloader-ktx"),

    //    firebase_ml_natural_language(moduleName = "com.google.firebase:firebase-ml-natural-language"),
//    firebase_ml_natural_language_language_id_model(moduleName = "com.google.firebase:firebase-ml-natural-language-language-id-model"),
//    firebase_ml_natural_language_smart_reply(moduleName = "com.google.firebase:firebase-ml-natural-language-smart-reply"),
//    firebase_ml_natural_language_smart_reply_model(moduleName = "com.google.firebase:firebase-ml-natural-language-smart-reply-model"),
//    firebase_ml_natural_language_translate(moduleName = "com.google.firebase:firebase-ml-natural-language-translate"),
//    firebase_ml_natural_language_translate_model(moduleName = "com.google.firebase:firebase-ml-natural-language-translate-model"),
//    firebase_ml_vision(moduleName = "com.google.firebase:firebase-ml-vision"),
//    firebase_ml_vision_automl(moduleName = "com.google.firebase:firebase-ml-vision-automl"),
//    firebase_ml_vision_barcode_model(moduleName = "com.google.firebase:firebase-ml-vision-barcode-model"),
//    firebase_ml_vision_face_model(moduleName = "com.google.firebase:firebase-ml-vision-face-model"),
//    firebase_ml_vision_image_label_model(moduleName = "com.google.firebase:firebase-ml-vision-image-label-model"),
//    firebase_ml_vision_internal_vkp(moduleName = "com.google.firebase:firebase-ml-vision-internal-vkp"),
//    firebase_ml_vision_object_detection_model(moduleName = "com.google.firebase:firebase-ml-vision-object-detection-model"),
    firebase_perf(moduleName = "com.google.firebase:firebase-perf"),
    firebase_perf_ktx(moduleName = "com.google.firebase:firebase-perf-ktx"),

    //    firebase_perf_license(moduleName = "com.google.firebase:firebase-perf-license"),
//    firebase_plugins(moduleName = "com.google.firebase:firebase-plugins"),
//    firebase_sessions(moduleName = "com.google.firebase:firebase-sessions"),
    firebase_storage(moduleName = "com.google.firebase:firebase-storage"),

    //    firebase_storage_common(moduleName = "com.google.firebase:firebase-storage-common"),
//    firebase_storage_common_license(moduleName = "com.google.firebase:firebase-storage-common-license"),
    firebase_storage_ktx(moduleName = "com.google.firebase:firebase-storage-ktx"),
//    firebase_storage_license(moduleName = "com.google.firebase:firebase-storage-license"),
//    perf_plugin(moduleName = "com.google.firebase:perf-plugin"),
//    protolite_well_known_types(moduleName = "com.google.firebase:protolite-well-known-types"),
//    testlab_instr_lib(moduleName = "com.google.firebase:testlab-instr-lib")
}
