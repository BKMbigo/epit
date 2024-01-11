package epit.dsl

import epit.dependencyhandler.generateEpitDependencyHandler
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

fun DependencyHandler.epitPreview(block: EpitPreviewScope.() -> Unit) {
    block(EpitPreviewScope(this.generateEpitDependencyHandler()))
}

fun KotlinDependencyHandler.epitPreview(block: EpitPreviewScope.() -> Unit) {
    block(EpitPreviewScope(this.generateEpitDependencyHandler()))
}
