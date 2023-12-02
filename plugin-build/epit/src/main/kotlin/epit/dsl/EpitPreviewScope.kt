package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.dsl.androidx.EpitAndroidxScope
import epit.dsl.coil.EpitCoilScope
import epit.dsl.firebase.EpitFirebaseScope
import epit.dsl.koin.EpitKoinScope
import epit.dsl.kotlinx.EpitKotlinxScope
import epit.dsl.squareup.EpitSquareScope
import epit.dsl.voyager.EpitVoyagerScope
import org.gradle.kotlin.dsl.DependencyHandlerScope

@EpitDsl
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

    @ExperimentalEpitApi
    fun coil(bomVersion: String, block: EpitCoilScope.() -> Unit) {
        val coilScope = EpitCoilScope(bomVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(coilScope.bom))
        }
        block(coilScope)
    }

    @OptIn(ExperimentalEpitApi::class)
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

    @ExperimentalEpitApi
    fun voyager(voyagerVersion: String, block: EpitVoyagerScope.() -> Unit) {
        block(EpitVoyagerScope(voyagerVersion))
    }

    @Suppress("UNUSED_PARAMETER")
    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
