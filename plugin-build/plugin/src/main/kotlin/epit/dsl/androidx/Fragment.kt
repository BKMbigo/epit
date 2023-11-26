package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Fragment(
    internal val moduleName: String
) : AndroidXDependency {
    fragment(moduleName = "androidx.fragment:fragment"),
    fragment_ktx(moduleName = "androidx.fragment:fragment-ktx"),
    fragment_testing(moduleName = "androidx.fragment:fragment-testing"),
    fragment_testing_manifest(moduleName = "androidx.fragment:fragment-testing-manifest"),
}

class EpitAndroidXFragmentScope(
    private val androidXFragmentVersion: String
) {
    val Fragment.dependency
        get(): String = "${this.moduleName}:${androidXFragmentVersion}"

    fun Fragment.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(fragment: Fragment) {
        add("implementation", fragment.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
