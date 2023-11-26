package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.EpitInvalidApi
import org.gradle.kotlin.dsl.DependencyHandlerScope

enum class Picasso(
    internal val moduleName: String
) : EpitDependency {
    picasso(moduleName = "com.squareup.picasso:picasso"),

    //    picasso_sample(moduleName = "com.squareup.picasso:picasso-sample"),
//    picasso_parent(moduleName = "com.squareup.picasso:picasso-parent"),
    picasso_pollexor(moduleName = "com.squareup.picasso:picasso-pollexor")
}

class EpitSquarePicassoScope(
    private val squarePicassoVersion: String
) {
    val Picasso.dependency
        get(): String = "${this.moduleName}:${squarePicassoVersion}"

    fun Picasso.dependency(version: String) = "${this.moduleName}:${version}"

    fun DependencyHandlerScope.implementation(picasso: Picasso) {
        add("implementation", picasso.dependency)
    }

    @EpitInvalidApi
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}
