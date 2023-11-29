package epit.dsl

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitPreviewScope(
    internal val dependencyHandlerScope: DependencyHandlerScope
) {

    @OptIn(ExperimentalEpitApi::class)
    fun androidx(block: EpitAndroidxScope.() -> Unit) {
        block(EpitAndroidxScope(dependencyHandlerScope))
    }

    @ExperimentalEpitApi
    fun firebase(bomVersion: String, block: EpitFirebaseScope.() -> Unit) {
        val firebaseScope = EpitFirebaseScope(bomVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(firebaseScope.bom))
        }
        block(firebaseScope)
    }


    fun koin(bomVersion: String, block: EpitKoinScope.() -> Unit) {
        val koinScope = EpitKoinScope(bomVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(koinScope.bom))
        }
        block(koinScope)
    }

    fun kotlinx(block: EpitKotlinxScope.() -> Unit) {
        block(EpitKotlinxScope)
    }


    @OptIn(ExperimentalEpitApi::class)
    fun squareup(block: EpitSquareScope.() -> Unit) {
        block(EpitSquareScope(dependencyHandlerScope))
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
