package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreTelecomScope(
    private val androidXCoreTelecomVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreTelecom.dependency
        get(): String = "${this.moduleName}:${androidXCoreTelecomVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreTelecom.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreTelecom: AndroidX.Core.CoreTelecom) {
        add("implementation", coreTelecom.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
