package epit.dsl

import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.epitPreview(block: EpitPreviewScope.() -> Unit) {
    block(EpitPreviewScope(this))
}
