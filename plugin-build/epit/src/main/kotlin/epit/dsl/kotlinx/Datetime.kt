package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Datetime(
    internal val moduleName: String
) : KotlinxDependencies {
    datetime(moduleName = "org.jetbrains.kotlinx:kotlinx-datetime")
}

@ExperimentalEpitApi
class EpitKotlinxDatetimeScope internal constructor(
    private val kotinxDatetimeVersion: String
) {

    @ExperimentalEpitApi
    val Datetime.dependency
        get(): String = "${this.moduleName}:${kotinxDatetimeVersion}"

    @ExperimentalEpitApi
    fun Datetime.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(datetime: Datetime) {
        add("implementation", datetime.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }

}
