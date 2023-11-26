package epit.dsl

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitPreviewScope(
    internal val dependencyHandlerScope: DependencyHandlerScope
) {

    fun androidx(block: EpitAndroidxScope.() -> Unit) {
        block(EpitAndroidxScope)
    }

    fun compose(
        bomVersion: String,
        block: EpitComposeScope.() -> Unit
    ) {
        val composeScope = EpitComposeScope(bomVersion)
        with(this.dependencyHandlerScope) {
            add("implementation", platform(composeScope.bom))
        }
        block(composeScope)
    }

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

    fun squareup(block: EpitSquareScope.() -> Unit) {
        block(EpitSquareScope(dependencyHandlerScope))
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
