package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitAndroidXCoreGoogleShortcutsScope(
    private val androidXCoreGoogleShortcutsVersion: String
) {
    @ExperimentalEpitApi
    val AndroidX.Core.CoreGoogleShortcuts.dependency
        get(): String = "${this.moduleName}:${androidXCoreGoogleShortcutsVersion}"

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreGoogleShortcuts.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreGoogleShortcuts: AndroidX.Core.CoreGoogleShortcuts) {
        add("implementation", coreGoogleShortcuts.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
