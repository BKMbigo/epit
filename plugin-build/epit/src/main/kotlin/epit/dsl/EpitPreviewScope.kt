package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import epit.dsl.androidx.EpitAndroidxScope
import epit.dsl.coil.EpitCoilScope
import epit.dsl.firebase.EpitFirebaseScope
import epit.dsl.glide.EpitGlideGeneralScope
import epit.dsl.google.EpitGoogleScope
import epit.dsl.koin.EpitKoinScope
import epit.dsl.kotlinx.EpitKotlinxScope
import epit.dsl.raamcosta.EpitRaamcostaScope
import epit.dsl.squareup.EpitSquareScope
import epit.dsl.voyager.EpitVoyagerScope
import org.gradle.kotlin.dsl.DependencyHandlerScope

@EpitDsl
class EpitPreviewScope internal constructor(
    private val dependencyHandlerScope: DependencyHandlerScope
) {

    @OptIn(ExperimentalEpitApi::class)
    fun androidx(block: EpitAndroidxScope.() -> Unit) {
        block(EpitAndroidxScope(dependencyHandlerScope))
    }

    @ExperimentalEpitApi
    fun google(block: EpitGoogleScope.() -> Unit) {
        block(EpitGoogleScope(dependencyHandlerScope))
    }

    @ExperimentalEpitApi
    fun glide(block: EpitGlideGeneralScope.() -> Unit) {
        block(EpitGlideGeneralScope)
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

    @ExperimentalEpitApi
    fun kotlinx(block: EpitKotlinxScope.() -> Unit) {
        block(EpitKotlinxScope)
    }

    @ExperimentalEpitApi
    fun raamcosta(block: EpitRaamcostaScope.() -> Unit) {
        block(EpitRaamcostaScope)
    }

    @ExperimentalEpitApi
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
