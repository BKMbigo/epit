package epit.dsl

import epit.dsl.kotlinx.*

object EpitKotlinxScope {

    fun atomicfu(atomicfuVersion: String, block: EpitKotlinxAtomicFUScope.() -> Unit) {
        block(EpitKotlinxAtomicFUScope(atomicfuVersion))
    }

    fun coroutines(coroutinesVersion: String, block: EpitKotlinxCoroutinesScope.() -> Unit) {
        block(EpitKotlinxCoroutinesScope(coroutinesVersion))
    }

    fun collectionsImmutable(
        collectionsImmutableVersion: String,
        block: EpitKotlinxImmutableCollectionsScope.() -> Unit
    ) {
        block(EpitKotlinxImmutableCollectionsScope(collectionsImmutableVersion))
    }

    fun datetime(datetimeVersion: String, block: EpitKotlinxDatetimeScope.() -> Unit) {
        block(EpitKotlinxDatetimeScope(datetimeVersion))
    }

    fun serialization(serializationVersion: String, block: EpitKotlinxSerializationScope.() -> Unit) {
        block(EpitKotlinxSerializationScope(serializationVersion))
    }

}
