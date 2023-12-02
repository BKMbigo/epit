package epit.dsl.squareup

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi
import epit.annotations.InvalidScopeEpitDependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

@ExperimentalEpitApi
class EpitSquareScope(
    internal val dependencyHandlerScope: DependencyHandlerScope
) {

    @ExperimentalEpitApi
    fun leakcanary(leakcanaryVersion: String, block: EpitSquareLeakCanaryScope.() -> Unit) {
        block(EpitSquareLeakCanaryScope(leakcanaryVersion))
    }

    @ExperimentalEpitApi
    fun okhttp3(okhttpBOMVersion: String, block: EpitSquareOkHttp3BOMScope.() -> Unit) {
        val okHttp3BOMScope = EpitSquareOkHttp3BOMScope(okhttpBOMVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(okHttp3BOMScope.bom))
        }
        block(okHttp3BOMScope)
    }

    @ExperimentalEpitApi
    fun picasso(picassoVersion: String, block: EpitSquarePicassoScope.() -> Unit) {
        block(EpitSquarePicassoScope(picassoVersion))
    }

    @ExperimentalEpitApi
    fun retrofit2(retrofit2Version: String, block: EpitSquareRetrofit2Scope.() -> Unit) {
        block(EpitSquareRetrofit2Scope(retrofit2Version))
    }

    @InvalidScopeEpitDependency
    fun DependencyHandlerScope.implementation(epitDependency: EpitDependency) {
        throw IllegalStateException("You have called a dependency from the wrong scope. Please refer to Epit documentation for reference")
    }
}