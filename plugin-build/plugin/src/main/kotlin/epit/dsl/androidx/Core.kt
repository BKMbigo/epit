package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

sealed class Core(
    internal val moduleName: String
): AndroidXDependencies {
    object core: Core(moduleName = "androidx.core:core")
//    object core_animation: Core(moduleName = "androidx.core:core-animation")
//    object core_animation_testing: Core(moduleName = "androidx.core:core-animation-testing")
//    object core_google_shortcuts: Core(moduleName = "androidx.core:core-google-shortcuts")
//    object core_i18n: Core(moduleName = "androidx.core:core-i18n")
    object core_ktx: Core(moduleName = "androidx.core:core-ktx")
//    object core_location_altitude: Core(moduleName = "androidx.core:core-location-altitude")
//    object core_performance: Core(moduleName = "androidx.core:core-performance")
//    object core_performance_play_services: Core(moduleName = "androidx.core:core-performance-play-services")
//    object core_performance_testing: Core(moduleName = "androidx.core:core-performance-testing")
//    object core_remoteviews: Core(moduleName = "androidx.core:core-remoteviews")
//    object core_role: Core(moduleName = "androidx.core:core-role")
//    object core_splashscreen: Core(moduleName = "androidx.core:core-splashscreen")
//    object core_telecom: Core(moduleName = "androidx.core:core-telecom")
    object core_testing: Core(moduleName = "androidx.core:core-testing")
}

class EpitAndroidXCoreScope(
    private val androidXCoreVersion: String
) {
    val Core.dependency
        get(): String = "${this.moduleName}:${androidXCoreVersion}"

    fun DependencyHandlerScope.implementation(core: Core) {
        add("implementation", core.dependency)
    }
}
