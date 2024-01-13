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
    fun annotation(annotationVersion: String, block: EpitAndroidXAnnotationScope.() -> Unit) {
        block(EpitAndroidXAnnotationScope(annotationVersion))
    }

    @ExperimentalEpitApi
    fun appcompat(appcompatVersion: String, block: EpitAndroidXAppCompatScope.() -> Unit) {
        block(EpitAndroidXAppCompatScope(appcompatVersion))
    }

    @ExperimentalEpitApi
    fun autofill(autofillVersion: String, block: EpitAndroidXAutofillScope.() -> Unit) {
        block(EpitAndroidXAutofillScope(autofillVersion))
    }

    @ExperimentalEpitApi
    fun benchmark(benchmarkVersion: String, block: EpitAndroidXBenchmarkScope.() -> Unit) {
        block(EpitAndroidXBenchmarkScope(benchmarkVersion))
    }

    @ExperimentalEpitApi
    fun biometric(biometricVersion: String, block: EpitAndroidXBiometricScope.() -> Unit) {
        block(EpitAndroidXBiometricScope(biometricVersion))
    }

    @ExperimentalEpitApi
    fun bluetooth(bluetoothVersion: String, block: EpitAndroidXBluetoothScope.() -> Unit) {
        block(EpitAndroidXBluetoothScope(bluetoothVersion))
    }

    @ExperimentalEpitApi
    fun browser(browserVersion: String, block: EpitAndroidXBrowserScope.() -> Unit) {
        block(EpitAndroidXBrowserScope(browserVersion))
    }

    @ExperimentalEpitApi
    fun camera(cameraVersion: String, block: EpitAndroidXCameraScope.() -> Unit) {
        block(EpitAndroidXCameraScope(cameraVersion))
    }

    @ExperimentalEpitApi
    fun car(block: EpitAndroidxGeneralCarScope.() -> Unit) {
        block(EpitAndroidxGeneralCarScope)
    }

    @ExperimentalEpitApi
    fun cardview(cardViewVersion: String, block: EpitAndroidXCardViewScope.() -> Unit) {
        block(EpitAndroidXCardViewScope(cardViewVersion))
    }

    @ExperimentalEpitApi
    fun collection(collectionVersion: String, block: EpitAndroidXCollectionScope.() -> Unit) {
        block(EpitAndroidXCollectionScope(collectionVersion))
    }

    @ExperimentalEpitApi
    fun compose(block: EpitAndroidxGeneralComposeScope.() -> Unit) {
        block(EpitAndroidxGeneralComposeScope(dependencyHandler))
    }

    @ExperimentalEpitApi
    fun concurrent(concurrentVersion: String, block: EpitAndroidXConcurrentScope.() -> Unit) {
        block(EpitAndroidXConcurrentScope(concurrentVersion))
    }

    @ExperimentalEpitApi
    fun constraintLayout(block: EpitAndroidxGeneralConstraintLayoutScope.() -> Unit) {
        block(EpitAndroidxGeneralConstraintLayoutScope)
    }

    @ExperimentalEpitApi
    fun contentpager(contentPagerVersion: String, block: EpitAndroidXContentPagerScope.() -> Unit) {
        block(EpitAndroidXContentPagerScope(contentPagerVersion))
    }

    @ExperimentalEpitApi
    fun coordinatorlayout(coordinatorLayoutVersion: String, block: EpitAndroidXCoordinatorLayoutScope.() -> Unit) {
        block(EpitAndroidXCoordinatorLayoutScope(coordinatorLayoutVersion))
    }

    @ExperimentalEpitApi
    fun core(block: EpitAndroidxGeneralCoreScope.() -> Unit) {
        block(EpitAndroidxGeneralCoreScope)
    }

    @ExperimentalEpitApi
    fun credentials(credentialsVersion: String, block: EpitAndroidXCredentialsScope.() -> Unit) {
        block(EpitAndroidXCredentialsScope(credentialsVersion))
    }

    @ExperimentalEpitApi
    fun cursoradapter(cursorAdapterVersion: String, block: EpitAndroidXCursorAdaptiveScope.() -> Unit) {
        block(EpitAndroidXCursorAdaptiveScope(cursorAdapterVersion))
    }

    @ExperimentalEpitApi
    fun customview(customViewVersion: String, block: EpitAndroidXCustomViewScope.() -> Unit) {
        block(EpitAndroidXCustomViewScope(customViewVersion))
    }

    @ExperimentalEpitApi
    fun databinding(dataBindingVersion: String, block: EpitAndroidXDataBindingScope.() -> Unit) {
        block(EpitAndroidXDataBindingScope(dataBindingVersion))
    }

    @ExperimentalEpitApi
    fun datastore(dataStoreVersion: String, block: EpitAndroidXDataStoreScope.() -> Unit) {
        block(EpitAndroidXDataStoreScope(dataStoreVersion))
    }

    @ExperimentalEpitApi
    fun documentfile(documentFileVersion: String, block: EpitAndroidXDocumentFileScope.() -> Unit) {
        block(EpitAndroidXDocumentFileScope(documentFileVersion))
    }

    @ExperimentalEpitApi
    fun draganddrop(dragAndDropVersion: String, block: EpitAndroidXDragAndDropScope.() -> Unit) {
        block(EpitAndroidXDragAndDropScope(dragAndDropVersion))
    }

    @ExperimentalEpitApi
    fun drawerlayout(drawerLayoutVersion: String, block: EpitAndroidXDrawerLayoutScope.() -> Unit) {
        block(EpitAndroidXDrawerLayoutScope(drawerLayoutVersion))
    }

    @ExperimentalEpitApi
    fun dynamicanimation(dynamicAnimationVersion: String, block: EpitAndroidXDynamicAnimationScope.() -> Unit) {
        block(EpitAndroidXDynamicAnimationScope(dynamicAnimationVersion))
    }

    @ExperimentalEpitApi
    fun emoji(emojiVersion: String, block: EpitAndroidXEmojiScope.() -> Unit) {
        block(EpitAndroidXEmojiScope(emojiVersion))
    }

    @ExperimentalEpitApi
    fun emoji2(emoji2Version: String, block: EpitAndroidXEmoji2Scope.() -> Unit) {
        block(EpitAndroidXEmoji2Scope(emoji2Version))
    }

    @ExperimentalEpitApi
    fun exifinterface(exifInterfaceVersion: String, block: EpitAndroidXExifInterfaceScope.() -> Unit) {
        block(EpitAndroidXExifInterfaceScope(exifInterfaceVersion))
    }

    @ExperimentalEpitApi
    fun fragment(fragmentVersion: String, block: EpitAndroidXFragmentScope.() -> Unit) {
        block(EpitAndroidXFragmentScope(fragmentVersion))
    }

    @ExperimentalEpitApi
    fun glance(glanceVersion: String, block: EpitAndroidXGlanceScope.() -> Unit) {
        block(EpitAndroidXGlanceScope(glanceVersion))
    }

    @ExperimentalEpitApi
    fun gridlayout(gridLayoutVersion: String, block: EpitAndroidXGridLayoutScope.() -> Unit) {
        block(EpitAndroidXGridLayoutScope(gridLayoutVersion))
    }

    @ExperimentalEpitApi
    fun hilt(hiltVersion: String, block: EpitAndroidXHiltScope.() -> Unit) {
        block(EpitAndroidXHiltScope(hiltVersion))
    }

    @ExperimentalEpitApi
    fun lifecycle(lifecycleVersion: String, block: EpitAndroidXLifecycleScope.() -> Unit) {
        block(EpitAndroidXLifecycleScope(lifecycleVersion))
    }

    @ExperimentalEpitApi
    fun media(mediaVersion: String, block: EpitAndroidXMediaScope.() -> Unit) {
        block(EpitAndroidXMediaScope(mediaVersion))
    }

    @ExperimentalEpitApi
    fun media2(media2Version: String, block: EpitAndroidXMedia2Scope.() -> Unit) {
        block(EpitAndroidXMedia2Scope(media2Version))
    }

    @ExperimentalEpitApi
    fun media3(media3Version: String, block: EpitAndroidXMedia3Scope.() -> Unit) {
        block(EpitAndroidXMedia3Scope(media3Version))
    }

    @ExperimentalEpitApi
    fun mediarouter(mediarouterVersion: String, block: EpitAndroidXMediaRouterScope.() -> Unit) {
        block(EpitAndroidXMediaRouterScope(mediarouterVersion))
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
    fun preference(preferenceVersion: String, block: EpitAndroidXPreferenceScope.() -> Unit) {
        block(EpitAndroidXPreferenceScope(preferenceVersion))
    }

    @ExperimentalEpitApi
    fun profileinstaller(profileInstallerVersion: String, block: EpitAndroidXProfileInstallerScope.() -> Unit) {
        block(EpitAndroidXProfileInstallerScope(profileInstallerVersion))
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
    fun savedstate(savedStateVersion: String, block: EpitAndroidxSavedStateScope.() -> Unit) {
        block(EpitAndroidxSavedStateScope(savedStateVersion))
    }

    @ExperimentalEpitApi
    fun sqlite(sqliteVersion: String, block: EpitAndroidxSQLiteScope.() -> Unit) {
        block(EpitAndroidxSQLiteScope(sqliteVersion))
    }

    @ExperimentalEpitApi
    fun swiperefreshlayout(swipeRefreshLayoutVersion: String, block: EpitAndroidxSwipeRefreshLayoutScope.() -> Unit) {
        block(EpitAndroidxSwipeRefreshLayoutScope(swipeRefreshLayoutVersion))
    }

    @ExperimentalEpitApi
    fun test(block: EpitAndroidxGeneralTestScope.() -> Unit) {
        block(EpitAndroidxGeneralTestScope)
    }

    @ExperimentalEpitApi
    fun tracing(block: EpitAndroidxGeneralTracingScope.() -> Unit) {
        block(EpitAndroidxGeneralTracingScope)
    }

    @ExperimentalEpitApi
    fun transition(transitionVersion: String, block: EpitAndroidxTransitionScope.() -> Unit) {
        block(EpitAndroidxTransitionScope(transitionVersion))
    }

    @ExperimentalEpitApi
    fun viewpager(viewPagerVersion: String, block: EpitAndroidxViewPagerScope.() -> Unit) {
        block(EpitAndroidxViewPagerScope(viewPagerVersion))
    }

    @ExperimentalEpitApi
    fun viewpager2(viewPager2Version: String, block: EpitAndroidxViewPager2Scope.() -> Unit) {
        block(EpitAndroidxViewPager2Scope(viewPager2Version))
    }

    @ExperimentalEpitApi
    fun webkit(webkitVersion: String, block: EpitAndroidxWebkitScope.() -> Unit) {
        block(EpitAndroidxWebkitScope(webkitVersion))
    }

    @ExperimentalEpitApi
    fun window(block: EpitAndroidxGeneralWindowScope.() -> Unit) {
        block(EpitAndroidxGeneralWindowScope)
    }

    @ExperimentalEpitApi
    fun work(workVersion: String, block: EpitAndroidXWorkScope.() -> Unit) {
        block(EpitAndroidXWorkScope(workVersion))
    }
}
