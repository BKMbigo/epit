package epit.dsl.androidx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXTestEspressoIdlingScope internal constructor(
    private val androidXTestEspressoIdlingVersion: String
) {
    @ExperimentalEpitApi
    val Epit.idling_concurrent
        get() = AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.idling_concurrent(version: String) =
        AndroidX.Test.Espresso.Idling.idling_concurrent.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.idling_net
        get() = AndroidX.Test.Espresso.Idling.idling_net.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.idling_net(version: String) =
        AndroidX.Test.Espresso.Idling.idling_net.dependencyAsString(version)

    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Test.Espresso.Idling.dependencyAsString
        get(): String = moduleName joinWithColon androidXTestEspressoIdlingVersion

    internal fun AndroidX.Test.Espresso.Idling.dependencyAsString(version: String) = moduleName joinWithColon version

}
