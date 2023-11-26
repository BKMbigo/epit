package epit.dsl

import epit.dsl.squareup.EpitSquareLeakCanaryScope
import epit.dsl.squareup.EpitSquareOkHttp3BOMScope
import epit.dsl.squareup.EpitSquarePicassoScope
import epit.dsl.squareup.EpitSquareRetrofit2Scope
import org.gradle.kotlin.dsl.DependencyHandlerScope

class EpitSquareScope(
    internal val dependencyHandlerScope: DependencyHandlerScope
) {

    fun leakcanary(leakcanaryVersion: String, block: EpitSquareLeakCanaryScope.() -> Unit) {
        block(EpitSquareLeakCanaryScope(leakcanaryVersion))
    }

    fun okhttp3(okhttpBOMVersion: String, block: EpitSquareOkHttp3BOMScope.() -> Unit) {
        val okHttp3BOMScope = EpitSquareOkHttp3BOMScope(okhttpBOMVersion)
        with(dependencyHandlerScope) {
            add("implementation", platform(okHttp3BOMScope.bom))
        }
        block(okHttp3BOMScope)
    }

    fun picasso(picassoVersion: String, block: EpitSquarePicassoScope.() -> Unit) {
        block(EpitSquarePicassoScope(picassoVersion))
    }

    fun retrofit2(retrofit2Version: String, block: EpitSquareRetrofit2Scope.() -> Unit) {
        block(EpitSquareRetrofit2Scope(retrofit2Version))
    }

}
