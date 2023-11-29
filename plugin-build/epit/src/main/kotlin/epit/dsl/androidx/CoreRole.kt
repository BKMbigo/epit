package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreRoleScope(
    private val androidXCoreRoleVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreRole.dependency
        get(): String = "${this.moduleName}:${androidXCoreRoleVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreRole.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreRole: AndroidX.Core.CoreRole) {
        add("implementation", coreRole.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
