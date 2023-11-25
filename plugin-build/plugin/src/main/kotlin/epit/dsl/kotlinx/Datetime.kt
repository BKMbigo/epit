package epit.dsl.kotlinx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Datetime(
    internal val moduleName: String
) : KotlinxDependencies {
    datetime(moduleName = "org.jetbrains.kotlinx:kotlinx-datetime")
}


class EpitKotlinxDatetimeScope internal constructor(
    private val kotinxDatetimeVersion: String
) {

    val Datetime.dependency
        get(): String = "${this.moduleName}:${kotinxDatetimeVersion}"

    fun DependencyHandlerScope.implementation(datetime: Datetime) {
        add("implementation", datetime.dependency)
    }

}
