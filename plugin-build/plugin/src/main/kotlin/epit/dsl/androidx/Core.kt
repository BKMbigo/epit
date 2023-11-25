package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Core(
    internal val moduleName: String
): AndroidXDependencies {
    core(moduleName = "androidx.core:core"),

    //    core_animation(moduleName = "androidx.core:core-animation")
//    core_animation_testing(moduleName = "androidx.core:core-animation-testing")
//    core_google_shortcuts(moduleName = "androidx.core:core-google-shortcuts")
//    core_i18n(moduleName = "androidx.core:core-i18n")
    core_ktx(moduleName = "androidx.core:core-ktx"),

    //    core_location_altitude(moduleName = "androidx.core:core-location-altitude")
//    core_performance(moduleName = "androidx.core:core-performance")
//    core_performance_play_services(moduleName = "androidx.core:core-performance-play-services")
//    core_performance_testing(moduleName = "androidx.core:core-performance-testing")
//    core_remoteviews(moduleName = "androidx.core:core-remoteviews")
//    core_role(moduleName = "androidx.core:core-role")
//    core_splashscreen(moduleName = "androidx.core:core-splashscreen")
//    core_telecom(moduleName = "androidx.core:core-telecom")
    core_testing(moduleName = "androidx.core:core-testing")
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
