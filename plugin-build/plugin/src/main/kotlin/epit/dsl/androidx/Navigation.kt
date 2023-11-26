package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Navigation(
    internal val moduleName: String
) : AndroidXDependency {
    navigation_common(moduleName = "androidx.navigation:navigation-common"),
    navigation_common_ktx(moduleName = "androidx.navigation:navigation-common-ktx"),
    navigation_compose(moduleName = "androidx.navigation:navigation-compose"),
    navigation_dynamic_features_fragment(moduleName = "androidx.navigation:navigation-dynamic-features-fragment"),
    navigation_dynamic_features_runtime(moduleName = "androidx.navigation:navigation-dynamic-features-runtime"),
    navigation_fragment(moduleName = "androidx.navigation:navigation-fragment"),
    navigation_fragment_ktx(moduleName = "androidx.navigation:navigation-fragment-ktx"),
    navigation_runtime(moduleName = "androidx.navigation:navigation-runtime"),
    navigation_runtime_ktx(moduleName = "androidx.navigation:navigation-runtime-ktx"),
    navigation_runtime_safe_args_generator(moduleName = "androidx.navigation:navigation-safe-args-generator"),
    navigation_runtime_safe_args_gradle_plugin(moduleName = "androidx.navigation:navigation-safe-args-gradle-plugin"),
    navigation_runtime_testing(moduleName = "androidx.navigation:navigation-testing"),
    navigation_runtime_ui(moduleName = "androidx.navigation:navigation-ui"),
    navigation_runtime_ui_ktx(moduleName = "androidx.navigation:navigation-ui-ktx")
}

@ExperimentalEpitApi
class EpitAndroidXNavigationScope(
    private val androidXNavigationVersion: String
) {
    @ExperimentalEpitApi
    val Navigation.dependency
        get(): String = "${this.moduleName}:${androidXNavigationVersion}"

    @ExperimentalEpitApi
    fun Navigation.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(navigation: Navigation) {
        add("implementation", navigation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
