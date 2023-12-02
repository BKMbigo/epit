package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
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
    fun compose(block: EpitAndroidxGeneralComposeScope.() -> Unit) {
        block(EpitAndroidxGeneralComposeScope(dependencyHandlerScope))
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

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
