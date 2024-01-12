package epit.dsl.squareup

import epit.annotations.EpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencyhandler.EpitDependencyHandler

@ExperimentalEpitApi
@EpitDsl
class EpitSquareScope internal constructor(
    internal val dependencyHandler: EpitDependencyHandler
) {

    @ExperimentalEpitApi
    fun leakcanary(leakcanaryVersion: String, block: EpitSquareLeakCanaryScope.() -> Unit) {
        block(EpitSquareLeakCanaryScope(leakcanaryVersion))
    }

    @ExperimentalEpitApi
    fun okhttp3Bom(okhttpBOMVersion: String, block: EpitSquareOkHttp3BOMScope.() -> Unit) {
        val okHttp3BOMScope = EpitSquareOkHttp3BOMScope(okhttpBOMVersion)
        with(dependencyHandler) {
            implementation(platform(okHttp3BOMScope.bomAsString))
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
}
