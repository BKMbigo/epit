package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

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

    /* Internal Functions */

    internal val AndroidX.Fragment.dependencyAsString
        get(): String = this.moduleName joinWithColon androidXFragmentVersion

    internal fun AndroidX.Fragment.dependencyAsString(version: String) = moduleName joinWithColon version

}
