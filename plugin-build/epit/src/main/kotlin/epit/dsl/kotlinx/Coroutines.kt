package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitKotlinxCoroutinesScope internal constructor(
    private val kotlinxCoroutinesVersion: String
) {
    @ExperimentalEpitApi
    val KotlinX.Coroutines.dependency
        get(): String = "${this.moduleName}:${kotlinxCoroutinesVersion}"

    @ExperimentalEpitApi
    fun KotlinX.Coroutines.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(coroutines: KotlinX.Coroutines) {
        add("implementation", coroutines.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
