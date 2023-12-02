package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
object EpitKotlinxScope {

    @ExperimentalEpitApi
    fun EpitKotlinxScope.atomicfu(atomicfuVersion: String, block: EpitKotlinxAtomicFUScope.() -> Unit) {
        block(EpitKotlinxAtomicFUScope(atomicfuVersion))
    }

    @ExperimentalEpitApi
    fun EpitKotlinxScope.coroutines(coroutinesVersion: String, block: EpitKotlinxCoroutinesScope.() -> Unit) {
        block(EpitKotlinxCoroutinesScope(coroutinesVersion))
    }

    @ExperimentalEpitApi
    fun EpitKotlinxScope.collectionsImmutable(
        collectionsImmutableVersion: String,
        block: EpitKotlinxImmutableCollectionsScope.() -> Unit
    ) {
        block(EpitKotlinxImmutableCollectionsScope(collectionsImmutableVersion))
    }

    @ExperimentalEpitApi
    fun EpitKotlinxScope.datetime(datetimeVersion: String, block: EpitKotlinxDatetimeScope.() -> Unit) {
        block(EpitKotlinxDatetimeScope(datetimeVersion))
    }

    @ExperimentalEpitApi
    fun EpitKotlinxScope.serialization(serializationVersion: String, block: EpitKotlinxSerializationScope.() -> Unit) {
        block(EpitKotlinxSerializationScope(serializationVersion))
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
