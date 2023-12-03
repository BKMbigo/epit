package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
@EpitDsl
class EpitSquareOkHttp3BOMScope internal constructor(
    private val squareOkHttp3BOMVersion: String
) {

    @ExperimentalEpitApi
    val DependencyHandlerScope.bom
        get() = platform(bomAsDependency)

    @ExperimentalEpitApi
    val bomAsDependency = SquareUp.OkHttp3.okhttp_bom.moduleName joinWithColon squareOkHttp3BOMVersion

    @ExperimentalEpitApi
    fun DependencyHandlerScope.bom(customVersion: String) = platform(bomAsDependency(customVersion))

    @ExperimentalEpitApi
    fun bomAsDependency(customVersion: String) = SquareUp.OkHttp3.okhttp_bom.moduleName joinWithColon customVersion

    @ExperimentalEpitApi
    val SquareUp.OkHttp3.dependency
        get(): String = moduleName joinWithColon squareOkHttp3BOMVersion

    @ExperimentalEpitApi
    fun SquareUp.OkHttp3.dependency(version: String) = moduleName joinWithColon version

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(okHttp3: SquareUp.OkHttp3) {
        add("implementation", okHttp3.moduleName)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
