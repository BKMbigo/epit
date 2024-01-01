package epit.dsl.kotlinx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxImmutableCollectionsScope internal constructor(
    private val kotlinxCollectionsImmutableVersion: String
) {

    @ExperimentalEpitApi
    val Epit.collections_immutable
        get() = KotlinX.CollectionsImmutable.collections_immutable.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.collections_immutable(version: String) =
        KotlinX.CollectionsImmutable.collections_immutable.dependencyAsString(version)

    @ExperimentalEpitApi
    val KotlinX.CollectionsImmutable.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxCollectionsImmutableVersion

    @ExperimentalEpitApi
    fun KotlinX.CollectionsImmutable.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(collectionsImmutable: KotlinX.CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
