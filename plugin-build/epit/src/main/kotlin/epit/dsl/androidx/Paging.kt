package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXPagingScope internal constructor(
    private val androidXPagingVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Paging.dependency
        get(): String = moduleName joinWithColon androidXPagingVersion

    @ExperimentalEpitApi
    fun AndroidX.Paging.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(paging: AndroidX.Paging) {
        add("implementation", paging.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
