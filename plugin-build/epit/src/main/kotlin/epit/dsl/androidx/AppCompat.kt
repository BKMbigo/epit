package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXAppCompatScope internal constructor(
    private val androidXAppcompatVersion: String
) {

    @ExperimentalEpitApi
    val Epit.appcompat
        get() = AndroidX.Appcompat.appcompat.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.appcompat(version: String) =
        AndroidX.Appcompat.appcompat.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.appcompat_resources
        get() = AndroidX.Appcompat.appcompat_resources.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.appcompat_resources(version: String) =
        AndroidX.Appcompat.appcompat_resources.dependencyAsString(version)

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.Appcompat.dependencyAsString
        get(): String = moduleName joinWithColon androidXAppcompatVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.Appcompat.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(appcompat: AndroidX.Appcompat) {
        add("implementation", appcompat.dependencyAsString)
    }
}
