package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.dsl.kotlinx.*
import org.gradle.kotlin.dsl.DependencyHandlerScope

object EpitKotlinxScope {

    fun EpitKotlinxScope.atomicfu(atomicfuVersion: String, block: EpitKotlinxAtomicFUScope.() -> Unit) {
        block(EpitKotlinxAtomicFUScope(atomicfuVersion))
    }

    fun EpitKotlinxScope.coroutines(coroutinesVersion: String, block: EpitKotlinxCoroutinesScope.() -> Unit) {
        block(EpitKotlinxCoroutinesScope(coroutinesVersion))
    }

    fun EpitKotlinxScope.collectionsImmutable(
        collectionsImmutableVersion: String,
        block: EpitKotlinxImmutableCollectionsScope.() -> Unit
    ) {
        block(EpitKotlinxImmutableCollectionsScope(collectionsImmutableVersion))
    }

    fun EpitKotlinxScope.datetime(datetimeVersion: String, block: EpitKotlinxDatetimeScope.() -> Unit) {
        block(EpitKotlinxDatetimeScope(datetimeVersion))
    }

    fun EpitKotlinxScope.serialization(serializationVersion: String, block: EpitKotlinxSerializationScope.() -> Unit) {
        block(EpitKotlinxSerializationScope(serializationVersion))
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
