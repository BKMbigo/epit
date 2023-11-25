package epit.dsl

import epit.dsl.androidx.*

object EpitAndroidxScope {

    fun activity(activityVersion: String, block: EpitAndroidXActivityScope.() -> Unit) {
        block(EpitAndroidXActivityScope(activityVersion))
    }

    fun appcompat(appcompatVersion: String, block: EpitAndroidXAppCompatScope.() -> Unit) {
        block(EpitAndroidXAppCompatScope(appcompatVersion))
    }

    fun camera(cameraVersion: String, block: EpitAndroidXCameraScope.() -> Unit) {
        block(EpitAndroidXCameraScope(cameraVersion))
    }

    fun composeAnimation(composeAnimationVersion: String, block: EpitAndroidXComposeAnimationScope.() -> Unit) {
        block(EpitAndroidXComposeAnimationScope(composeAnimationVersion))
    }

    fun composeCompiler(composeCompilerVersion: String, block: EpitAndroidXComposeCompilerScope.() -> Unit) {
        block(EpitAndroidXComposeCompilerScope(composeCompilerVersion))
    }

    fun composeFoundation(composeFoundationVersion: String, block: EpitAndroidXComposeFoundationScope.() -> Unit) {
        block(EpitAndroidXComposeFoundationScope(composeFoundationVersion))
    }

    fun composeMaterial(composeMaterialVersion: String, block: EpitAndroidXComposeMaterialScope.() -> Unit) {
        block(EpitAndroidXComposeMaterialScope(composeMaterialVersion))
    }

    fun composeMaterial3(composeMaterial3Version: String, block: EpitAndroidXComposeMaterial3Scope.() -> Unit) {
        block(EpitAndroidXComposeMaterial3Scope(composeMaterial3Version))
    }

    fun composeRuntime(composeRuntimeVersion: String, block: EpitAndroidXComposeRuntimeScope.() -> Unit) {
        block(EpitAndroidXComposeRuntimeScope(composeRuntimeVersion))
    }

    fun composeUI(composeUIVersion: String, block: EpitAndroidXComposeUIScope.() -> Unit) {
        block(EpitAndroidXComposeUIScope(composeUIVersion))
    }

    fun constraintlayout(constraintLayoutVersion: String, block: EpitAndroidXConstraintLayoutScope.() -> Unit) {
        block(EpitAndroidXConstraintLayoutScope(constraintLayoutVersion))
    }

    fun core(androidxCoreVersion: String, block: EpitAndroidXCoreScope.() -> Unit) {
        block(EpitAndroidXCoreScope(androidxCoreVersion))
    }

    fun fragment(fragmentVersion: String, block: EpitAndroidXFragmentScope.() -> Unit) {
        block(EpitAndroidXFragmentScope(fragmentVersion))
    }

    fun lifecycle(lifecycleVersion: String, block: EpitAndroidXLifecycleScope.() -> Unit) {
        block(EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    fun navigation(navigationVersion: String, block: EpitAndroidXNavigationScope.() -> Unit) {
        block(EpitAndroidXNavigationScope(navigationVersion))
    }

    fun recyclerview(recyclerviewVersion: String, block: EpitAndroidXRecyclerViewScope.() -> Unit) {
        block(EpitAndroidXRecyclerViewScope(recyclerviewVersion))
    }

    fun room(roomVersion: String, block: EpitAndroidXRoomScope.() -> Unit) {
        block(EpitAndroidXRoomScope(roomVersion))
    }
}
