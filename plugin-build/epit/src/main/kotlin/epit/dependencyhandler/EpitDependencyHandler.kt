package epit.dependencyhandler

import epit.annotations.ExperimentalEpitApi
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

internal abstract class EpitDependencyHandler {

    abstract fun implementation(dependencyNotation: Any)

    abstract fun platform(notation: Any): Dependency

}

internal class EpitGradleDependencyHandler(
    private val dependencyHandler: DependencyHandler
) : EpitDependencyHandler() {
    override fun implementation(dependencyNotation: Any) {
        dependencyHandler.add("implementation", dependencyNotation)
    }

    override fun platform(notation: Any): Dependency =
        dependencyHandler.platform(notation)

}

internal class EpitKotlinDependencyHandler(
    private val kotlinDependencyHandler: KotlinDependencyHandler
) : EpitDependencyHandler() {

    override fun implementation(dependencyNotation: Any) {
        kotlinDependencyHandler.implementation(dependencyNotation)
    }

    @ExperimentalEpitApi
    override fun platform(notation: Any): Dependency =
        kotlinDependencyHandler.project.dependencies.platform(notation)
}

internal fun DependencyHandler.generateEpitDependencyHandler() =
    EpitGradleDependencyHandler(this)

internal fun KotlinDependencyHandler.generateEpitDependencyHandler() =
    EpitKotlinDependencyHandler(this)
