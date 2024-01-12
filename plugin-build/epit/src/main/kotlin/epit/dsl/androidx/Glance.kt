package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidXGlanceScope internal constructor(
    private val androidxGlanceVersion: String
) {

    @ExperimentalEpitApi
    val Epit.glance
        get() = AndroidX.Glance.glance.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glance(version: String) =
        AndroidX.Glance.glance.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.glance_appwidget
        get() = AndroidX.Glance.glance_appwidget.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glance_appwidget(version: String) =
        AndroidX.Glance.glance_appwidget.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.glance_material
        get() = AndroidX.Glance.glance_material.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glance_material(version: String) =
        AndroidX.Glance.glance_material.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.glance_material3
        get() = AndroidX.Glance.glance_material3.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glance_material3(version: String) =
        AndroidX.Glance.glance_material3.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.glance_wear_tiles
        get() = AndroidX.Glance.glance_wear_tiles.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.glance_wear_tiles(version: String) =
        AndroidX.Glance.glance_wear_tiles.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.Glance.dependencyAsString
        get() = moduleName joinWithColon androidxGlanceVersion

    internal fun AndroidX.Glance.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
