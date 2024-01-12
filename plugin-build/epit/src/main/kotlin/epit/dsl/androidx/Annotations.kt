package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

class EpitAndroidXAnnotationScope internal constructor(
    private val androidXAnnotationsVersion: String
) {

    @ExperimentalEpitApi
    val Epit.annotation
        get() = AndroidX.Annotation.annotation_annotation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.annotation(version: String) =
        AndroidX.Annotation.annotation_annotation.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.experimental
        get() = AndroidX.Annotation.experimental.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.experimental(version: String) =
        AndroidX.Annotation.experimental.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.experimental_lint
        get() = AndroidX.Annotation.experimental_lint.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.experimental_lint(version: String) =
        AndroidX.Annotation.experimental_lint.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Annotation.dependencyAsString
        get(): String = moduleName joinWithColon androidXAnnotationsVersion

    internal fun AndroidX.Annotation.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
