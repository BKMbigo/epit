package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
object EpitAndroidxGeneralCoreScope {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.core(androidxCoreVersion: String, block: EpitAndroidXCoreScope.() -> Unit) {
        block(EpitAndroidXCoreScope(androidxCoreVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreAnimation(androidxCoreAnimationVersion: String, block: EpitAndroidXCoreAnimationScope.() -> Unit) {
        block(EpitAndroidXCoreAnimationScope(androidxCoreAnimationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreGoogleShortcuts(androidxCoreGoogleShortcutsVersion: String, block: EpitAndroidXCoreGoogleShortcutsScope.() -> Unit) {
        block(EpitAndroidXCoreGoogleShortcutsScope(androidxCoreGoogleShortcutsVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreLocation(androidxCoreLocationVersion: String, block: EpitAndroidXCoreLocationScope.() -> Unit) {
        block(EpitAndroidXCoreLocationScope(androidxCoreLocationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.corePerformance(androidxCorePerformanceVersion: String, block: EpitAndroidXCorePerformanceScope.() -> Unit) {
        block(EpitAndroidXCorePerformanceScope(androidxCorePerformanceVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreRemoteViews(androidxCoreRemoteViewsVersion: String, block: EpitAndroidXCoreRemoteViewsScope.() -> Unit) {
        block(EpitAndroidXCoreRemoteViewsScope(androidxCoreRemoteViewsVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreRole(androidxCoreRoleVersion: String, block: EpitAndroidXCoreRoleScope.() -> Unit) {
        block(EpitAndroidXCoreRoleScope(androidxCoreRoleVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreSplashscreen(
        androidxCoreSplashscreenVersion: String,
        block: EpitAndroidXCoreSpashscreenScope.() -> Unit
    ) {
        block(EpitAndroidXCoreSpashscreenScope(androidxCoreSplashscreenVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralCoreScope.coreTelecom(
        androidxCoreTelecomVersion: String,
        block: EpitAndroidXCoreTelecomScope.() -> Unit
    ) {
        block(EpitAndroidXCoreTelecomScope(androidxCoreTelecomVersion))
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
