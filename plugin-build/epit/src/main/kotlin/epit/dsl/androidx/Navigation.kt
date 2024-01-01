package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXNavigationScope internal constructor(
    private val androidXNavigationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.navigation_common
        get() = AndroidX.Navigation.navigation_common.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_common(version: String) =
        AndroidX.Navigation.navigation_common.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_common_ktx
        get() = AndroidX.Navigation.navigation_common_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_common_ktx(version: String) =
        AndroidX.Navigation.navigation_common_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_compose
        get() = AndroidX.Navigation.navigation_compose.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_compose(version: String) =
        AndroidX.Navigation.navigation_compose.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_dynamic_features_fragment
        get() = AndroidX.Navigation.navigation_dynamic_features_fragment.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_dynamic_features_fragment(version: String) =
        AndroidX.Navigation.navigation_dynamic_features_fragment.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_dynamic_features_runtime
        get() = AndroidX.Navigation.navigation_dynamic_features_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_dynamic_features_runtime(version: String) =
        AndroidX.Navigation.navigation_dynamic_features_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_fragment
        get() = AndroidX.Navigation.navigation_fragment.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_fragment(version: String) =
        AndroidX.Navigation.navigation_fragment.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_fragment_ktx
        get() = AndroidX.Navigation.navigation_fragment_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_fragment_ktx(version: String) =
        AndroidX.Navigation.navigation_fragment_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime
        get() = AndroidX.Navigation.navigation_runtime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime(version: String) =
        AndroidX.Navigation.navigation_runtime.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_ktx
        get() = AndroidX.Navigation.navigation_runtime_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_ktx(version: String) =
        AndroidX.Navigation.navigation_runtime_ktx.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_safe_args_generator
        get() = AndroidX.Navigation.navigation_runtime_safe_args_generator.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_safe_args_generator(version: String) =
        AndroidX.Navigation.navigation_runtime_safe_args_generator.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_safe_args_gradle_plugin
        get() = AndroidX.Navigation.navigation_runtime_safe_args_gradle_plugin.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_safe_args_gradle_plugin(version: String) =
        AndroidX.Navigation.navigation_runtime_safe_args_gradle_plugin.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_testing
        get() = AndroidX.Navigation.navigation_runtime_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_testing(version: String) =
        AndroidX.Navigation.navigation_runtime_testing.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_ui
        get() = AndroidX.Navigation.navigation_runtime_ui.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_ui(version: String) =
        AndroidX.Navigation.navigation_runtime_ui.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.navigation_runtime_ui_ktx
        get() = AndroidX.Navigation.navigation_runtime_ui_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.navigation_runtime_ui_ktx(version: String) =
        AndroidX.Navigation.navigation_runtime_ui_ktx.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.Navigation.dependencyAsString
        get(): String = moduleName joinWithColon androidXNavigationVersion

    @ExperimentalEpitApi
    fun AndroidX.Navigation.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(navigation: AndroidX.Navigation) {
        add("implementation", navigation.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
