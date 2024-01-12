package epit.dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.utils.joinWithColon

@ExperimentalEpitApi
class EpitAndroidxSQLiteScope internal constructor(
    private val androidxSQLiteVersion: String
) {

    @ExperimentalEpitApi
    val Epit.sqlite
        get() = AndroidX.SQLite.sqlite.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.sqlite(version: String) =
        AndroidX.SQLite.sqlite.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.sqlite_framework
        get() = AndroidX.SQLite.sqlite_framework.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.sqlite_framework(version: String) =
        AndroidX.SQLite.sqlite_framework.dependencyAsString(version)

    @ExperimentalEpitApi
    val Epit.sqlite_ktx
        get() = AndroidX.SQLite.sqlite_ktx.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.sqlite_ktx(version: String) =
        AndroidX.SQLite.sqlite_ktx.dependencyAsString(version)


    /*
    * ============================
    * ==== Internal Functions ====
    * ============================
    * */

    internal val AndroidX.SQLite.dependencyAsString
        get() = moduleName joinWithColon androidxSQLiteVersion

    internal fun AndroidX.SQLite.dependencyAsString(version: String) =
        moduleName joinWithColon version

}
