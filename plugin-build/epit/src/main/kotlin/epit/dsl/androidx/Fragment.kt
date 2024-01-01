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
class EpitAndroidXFragmentScope internal constructor(
    private val androidXFragmentVersion: String
) {

    /* androidx.fragment:fragment */
    @ExperimentalEpitApi
    val Epit.fragment
        get() = AndroidX.Fragment.fragment.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.fragment(version: String) =
        AndroidX.Fragment.fragment.dependencyAsString(version)

    /* androidx.fragment:fragment-ktx */
    @ExperimentalEpitApi
    val Epit.fragment_ktx
        get() = AndroidX.Fragment.fragment_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.fragment_ktx(version: String) =
        AndroidX.Fragment.fragment_ktx.dependencyAsString(version)

    /* androidx.fragment:fragment-testing */
    @ExperimentalEpitApi
    val Epit.fragment_testing
        get() = AndroidX.Fragment.fragment_testing.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.fragment_testing(version: String) =
        AndroidX.Fragment.fragment_testing.dependencyAsString(version)

    /* androidx.fragment:fragment-testing-manifest */
    @ExperimentalEpitApi
    val Epit.fragment_testing_manifest
        get() = AndroidX.Fragment.fragment_testing_manifest.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.fragment_testing_manifest(version: String) =
        AndroidX.Fragment.fragment_testing_manifest.dependencyAsString(version)

    @ExperimentalEpitApi
    val AndroidX.Fragment.dependencyAsString
        get(): String = this.moduleName joinWithColon androidXFragmentVersion

    @ExperimentalEpitApi
    fun AndroidX.Fragment.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(fragment: AndroidX.Fragment) {
        add("implementation", fragment.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
