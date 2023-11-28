package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxImmutableCollectionsScope internal constructor(
    private val kotinxCollectionsImmutableVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.CollectionsImmutable.dependency
        get(): String = "${this.moduleName}:${kotinxCollectionsImmutableVersion}"

    @ExperimentalEpitApi
    fun KotlinX.CollectionsImmutable.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(collectionsImmutable: KotlinX.CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
