package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class CollectionsImmutable(
    internal val moduleName: String
) : KotlinxDependencies {
    collections_immutable(moduleName = "org.jetbrains.kotlinx:kotlinx-collections-immutable")
}

class EpitKotlinxImmutableCollectionsScope internal constructor(
    private val kotinxCollectionsImmutableVersion: String
) {
    val CollectionsImmutable.dependency
        get(): String = "${this.moduleName}:${kotinxCollectionsImmutableVersion}"

    fun CollectionsImmutable.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(collectionsImmutable: CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
