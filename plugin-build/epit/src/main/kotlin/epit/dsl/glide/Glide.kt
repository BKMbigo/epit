package epit.dsl.glide

import epit.EpitDependency
import epit.annotations.InternalEpitApi
import epit.utils.joinWithColon

@Deprecated("The use of this API will be deprecated in version 2024.01.01")
@InternalEpitApi
sealed interface Glide : EpitDependency {
    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    enum class Glide(
        internal val moduleName: String
    ) : MainGlide {
        glide(moduleName = "com.github.bumptech.glide:glide"),

        //        compose(moduleName = "com.github.bumptech.glide:compose"),
        compiler(moduleName = "com.github.bumptech.glide:compiler"),
        glfdecoder(moduleName = "com.github.bumptech.glide:glfdecoder"),
        disklrucache(moduleName = "com.github.bumptech.glide:disklrucache"),
        volley_integration(moduleName = "com.github.bumptech.glide:volley-integration"),
        sqljournaldiskcache(moduleName = "com.github.bumptech.glide:sqljournaldiskcache"),
        recyclerview_integration(moduleName = "com.github.bumptech.glide:recyclerview-integration"),
        okhttp4_integration(moduleName = "com.github.bumptech.glide:okhttp4-integration"),
        okhttp3_integration(moduleName = "com.github.bumptech.glide:okhttp3-integration"),
        okhttp_integration(moduleName = "com.github.bumptech.glide:okhttp-integration"),

        //        ktx(moduleName = "com.github.bumptech.glide:ktx"),
        gifencoder_integration(moduleName = "com.github.bumptech.glide:gifencoder-integration"),
        cronet_integration(moduleName = "com.github.bumptech.glide:cronet-integration"),
        concurrent_integration(moduleName = "com.github.bumptech.glide:concurrent-integration"),
        avif_integration(moduleName = "com.github.bumptech.glide:avif-integration"),
        ksp(moduleName = "com.github.bumptech.glide:ksp"),
        mocks(moduleName = "com.github.bumptech.glide:mocks"),
        annotations(moduleName = "com.github.bumptech.glide:annotations");

        override fun withVersion(version: String): String = moduleName joinWithColon version

    }

    @Deprecated("The use of this API will be deprecated in version 2024.01.01")
    @InternalEpitApi
    enum class GlideKtx(
        internal val moduleName: String
    ) : MainGlide {
        compose(moduleName = "com.github.bumptech.glide:compose"),
        ktx(moduleName = "com.github.bumptech.glide:ktx");

        override fun withVersion(version: String): String = moduleName joinWithColon version
    }

}

private typealias MainGlide = Glide
