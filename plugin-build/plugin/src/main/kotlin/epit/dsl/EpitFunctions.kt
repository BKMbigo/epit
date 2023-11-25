package epit.dsl

import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
fun DependencyHandlerScope.epitDependencies(block: EpitDependenciesScope.() -> Unit) {
    block(EpitDependenciesScope(this))
}

fun EpitDependenciesScope.androidx(block: EpitAndroidxScope.() -> Unit) {
    block(EpitAndroidxScope)
}

fun EpitDependenciesScope.compose(
    bomVersion: String,
    block: EpitComposeScope.() -> Unit
) {
    val composeScope = EpitComposeScope(bomVersion)
    with(this.dependencyHandlerScope) {
        add("implementation", platform(composeScope.bom))
    }
    block(composeScope)
}

fun EpitDependenciesScope.firebase(bomVersion: String, block: EpitFirebaseScope.() -> Unit) {
    val firebaseScope = EpitFirebaseScope(bomVersion)
    with(dependencyHandlerScope) {
        add("implementation", platform(firebaseScope.bom))
    }
    block(firebaseScope)
}


fun EpitDependenciesScope.koin(bomVersion: String, block: EpitKoinScope.() -> Unit) {
    val koinScope = EpitKoinScope(bomVersion)
    with(dependencyHandlerScope) {
        add("implementation", platform(koinScope.bom))
    }
    block(koinScope)
}


fun EpitDependenciesScope.kotlinx(block: EpitKotlinxScope.() -> Unit) {
    block(EpitKotlinxScope)
}
