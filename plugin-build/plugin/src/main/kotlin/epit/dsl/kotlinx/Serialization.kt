package epit.dsl.kotlinx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Serialization(
    internal val moduleName: String
) : KotlinxDependencies {
    serialization_core(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-core"),
    serialization_json(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-json")
}

class EpitKotlinxSerializationScope internal constructor(
    private val kotinxSerializationVersion: String
) {
    val Serialization.dependency
        get(): String = "${this.moduleName}:${kotinxSerializationVersion}"

    fun DependencyHandlerScope.implementation(serialization: Serialization) {
        add("implementation", serialization.dependency)
    }
}
