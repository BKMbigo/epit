package epit.dsl.kotlinx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Coroutines(
    internal val moduleName: String
) : KotlinxDependencies {
    coroutines_core(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-core"),
    coroutines_android(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-android"),
    coroutines_debug(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-debug"),
    coroutines_guava(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-guava"),
    coroutines_javafx(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-javafx"),
    coroutines_jdk9(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk9"),
    coroutines_play_services(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services"),
    coroutines_reactive(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive"),
    coroutines_rx2(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2"),
    coroutines_rx3(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-rx3"),
    coroutines_slf4j(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-slf4j"),
    coroutines_swing(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-swing"),
    coroutines_test(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-test")
}

class EpitKotlinxCoroutinesScope internal constructor(
    private val kotlinxCoroutinesVersion: String
) {
    val Coroutines.dependency
        get(): String = "${this.moduleName}:${kotlinxCoroutinesVersion}"

    fun DependencyHandlerScope.implementation(coroutines: Coroutines) {
        add("implementation", coroutines.dependency)
    }
}