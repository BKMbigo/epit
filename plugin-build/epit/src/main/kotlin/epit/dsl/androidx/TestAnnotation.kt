package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

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
    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Annotation.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestAnnotationVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Annotation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(annotation: AndroidX.Test.Annotation) {
        add("implementation", annotation.dependencyAsString)
    }
}
