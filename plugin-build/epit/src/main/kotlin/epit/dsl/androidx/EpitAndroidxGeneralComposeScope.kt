package epit.dsl.androidx

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@EpitDsl
class EpitAndroidxGeneralComposeScope internal constructor(
    private val dependencyHandlerScope: DependencyHandlerScope
) {

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.animation(
        animationVersion: String,
        block: EpitAndroidXComposeAnimationScope.() -> Unit
    ) {
        block(EpitAndroidXComposeAnimationScope(animationVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.compiler(
        compilerVersion: String,
        block: EpitAndroidXComposeCompilerScope.() -> Unit
    ) {
        block(EpitAndroidXComposeCompilerScope(compilerVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.composeBom(
        bomVersion: String,
        block: EpitAndroidXComposeBomScope.() -> Unit
    ) {
        val composeScope = EpitAndroidXComposeBomScope(bomVersion)
        with(this.dependencyHandlerScope) {
            add("implementation", platform(composeScope.bomAsString))
        }
        block(composeScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.foundation(block: EpitAndroidxGeneralComposeFoundationScope.() -> Unit) {
        block(EpitAndroidxGeneralComposeFoundationScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.material(
        materialVersion: String,
        block: EpitAndroidXComposeMaterialScope.() -> Unit
    ) {
        block(EpitAndroidXComposeMaterialScope(materialVersion))
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.material3(block: EpitAndroidxGeneralComposeMaterial3Scope.() -> Unit) {
        block(EpitAndroidxGeneralComposeMaterial3Scope)
    }

    fun EpitAndroidxGeneralComposeScope.runtime(block: EpitAndroidxGeneralComposeRuntimeScope.() -> Unit) {
        block(EpitAndroidxGeneralComposeRuntimeScope)
    }

    @ExperimentalEpitApi
    fun EpitAndroidxGeneralComposeScope.ui(composeUIVersion: String, block: EpitAndroidXComposeUIScope.() -> Unit) {
        block(EpitAndroidXComposeUIScope(composeUIVersion))
    }
}
