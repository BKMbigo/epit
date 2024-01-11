package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencyhandler.EpitDependencyHandler

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidxScope internal constructor(
    internal val dependencyHandler: EpitDependencyHandler
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
        block(EpitAndroidxGeneralComposeScope(dependencyHandler))
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
}
