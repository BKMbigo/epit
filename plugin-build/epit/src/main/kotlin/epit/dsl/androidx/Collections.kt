package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXCollectionScope internal constructor(
    private val androidXCollectionVersion: String
) {

    @ExperimentalEpitApi
    val Epit.collection
        get() = AndroidX.Collection.collection.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.collection(version: String) =
        AndroidX.Collection.collection.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.collection_ktx
        get() = AndroidX.Collection.collection_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.collection_ktx(version: String) =
        AndroidX.Collection.collection_ktx.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Collection.dependencyAsString
        get() = moduleName joinWithColon androidXCollectionVersion

    internal fun AndroidX.Collection.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
