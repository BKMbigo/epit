package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

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

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
