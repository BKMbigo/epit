package epit.dsl.kotlinx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
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

    @ExperimentalEpitApi
    val KotlinX.Datetime.dependencyAsString
        get(): String = moduleName joinWithColon kotlinxDatetimeVersion

    @ExperimentalEpitApi
    fun KotlinX.Datetime.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(datetime: KotlinX.Datetime) {
        add("implementation", datetime.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}
