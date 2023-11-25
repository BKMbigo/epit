package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class TestCore(
    internal val moduleName: String
) : AndroidXDependencies {
    core(moduleName = "androidx.test:core"),
    core_ktx(moduleName = "androidx.test:core-ktx")
}

class EpitAndroidXTestCoreScope(
    private val androidXTestCoreVersion: String
) {
    val TestCore.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    fun DependencyHandlerScope.implementation(testCore: TestCore) {
        add("implementation", testCore.dependency)
    }
}