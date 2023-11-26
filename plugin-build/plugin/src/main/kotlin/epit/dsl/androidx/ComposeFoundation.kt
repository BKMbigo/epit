package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.compose.Compose
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitAndroidXComposeFoundationScope(
    private val androidXComposeFoundationVersion: String
) {

    val Compose.ComposeFoundation.dependency
        get(): String = "${this.moduleName}:${androidXComposeFoundationVersion}"

    fun Compose.ComposeFoundation.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(composeFoundation: Compose.ComposeFoundation) {
        add("implementation", composeFoundation.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
