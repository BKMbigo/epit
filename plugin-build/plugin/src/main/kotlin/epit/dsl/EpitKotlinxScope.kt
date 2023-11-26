package epit.dsl

import epit.dsl.kotlinx.*

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

}
