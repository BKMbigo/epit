package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Appcompat(
    internal val moduleName: String
) : AndroidXDependencies {
    appcompat(moduleName = "androidx.appcompat:appcompat"),
    appcompat_resources("androidx.appcompat:appcompat-resources")
}

class EpitAndroidXAppCompatScope(
    private val androidXAppcompatVersion: String
) {
    val Appcompat.dependency
        get(): String = "${this.moduleName}:${androidXAppcompatVersion}"

    fun DependencyHandlerScope.implementation(appcompat: Appcompat) {
        add("implementation", appcompat.dependency)
    }
}
