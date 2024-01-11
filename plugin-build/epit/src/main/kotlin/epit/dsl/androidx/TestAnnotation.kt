package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestAnnotationScope internal constructor(
    private val androidXTestAnnotationVersion: String
) {

    @ExperimentalEpitApi
    val Epit.test_annotation
        get() = AndroidX.Test.Annotation.test_annotation.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.test_annotation(version: String) =
        AndroidX.Test.Annotation.test_annotation.dependencyAsString(version)

    /* internal function */
    internal val AndroidX.Test.Annotation.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestAnnotationVersion

    internal fun AndroidX.Test.Annotation.dependencyAsString(version: String) = moduleName joinWithColon version

}
