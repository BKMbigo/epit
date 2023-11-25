package epit.dsl.androidx

import org.gradle.kotlin.dsl.DependencyHandlerScope


enum class Paging(
    internal val moduleName: String
) : AndroidXDependencies {
    paging_common(moduleName = "androidx.paging:paging-common"),

    //    paging_common_android(moduleName = "androidx.paging:paging-common-android"),
//    paging_common_iosarm64(moduleName = "androidx.paging:paging-common-iosarm64"),
//    paging_common_iossimulatorarm64(moduleName = "androidx.paging:paging-common-iossimulatorarm64"),
//    paging_common_iosx64(moduleName = "androidx.paging:paging-common-iosx64"),
//    paging_common_jvm(moduleName = "androidx.paging:paging-common-jvm"),
    paging_common_ktx(moduleName = "androidx.paging:paging-common-ktx"),

//    paging_common_linuxx64(moduleName = "androidx.paging:paging-common-linuxx64"),
//    paging_common_macosarm64(moduleName = "androidx.paging:paging-common-macosarm64"),
//    paging_common_macosx64(moduleName = "androidx.paging:paging-common-macosx64"),
    paging_compose(moduleName = "androidx.paging:paging-compose"),
    paging_compose_android(moduleName = "androidx.paging:paging-compose-android"),
    paging_guava(moduleName = "androidx.paging:paging-guava"),
    paging_runtime(moduleName = "androidx.paging:paging-runtime"),
    paging_runtime_ktx(moduleName = "androidx.paging:paging-runtime-ktx"),
    paging_rxjava2(moduleName = "androidx.paging:paging-rxjava2"),
    paging_rxjava2_ktx(moduleName = "androidx.paging:paging-rxjava2-ktx"),
    paging_rxjava3(moduleName = "androidx.paging:paging-rxjava3"),
    paging_testing(moduleName = "androidx.paging:paging-testing"),
//    paging_testing_android(moduleName = "androidx.paging:paging-testing-android"),
//    paging_testing_iosarm64(moduleName = "androidx.paging:paging-testing-iosarm64"),
//    paging_testing_iossimulatorarm64(moduleName = "androidx.paging:paging-testing-iossimulatorarm64"),
//    paging_testing_iosx64(moduleName = "androidx.paging:paging-testing-iosx64"),
//    paging_testing_jvm(moduleName = "androidx.paging:paging-testing-jvm"),
//    paging_testing_linuxx64(moduleName = "androidx.paging:paging-testing-linuxx64"),
//    paging_testing_macosarm64(moduleName = "androidx.paging:paging-testing-macosarm64"),
//    paging_testing_macosx64(moduleName = "androidx.paging:paging-testing-macosx64")
}

class EpitAndroidXPagingScope(
    private val androidXPagingVersion: String
) {
    val Paging.dependency
        get(): String = "${this.moduleName}:${androidXPagingVersion}"

    fun DependencyHandlerScope.implementation(paging: Paging) {
        add("implementation", paging.dependency)
    }
}
