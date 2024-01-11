package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.KotlinX
import epit.utils.joinWithColon

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

    internal val KotlinX.CollectionsImmutable.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxCollectionsImmutableVersion

    internal fun KotlinX.CollectionsImmutable.dependencyAsString(version: String) = moduleName joinWithColon version

}
