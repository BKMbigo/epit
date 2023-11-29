package epit

import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

interface EpitDependency

@InvalidScopeEpitDependency
fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
    throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
}
