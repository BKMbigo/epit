package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Core(
    internal val moduleName: String
) : AndroidXDependency {
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

@ExperimentalEpitApi
class EpitAndroidXCoreScope(
    private val androidXCoreVersion: String
) {
    @ExperimentalEpitApi
    val Core.dependency
        get(): String = "${this.moduleName}:${androidXCoreVersion}"

    @ExperimentalEpitApi
    fun Core.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(core: Core) {
        add("implementation", core.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
