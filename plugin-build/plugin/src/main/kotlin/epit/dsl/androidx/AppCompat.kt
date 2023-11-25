package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Appcompat(
    internal val moduleName: String
): epit.dsl.androidx.AndroidXDependencies {
    appcompat(moduleName = "androidx.appcompat:appcompat"),
    appcompat_resources("androidx.appcompat:appcompat-resources")
}

class EpitAndroidXAppCompatScope(
    private val androidXAppcompatVersion: String
) {
    val epit.dsl.androidx.Appcompat.dependency
        get(): String = "${this.moduleName}:${androidXAppcompatVersion}"

    fun DependencyHandlerScope.implementation(appcompat: epit.dsl.androidx.Appcompat) {
        add("implementation", appcompat.dependency)
    }
}
