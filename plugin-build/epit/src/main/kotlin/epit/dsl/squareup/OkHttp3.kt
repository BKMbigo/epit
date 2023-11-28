package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitSquareOkHttp3BOMScope(
    private val squareOkHttp3BOMVersion: String
) {

    @ExperimentalEpitApi
    val bom = "${SquareUp.OkHttp3.okhttp_bom.moduleName}:${squareOkHttp3BOMVersion}"

    @ExperimentalEpitApi
    fun bom(customVersion: String) = "${SquareUp.OkHttp3.okhttp_bom.moduleName}:${customVersion}"

    @ExperimentalEpitApi
    val SquareUp.OkHttp3.dependency
        get(): String = "${this.moduleName}:${squareOkHttp3BOMVersion}"

    @ExperimentalEpitApi
    fun SquareUp.OkHttp3.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(okHttp3: SquareUp.OkHttp3) {
        add("implementation", okHttp3.moduleName)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
