package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXRecyclerViewScope internal constructor(
    private val androidXRecyclerViewVersion: String
) {

    @ExperimentalEpitApi
    val Epit.recyclerview
        get() = AndroidX.RecyclerView.recyclerview.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.recyclerview(version: String) =
        AndroidX.RecyclerView.recyclerview.dependencyAsString(version)


    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val AndroidX.RecyclerView.dependencyAsString
        get(): String = moduleName joinWithColon androidXRecyclerViewVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun AndroidX.RecyclerView.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(recyclerView: AndroidX.RecyclerView) {
        add("implementation", recyclerView.dependencyAsString)
    }
}
