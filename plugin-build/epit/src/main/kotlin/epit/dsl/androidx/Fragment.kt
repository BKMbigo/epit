package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Fragment(
    internal val moduleName: String
) : AndroidXDependency {
    fragment(moduleName = "androidx.fragment:fragment"),
    fragment_ktx(moduleName = "androidx.fragment:fragment-ktx"),
    fragment_testing(moduleName = "androidx.fragment:fragment-testing"),
    fragment_testing_manifest(moduleName = "androidx.fragment:fragment-testing-manifest"),
}

@ExperimentalEpitApi
class EpitAndroidXFragmentScope(
    private val androidXFragmentVersion: String
) {
    @ExperimentalEpitApi
    val Fragment.dependency
        get(): String = "${this.moduleName}:${androidXFragmentVersion}"

    @ExperimentalEpitApi
    fun Fragment.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(fragment: Fragment) {
        add("implementation", fragment.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
