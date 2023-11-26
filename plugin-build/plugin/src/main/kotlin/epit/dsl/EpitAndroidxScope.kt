package epit.dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.*

object EpitAndroidxScope {

    fun EpitAndroidxScope.activity(activityVersion: String, block: EpitAndroidXActivityScope.() -> Unit) {
        block(EpitAndroidXActivityScope(activityVersion))
    }

    fun EpitAndroidxScope.appcompat(appcompatVersion: String, block: EpitAndroidXAppCompatScope.() -> Unit) {
        block(EpitAndroidXAppCompatScope(appcompatVersion))
    }

    fun EpitAndroidxScope.camera(cameraVersion: String, block: EpitAndroidXCameraScope.() -> Unit) {
        block(EpitAndroidXCameraScope(cameraVersion))
    }

    fun EpitAndroidxScope.composeAnimation(
        composeAnimationVersion: String,
        block: EpitAndroidXComposeAnimationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeAnimationScope(composeAnimationVersion))
    }

    fun EpitAndroidxScope.composeCompiler(
        composeCompilerVersion: String,
        block: EpitAndroidXComposeCompilerScope.() -> Unit
    ) {
        block(EpitAndroidXComposeCompilerScope(composeCompilerVersion))
    }

    fun EpitAndroidxScope.composeFoundation(
        composeFoundationVersion: String,
        block: EpitAndroidXComposeFoundationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationScope(composeFoundationVersion))
    }

    fun EpitAndroidxScope.composeMaterial(
        composeMaterialVersion: String,
        block: EpitAndroidXComposeMaterialScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterialScope(composeMaterialVersion))
    }

    fun EpitAndroidxScope.composeMaterial3(
        composeMaterial3Version: String,
        block: EpitAndroidXComposeMaterial3Scope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3Scope(composeMaterial3Version))
    }

    fun EpitAndroidxScope.composeRuntime(
        composeRuntimeVersion: String,
        block: EpitAndroidXComposeRuntimeScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeScope(composeRuntimeVersion))
    }

    fun EpitAndroidxScope.composeUI(composeUIVersion: String, block: EpitAndroidXComposeUIScope.() -> Unit) {
        block(EpitAndroidXComposeUIScope(composeUIVersion))
    }

    fun EpitAndroidxScope.constraintLayout(block: EpitAndroidxGeneralConstraintLayoutScope.() -> Unit) {
        block(EpitAndroidxGeneralConstraintLayoutScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.core(block: EpitAndroidxGeneralCoreScope.() -> Unit) {
        block(EpitAndroidxGeneralCoreScope)
    }

    fun EpitAndroidxScope.fragment(fragmentVersion: String, block: EpitAndroidXFragmentScope.() -> Unit) {
        block(EpitAndroidXFragmentScope(fragmentVersion))
    }

    fun EpitAndroidxScope.lifecycle(lifecycleVersion: String, block: EpitAndroidXLifecycleScope.() -> Unit) {
        block(EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    fun EpitAndroidxScope.navigation(navigationVersion: String, block: EpitAndroidXNavigationScope.() -> Unit) {
        block(EpitAndroidXNavigationScope(navigationVersion))
    }

    fun EpitAndroidxScope.paging(pagingVersion: String, block: EpitAndroidXPagingScope.() -> Unit) {
        block(EpitAndroidXPagingScope(pagingVersion))
    }

    fun EpitAndroidxScope.recyclerview(recyclerviewVersion: String, block: EpitAndroidXRecyclerViewScope.() -> Unit) {
        block(EpitAndroidXRecyclerViewScope(recyclerviewVersion))
    }

    fun EpitAndroidxScope.room(roomVersion: String, block: EpitAndroidXRoomScope.() -> Unit) {
        block(EpitAndroidXRoomScope(roomVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.test(block: EpitAndroidxGeneralTestScope.() -> Unit) {
        block(EpitAndroidxGeneralTestScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.testEspresso(espressoVersion: String, block: EpitAndroidXTestEspressoScope.() -> Unit) {
        block(EpitAndroidXTestEspressoScope(espressoVersion))
    }

}
