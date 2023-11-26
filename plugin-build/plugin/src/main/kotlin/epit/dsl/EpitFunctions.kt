package epit.dsl

import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
fun DependencyHandlerScope.epitDependencies(block: EpitDependenciesScope.() -> Unit) {
    block(EpitDependenciesScope(this))
}
