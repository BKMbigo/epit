package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Test.Annotation.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestAnnotationVersion

    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Test.Annotation.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The method has been deprecated in favor of Epit namespace")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(annotation: AndroidX.Test.Annotation) {
        add("implementation", annotation.dependencyAsString)
    }
}
