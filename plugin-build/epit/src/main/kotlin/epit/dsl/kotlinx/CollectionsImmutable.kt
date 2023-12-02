package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxImmutableCollectionsScope(
    private val kotlinxCollectionsImmutableVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.CollectionsImmutable.dependency
        get(): String = moduleName joinWithColon kotlinxCollectionsImmutableVersion

    @ExperimentalEpitApi
    fun KotlinX.CollectionsImmutable.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(collectionsImmutable: KotlinX.CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
