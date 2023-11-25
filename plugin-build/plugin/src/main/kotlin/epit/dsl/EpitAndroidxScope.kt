package epit.dsl

object EpitAndroidxScope {

    fun activity(activityVersion: String, block: epit.dsl.androidx.EpitAndroidXActivityScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXActivityScope(activityVersion))
    }

    fun appcompat(appcompatVersion: String, block: epit.dsl.androidx.EpitAndroidXAppCompatScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXAppCompatScope(appcompatVersion))
    }

    fun camera(cameraVersion: String, block: epit.dsl.androidx.EpitAndroidXCameraScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXCameraScope(cameraVersion))
    }

    fun composeAnimation(composeAnimationVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeAnimationScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeAnimationScope(composeAnimationVersion))
    }

    fun composeCompiler(composeCompilerVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeCompilerScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeCompilerScope(composeCompilerVersion))
    }

    fun composeFoundation(composeFoundationVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeFoundationScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeFoundationScope(composeFoundationVersion))
    }

    fun composeMaterial(composeMaterialVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeMaterialScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeMaterialScope(composeMaterialVersion))
    }

    fun composeMaterial3(composeMaterial3Version: String, block: epit.dsl.androidx.EpitAndroidXComposeMaterial3Scope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeMaterial3Scope(composeMaterial3Version))
    }

    fun composeRuntime(composeRuntimeVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeRuntimeScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeRuntimeScope(composeRuntimeVersion))
    }

    fun composeUI(composeUIVersion: String, block: epit.dsl.androidx.EpitAndroidXComposeUIScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXComposeUIScope(composeUIVersion))
    }

    fun constraintlayout(constraintLayoutVersion: String, block: epit.dsl.androidx.EpitAndroidXConstraintLayoutScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXConstraintLayoutScope(constraintLayoutVersion))
    }

    fun core(androidxCoreVersion: String, block: epit.dsl.androidx.EpitAndroidXCoreScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXCoreScope(androidxCoreVersion))
    }

    fun fragment(fragmentVersion: String, block: epit.dsl.androidx.EpitAndroidXFragmentScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXFragmentScope(fragmentVersion))
    }

    fun lifecycle(lifecycleVersion: String, block: epit.dsl.androidx.EpitAndroidXLifecycleScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    fun navigation(navigationVersion: String, block: epit.dsl.androidx.EpitAndroidXNavigationScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXNavigationScope(navigationVersion))
    }
    fun recyclerview(recyclerviewVersion: String, block: epit.dsl.androidx.EpitAndroidXRecyclerViewScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXRecyclerViewScope(recyclerviewVersion))
    }

    fun room(roomVersion: String, block: epit.dsl.androidx.EpitAndroidXRoomScope.() -> Unit) {
        block(epit.dsl.androidx.EpitAndroidXRoomScope(roomVersion))
    }
}
