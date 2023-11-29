package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxDatetimeScope internal constructor(
    private val kotinxDatetimeVersion: String
) {

    @ExperimentalEpitApi
    val KotlinX.Datetime.dependency
        get(): String = "${this.moduleName}:${kotinxDatetimeVersion}"

    @ExperimentalEpitApi
    fun KotlinX.Datetime.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(datetime: KotlinX.Datetime) {
        add("implementation", datetime.dependency)
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}
