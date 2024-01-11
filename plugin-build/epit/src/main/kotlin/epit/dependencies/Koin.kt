package epit.dependencies

import epit.EpitDependency


internal enum class Koin(
    internal val moduleName: String
) : EpitDependency {
    koin_bom(moduleName = "io.insert-koin:koin-bom"),
    koin_core(moduleName = "io.insert-koin:koin-core"),
    koin_core_coroutines(moduleName = "io.insert-koin:koin-core-coroutines"),
    koin_test(moduleName = "io.insert-koin:koin-test"),
    koin_android(moduleName = "io.insert-koin:koin-android"),
    koin_android_test(moduleName = "io.insert-koin:koin-android-test"),
    koin_android_compat(moduleName = "io.insert-koin:koin-android-compat"),
    koin_androidx_navigation(moduleName = "io.insert-koin:koin-androidx-navigation"),
    koin_androidx_workmanager(moduleName = "io.insert-koin:koin-androidx-workmanager"),
    koin_compose(moduleName = "io.insert-koin:koin-compose"),
    koin_androidx_compose(moduleName = "io.insert-koin:koin-androidx-compose"),
    koin_androidx_compose_navigation(moduleName = "io.insert-koin:koin-androidx-compose-navigation"),
    koin_ktor(moduleName = "io.insert-koin:koin-ktor"),
    koin_logger_slf4j(moduleName = "io.insert-koin:koin-logger-slf4j");
}
