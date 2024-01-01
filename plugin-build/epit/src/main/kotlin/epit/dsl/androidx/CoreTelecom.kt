package epit.dsl.androidx

import Epit
import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitAndroidXCoreTelecomScope internal constructor(
    private val androidXCoreTelecomVersion: String
) {

    /* androidx.core:core-telecom */
    @ExperimentalEpitApi
    val Epit.core_telecom
        get() = AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString

    @ExperimentalEpitApi
    fun Epit.core_telecom(version: String) =
        AndroidX.Core.CoreTelecom.core_telecom.dependencyAsString(version)


    @ExperimentalEpitApi
    val AndroidX.Core.CoreTelecom.dependencyAsString
        get(): String = moduleName joinWithColon androidXCoreTelecomVersion

    @ExperimentalEpitApi
    fun AndroidX.Core.CoreTelecom.dependencyAsString(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coreTelecom: AndroidX.Core.CoreTelecom) {
        add("implementation", coreTelecom.dependencyAsString)
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
