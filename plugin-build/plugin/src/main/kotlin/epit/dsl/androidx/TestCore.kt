package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class TestCore(
    internal val moduleName: String
) : AndroidXDependency {
    core(moduleName = "androidx.test:core"),
    core_ktx(moduleName = "androidx.test:core-ktx")
}

class EpitAndroidXTestCoreScope(
    private val androidXTestCoreVersion: String
) {
    val TestCore.dependency
        get(): String = "${this.moduleName}:${androidXTestCoreVersion}"

    fun TestCore.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(testCore: TestCore) {
        add("implementation", testCore.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
