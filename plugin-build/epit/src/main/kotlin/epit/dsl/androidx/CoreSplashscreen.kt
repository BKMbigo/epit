package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class CoreSplashscreen(
    internal val moduleName: String
) : AndroidXDependency {
    //    object core: Core(moduleName = "androidx.core:core")
//    object core_animation: Core(moduleName = "androidx.core:core-animation")
//    object core_animation_testing: Core(moduleName = "androidx.core:core-animation-testing")
//    object core_google_shortcuts: Core(moduleName = "androidx.core:core-google-shortcuts")
//    object core_i18n: Core(moduleName = "androidx.core:core-i18n")
//    object core_ktx: Core(moduleName = "androidx.core:core-ktx")
//    object core_location_altitude: Core(moduleName = "androidx.core:core-location-altitude")
//    object core_performance: Core(moduleName = "androidx.core:core-performance")
//    object core_performance_play_services: Core(moduleName = "androidx.core:core-performance-play-services")
//    object core_performance_testing: Core(moduleName = "androidx.core:core-performance-testing")
//    object core_remoteviews: Core(moduleName = "androidx.core:core-remoteviews")
//    object core_role: Core(moduleName = "androidx.core:core-role")
    core_splashscreen(moduleName = "androidx.core:core-splashscreen")
//    object core_telecom: Core(moduleName = "androidx.core:core-telecom")
//    object core_testing: Core(moduleName = "androidx.core:core-testing")
}

@ExperimentalEpitApi
class EpitAndroidXCoreSpashscreenScope(
    private val androidXCoreVersion: String
) {
    @ExperimentalEpitApi
    val CoreSplashscreen.dependency
        get(): String = "${this.moduleName}:${androidXCoreVersion}"

    @ExperimentalEpitApi
    fun CoreSplashscreen.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreSplashscreen: CoreSplashscreen) {
        add("implementation", coreSplashscreen.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
