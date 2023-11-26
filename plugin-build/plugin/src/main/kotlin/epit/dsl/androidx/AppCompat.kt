package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Appcompat(
    internal val moduleName: String
) : AndroidXDependency {
    appcompat(moduleName = "androidx.appcompat:appcompat"),
    appcompat_resources("androidx.appcompat:appcompat-resources")
}

class EpitAndroidXAppCompatScope(
    private val androidXAppcompatVersion: String
) {
    val Appcompat.dependency
        get(): String = "${this.moduleName}:${androidXAppcompatVersion}"

    fun Appcompat.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(appcompat: Appcompat) {
        add("implementation", appcompat.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
