package epit

import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

interface EpitDependency

@EpitInvalidApi
fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
    throw IllegalStateException("Should explicitly call an Epit dependency")
}
