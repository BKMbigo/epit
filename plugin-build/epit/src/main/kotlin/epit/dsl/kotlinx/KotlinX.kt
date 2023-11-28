package epit.dsl.kotlinx

import epit.EpitDependency
import epit.annotations.ExperimentalEpitApi

@ExperimentalEpitApi
interface KotlinX : EpitDependency {

    enum class AtomicFU(
        internal val moduleName: String
    ) : KotlinX {
        atomicfu(moduleName = "org.jetbrains.kotlinx:atomicfu")
    }

    enum class CollectionsImmutable(
        internal val moduleName: String
    ) : KotlinX {
        collections_immutable(moduleName = "org.jetbrains.kotlinx:kotlinx-collections-immutable")
    }

    @ExperimentalEpitApi
    enum class Coroutines(
        internal val moduleName: String
    ) : KotlinX {
        coroutines_core(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-core"),
        coroutines_android(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-android"),
        coroutines_debug(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-debug"),
        coroutines_guava(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-guava"),
        coroutines_javafx(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-javafx"),
        coroutines_jdk9(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk9"),
        coroutines_play_services(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services"),
        coroutines_reactive(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive"),
        coroutines_rx2(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2"),
        coroutines_rx3(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-rx3"),
        coroutines_slf4j(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-slf4j"),
        coroutines_swing(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-swing"),
        coroutines_test(moduleName = "org.jetbrains.kotlinx:kotlinx-coroutines-test")
    }

    enum class Datetime(
        internal val moduleName: String
    ) : KotlinX {
        datetime(moduleName = "org.jetbrains.kotlinx:kotlinx-datetime")
    }

    enum class Serialization(
        internal val moduleName: String
    ) : KotlinX {
        serialization_core(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-core"),
        serialization_json(moduleName = "org.jetbrains.kotlinx:kotlinx-serialization-json")
    }
}
