package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXTestServicesScope internal constructor(
    private val androidxTestServicesVersion: String
) {

    @ExperimentalEpitApi
    val Epit.storage
        get() = AndroidX.Test.Services.storage.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.storage(version: String) =
        AndroidX.Test.Services.storage.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.test_services
        get() = AndroidX.Test.Services.test_services.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.test_services(version: String) =
        AndroidX.Test.Services.test_services.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Test.Services.dependencyAsString
        get() = moduleName joinWithColon androidxTestServicesVersion

    internal fun AndroidX.Test.Services.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
