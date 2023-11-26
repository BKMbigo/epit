package epit.dsl.androidx

import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeMaterial3Scope(
    private val androidXComposeMaterial3Version: String
) {

    val Compose.ComposeMaterial3.dependency
        get(): String = "${this.moduleName}:${androidXComposeMaterial3Version}"

    fun Compose.ComposeMaterial3.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeMaterial3: Compose.ComposeMaterial3) {
        add("implementation", composeMaterial3.dependency)
    }
}
