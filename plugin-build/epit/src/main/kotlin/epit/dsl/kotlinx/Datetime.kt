package epit.dsl.kotlinx

import Epit
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitKotlinxDatetimeScope internal constructor(
    internal val kotlinxDatetimeVersion: String
) {

    @ExperimentalEpitApi
    val Epit.datetime
        get() = KotlinX.Datetime.datetime.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.datetime(version: String) =
        KotlinX.Datetime.datetime.dependencyAsString(version)

    /* Internal Functions */

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @ExperimentalEpitApi
    val KotlinX.Datetime.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxDatetimeVersion


    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun KotlinX.Datetime.dependencyAsString(version: String) = moduleName joinWithColon version

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(datetime: KotlinX.Datetime) {
        add("implementation", datetime.dependencyAsString)
    }

}
