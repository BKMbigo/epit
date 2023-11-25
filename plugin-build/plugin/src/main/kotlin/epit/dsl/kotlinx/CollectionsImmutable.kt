package epit.dsl.kotlinx

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

    fun DependencyHandlerScope.implementation(collectionsImmutable: CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependency)
    }
}
