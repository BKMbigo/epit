package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

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

class EpitAndroidXNavigationScope(
    private val androidXNavigationVersion: String
) {
    val Navigation.dependency
        get(): String = "${this.moduleName}:${androidXNavigationVersion}"

    fun Navigation.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(navigation: Navigation) {
        add("implementation", navigation.dependency)
    }
}
