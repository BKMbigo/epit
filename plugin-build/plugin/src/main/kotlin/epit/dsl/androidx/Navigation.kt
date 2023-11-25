package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

sealed class Navigation(
    internal val moduleName: String
): epit.dsl.androidx.AndroidXDependencies {
    object navigation_common: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-common")
    object navigation_common_ktx: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-common-ktx")
    object navigation_compose: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-compose")
    object navigation_dynamic_features_fragment: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-dynamic-features-fragment")
    object navigation_dynamic_features_runtime: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-dynamic-features-runtime")
    object navigation_fragment: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-fragment")
    object navigation_fragment_ktx: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-fragment-ktx")
    object navigation_runtime: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-runtime")
    object navigation_runtime_ktx: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-runtime-ktx")
    object navigation_runtime_safe_args_generator: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-safe-args-generator")
    object navigation_runtime_safe_args_gradle_plugin: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-safe-args-gradle-plugin")
    object navigation_runtime_testing: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-testing")
    object navigation_runtime_ui: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-ui")
    object navigation_runtime_ui_ktx: epit.dsl.androidx.Navigation(moduleName = "androidx.navigation:navigation-ui-ktx")
}

class EpitAndroidXNavigationScope(
    private val androidXNavigationVersion: String
) {
    val epit.dsl.androidx.Navigation.dependency
        get(): String = "${this.moduleName}:${androidXNavigationVersion}"

    fun DependencyHandlerScope.implementation(navigation: epit.dsl.androidx.Navigation) {
        add("implementation", navigation.dependency)
    }
}
