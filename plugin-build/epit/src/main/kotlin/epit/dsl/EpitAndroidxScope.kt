package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.*
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
object EpitAndroidxScope {

    @ExperimentalEpitApi
    fun EpitAndroidxScope.activity(activityVersion: String, block: EpitAndroidXActivityScope.() -> Unit) {
        block(EpitAndroidXActivityScope(activityVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.appcompat(appcompatVersion: String, block: EpitAndroidXAppCompatScope.() -> Unit) {
        block(EpitAndroidXAppCompatScope(appcompatVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.camera(cameraVersion: String, block: EpitAndroidXCameraScope.() -> Unit) {
        block(EpitAndroidXCameraScope(cameraVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeAnimation(
        composeAnimationVersion: String,
        block: EpitAndroidXComposeAnimationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeAnimationScope(composeAnimationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeCompiler(
        composeCompilerVersion: String,
        block: EpitAndroidXComposeCompilerScope.() -> Unit
    ) {
        block(EpitAndroidXComposeCompilerScope(composeCompilerVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeFoundation(
        composeFoundationVersion: String,
        block: EpitAndroidXComposeFoundationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeFoundationScope(composeFoundationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeMaterial(
        composeMaterialVersion: String,
        block: EpitAndroidXComposeMaterialScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterialScope(composeMaterialVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeMaterial3(
        composeMaterial3Version: String,
        block: EpitAndroidXComposeMaterial3Scope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterial3Scope(composeMaterial3Version))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeRuntime(
        composeRuntimeVersion: String,
        block: EpitAndroidXComposeRuntimeScope.() -> Unit
    ) {
        block(EpitAndroidXComposeRuntimeScope(composeRuntimeVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.composeUI(composeUIVersion: String, block: EpitAndroidXComposeUIScope.() -> Unit) {
        block(EpitAndroidXComposeUIScope(composeUIVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.constraintLayout(block: EpitAndroidxGeneralConstraintLayoutScope.() -> Unit) {
        block(EpitAndroidxGeneralConstraintLayoutScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.core(block: EpitAndroidxGeneralCoreScope.() -> Unit) {
        block(EpitAndroidxGeneralCoreScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.fragment(fragmentVersion: String, block: EpitAndroidXFragmentScope.() -> Unit) {
        block(EpitAndroidXFragmentScope(fragmentVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.lifecycle(lifecycleVersion: String, block: EpitAndroidXLifecycleScope.() -> Unit) {
        block(EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.navigation(navigationVersion: String, block: EpitAndroidXNavigationScope.() -> Unit) {
        block(EpitAndroidXNavigationScope(navigationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.paging(pagingVersion: String, block: EpitAndroidXPagingScope.() -> Unit) {
        block(EpitAndroidXPagingScope(pagingVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxScope.recyclerview(recyclerviewVersion: String, block: EpitAndroidXRecyclerViewScope.() -> Unit) {
        block(EpitAndroidXRecyclerViewScope(recyclerviewVersion))
    }

    @ExperimentalEpitApi
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

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
