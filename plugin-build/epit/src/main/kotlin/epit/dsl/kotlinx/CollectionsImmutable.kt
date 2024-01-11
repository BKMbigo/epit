package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
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

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    val KotlinX.CollectionsImmutable.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxCollectionsImmutableVersion

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun KotlinX.CollectionsImmutable.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(collectionsImmutable: KotlinX.CollectionsImmutable) {
        add("implementation", collectionsImmutable.dependencyAsString)
    }
}
