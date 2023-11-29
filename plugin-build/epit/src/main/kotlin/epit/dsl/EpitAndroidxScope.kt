package epit.dsl

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.dsl.androidx.*
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidxScope(
    internal val dependencyHandlerScope: DependencyHandlerScope
) {

    @ExperimentalEpitApi
    fun activity(activityVersion: String, block: EpitAndroidXActivityScope.() -> Unit) {
        block(EpitAndroidXActivityScope(activityVersion))
    }

    @ExperimentalEpitApi
    fun appcompat(appcompatVersion: String, block: EpitAndroidXAppCompatScope.() -> Unit) {
        block(EpitAndroidXAppCompatScope(appcompatVersion))
    }

    @ExperimentalEpitApi
    fun camera(cameraVersion: String, block: EpitAndroidXCameraScope.() -> Unit) {
        block(EpitAndroidXCameraScope(cameraVersion))
    }

    @ExperimentalEpitApi
    fun compose(
        bomVersion: String,
        block: EpitAndroidXComposeBomScope.() -> Unit
    ) {
        val composeScope = EpitAndroidXComposeBomScope(bomVersion)
        with(this.dependencyHandlerScope) {
            add("implementation", platform(composeScope.bom))
        }
        block(composeScope)
    }

    @ExperimentalEpitApi
    fun composeAnimation(
        composeAnimationVersion: String,
        block: EpitAndroidXComposeAnimationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeAnimationScope(composeAnimationVersion))
    }

    @ExperimentalEpitApi
    fun composeCompiler(
        composeCompilerVersion: String,
        block: EpitAndroidXComposeCompilerScope.() -> Unit
    ) {
        block(EpitAndroidXComposeCompilerScope(composeCompilerVersion))
    }

    @ExperimentalEpitApi
    fun composeFoundation(
        composeFoundationVersion: String,
        block: EpitAndroidXComposeFoundationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationScope(composeFoundationVersion))
    }

    @ExperimentalEpitApi
    fun composeFoundationText(
        composeFoundationTextVersion: String,
        block: EpitAndroidXComposeFoundationTextScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationTextScope(composeFoundationTextVersion))
    }

    @ExperimentalEpitApi
    fun composeMaterial(
        composeMaterialVersion: String,
        block: EpitAndroidXComposeMaterialScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterialScope(composeMaterialVersion))
    }

    @ExperimentalEpitApi
    fun composeMaterial3(
        composeMaterial3Version: String,
        block: EpitAndroidXComposeMaterial3Scope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3Scope(composeMaterial3Version))
    }

    @ExperimentalEpitApi
    fun composeMaterial3Adaptive(
        composeMaterial3AdaptiveVersion: String,
        block: EpitAndroidXComposeMaterial3AdaptiveScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3AdaptiveScope(composeMaterial3AdaptiveVersion))
    }

    @ExperimentalEpitApi
    fun composeRuntime(
        composeRuntimeVersion: String,
        block: EpitAndroidXComposeRuntimeScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeScope(composeRuntimeVersion))
    }

    @ExperimentalEpitApi
    fun composeRuntimeTracing(
        composeRuntimeTracingVersion: String,
        block: EpitAndroidXComposeRuntimeTracingScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeTracingScope(composeRuntimeTracingVersion))
    }

    @ExperimentalEpitApi
    fun composeUI(composeUIVersion: String, block: EpitAndroidXComposeUIScope.() -> Unit) {
        block(EpitAndroidXComposeUIScope(composeUIVersion))
    }

    @ExperimentalEpitApi
    fun constraintLayout(block: EpitAndroidxGeneralConstraintLayoutScope.() -> Unit) {
        block(EpitAndroidxGeneralConstraintLayoutScope)
    }

    @ExperimentalEpitApi
    fun core(block: EpitAndroidxGeneralCoreScope.() -> Unit) {
        block(EpitAndroidxGeneralCoreScope)
    }

    @ExperimentalEpitApi
    fun fragment(fragmentVersion: String, block: EpitAndroidXFragmentScope.() -> Unit) {
        block(EpitAndroidXFragmentScope(fragmentVersion))
    }

    @ExperimentalEpitApi
    fun lifecycle(lifecycleVersion: String, block: EpitAndroidXLifecycleScope.() -> Unit) {
        block(EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    @ExperimentalEpitApi
    fun navigation(navigationVersion: String, block: EpitAndroidXNavigationScope.() -> Unit) {
        block(EpitAndroidXNavigationScope(navigationVersion))
    }

    @ExperimentalEpitApi
    fun paging(pagingVersion: String, block: EpitAndroidXPagingScope.() -> Unit) {
        block(EpitAndroidXPagingScope(pagingVersion))
    }

    @ExperimentalEpitApi
    fun recyclerview(recyclerviewVersion: String, block: EpitAndroidXRecyclerViewScope.() -> Unit) {
        block(EpitAndroidXRecyclerViewScope(recyclerviewVersion))
    }

    @ExperimentalEpitApi
    fun room(roomVersion: String, block: EpitAndroidXRoomScope.() -> Unit) {
        block(EpitAndroidXRoomScope(roomVersion))
    }

    @ExperimentalEpitApi
    fun test(block: EpitAndroidxGeneralTestScope.() -> Unit) {
        block(EpitAndroidxGeneralTestScope)
    }

    @ExperimentalEpitApi
    fun testEspresso(espressoVersion: String, block: EpitAndroidXTestEspressoScope.() -> Unit) {
        block(EpitAndroidXTestEspressoScope(espressoVersion))
    }

    @ExperimentalEpitApi
    fun testEspressoDevice(espressoDeviceVersion: String, block: EpitAndroidXTestEspressoDeviceScope.() -> Unit) {
        block(EpitAndroidXTestEspressoDeviceScope(espressoDeviceVersion))
    }

    @ExperimentalEpitApi
    fun testEspressoIdling(espressoIdlingVersion: String, block: EpitAndroidXTestEspressoIdlingScope.() -> Unit) {
        block(EpitAndroidXTestEspressoIdlingScope(espressoIdlingVersion))
    }

    @ExperimentalEpitApi
    fun testExt(block: EpitAndroidxGeneralTestExtScope.() -> Unit) {
        block(EpitAndroidxGeneralTestExtScope)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}