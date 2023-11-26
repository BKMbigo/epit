package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import epit.annotations.ExperimentalEpitApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
enum class Picasso(
    internal val moduleName: String
) : EpitDependency {
    picasso(moduleName = "com.squareup.picasso:picasso"),

    //    picasso_sample(moduleName = "com.squareup.picasso:picasso-sample"),
//    picasso_parent(moduleName = "com.squareup.picasso:picasso-parent"),
    picasso_pollexor(moduleName = "com.squareup.picasso:picasso-pollexor")
}

@ExperimentalEpitApi
class EpitSquarePicassoScope(
    private val squarePicassoVersion: String
) {
    @ExperimentalEpitApi
    val Picasso.dependency
        get(): String = "${this.moduleName}:${squarePicassoVersion}"

    @ExperimentalEpitApi
    fun Picasso.dependency(version: String) = "${this.moduleName}:${version}"

    @ExperimentalEpitApi
    fun DependencyHandlerScope.implementation(picasso: Picasso) {
        add("implementation", picasso.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
