package epit.dsl.androidx

object EpitAndroidxGeneralCoreScope {

    fun EpitAndroidxGeneralCoreScope.core(androidxCoreVersion: String, block: EpitAndroidXCoreScope.() -> Unit) {
        block(EpitAndroidXCoreScope(androidxCoreVersion))
    }

    fun EpitAndroidxGeneralCoreScope.coreSplashscreen(
        androidxCoreSplashscreenVersion: String,
        block: EpitAndroidXCoreSpashscreenScope.() -> Unit
    ) {
        block(EpitAndroidXCoreSpashscreenScope(androidxCoreSplashscreenVersion))
    }

}
