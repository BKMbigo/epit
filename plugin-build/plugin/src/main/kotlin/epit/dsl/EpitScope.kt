package epit.dsl

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.DependencyHandlerScope

object EpitScope {
    fun DependencyHandlerScope.androidx(block: EpitAndroidxScope.() -> Unit) {
        block(EpitAndroidxScope)
    }

    fun DependencyHandlerScope.compose(bomVersion: String, block: EpitComposeScope.() -> Unit) {
        val composeScope = EpitComposeScope(bomVersion)
        add("implementation", platform(composeScope.bom))
        block(composeScope)
    }

    fun DependencyHandlerScope.firebase(bomVersion: String, block: EpitFirebaseScope.() -> Unit) {
        val firebaseScope = EpitFirebaseScope(bomVersion)
        add("implementation", platform(firebaseScope.bom))
        block(firebaseScope)
    }

    fun DependencyHandlerScope.koin(bomVersion: String, block: EpitKoinScope.() -> Unit) {
        val koinScope = EpitKoinScope(bomVersion)
        add("implementation", platform(koinScope.bom))
        block(koinScope)
    }


}
