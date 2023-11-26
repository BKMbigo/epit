package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class CollectionsImmutable(
    internal val moduleName: String
) : KotlinxDependencies {
    collections_immutable(moduleName = "org.jetbrains.kotlinx:kotlinx-collections-immutable")
}

@ExperimentalEpitApi
class EpitKotlinxImmutableCollectionsScope internal constructor(
    private val kotinxCollectionsImmutableVersion: String
) {
    @ExperimentalEpitApi
    val CollectionsImmutable.dependency
        get(): String = "${this.moduleName}:${kotinxCollectionsImmutableVersion}"

    @ExperimentalEpitApi
    fun CollectionsImmutable.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(collectionsImmutable: CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
