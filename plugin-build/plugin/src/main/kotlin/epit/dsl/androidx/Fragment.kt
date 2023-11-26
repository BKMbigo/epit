package epit.dsl.androidx

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
}
