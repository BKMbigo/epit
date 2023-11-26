package epit.dsl.androidx

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class TestEspresso(
    internal val moduleName: String
) : AndroidXDependency {
    espresso_accessibility(moduleName = "androidx.test.espresso:espresso-accessibility"),
    espresso_contrib(moduleName = "androidx.test.espresso:espresso-contrib"),
    espresso_core(moduleName = "androidx.test.espresso:espresso-core"),

    //    espresso_device(moduleName = "androidx.test.espresso:espresso-device"),
    espresso_idling_resource(moduleName = "androidx.test.espresso:espresso-idling-resource"),
    espresso_intents(moduleName = "androidx.test.espresso:espresso-intents"),
    espresso_remote(moduleName = "androidx.test.espresso:espresso-remote"),
    espresso_web(moduleName = "androidx.test.espresso:espresso-web")
}

class EpitAndroidXTestEspressoScope(
    private val androidXTestEspressoVersion: String
) {
    val TestEspresso.dependency
        get(): String = "${this.moduleName}:${androidXTestEspressoVersion}"

    fun TestEspresso.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(testEspresso: TestEspresso) {
        add("implementation", testEspresso.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
