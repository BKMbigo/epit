package epit.dsl

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencyhandler.EpitDependencyHandler
import epit.dsl.androidx.EpitAndroidxScope
import epit.dsl.coil.EpitCoilScope
import epit.dsl.glide.EpitGlideGeneralScope
import epit.dsl.google.EpitGoogleScope
import epit.dsl.koin.EpitKoinScope
import epit.dsl.kotlinx.EpitKotlinxScope
import epit.dsl.ktor.EpitExperimentalKtorScope
import epit.dsl.raamcosta.EpitRaamcostaScope
import epit.dsl.squareup.EpitSquareScope
import epit.dsl.voyager.EpitVoyagerScope

@EpitDsl
class EpitPreviewScope internal constructor(
    private val dependencyHandler: EpitDependencyHandler
) {

    @OptIn(ExperimentalEpitApi::class)
    fun androidx(block: EpitAndroidxScope.() -> Unit) {
        block(EpitAndroidxScope(dependencyHandler))
    }

    @ExperimentalEpitApi
    fun google(block: EpitGoogleScope.() -> Unit) {
        block(EpitGoogleScope(dependencyHandler))
    }

    @ExperimentalEpitApi
    fun glide(block: EpitGlideGeneralScope.() -> Unit) {
        block(EpitGlideGeneralScope)
    }

    @ExperimentalEpitApi
    fun coilBom(bomVersion: String, block: EpitCoilScope.() -> Unit) {
        val coilScope = EpitCoilScope(bomVersion)
        with(dependencyHandler) {
            implementation(platform(coilScope.bomAsString))
        }
        block(coilScope)
    }

    @OptIn(ExperimentalEpitApi::class)
    fun koinBom(bomVersion: String, block: EpitKoinScope.() -> Unit) {
        val koinScope = EpitKoinScope(bomVersion)
        with(dependencyHandler) {
            implementation(platform(koinScope.bomAsString))
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
    fun ktorBom(
        ktorBOMVersion: String,
        block: EpitExperimentalKtorScope.() -> Unit
    ) {
        val ktorScope = EpitExperimentalKtorScope(ktorBOMVersion)
        with(dependencyHandler) {
            implementation(platform(ktorScope.bomAsString))
        }
        block(ktorScope)
    }

    @ExperimentalEpitApi
    fun squareup(block: EpitSquareScope.() -> Unit) {
        block(EpitSquareScope(dependencyHandler))
    }

    @ExperimentalEpitApi
    fun voyager(voyagerVersion: String, block: EpitVoyagerScope.() -> Unit) {
        block(EpitVoyagerScope(voyagerVersion))
    }
}
