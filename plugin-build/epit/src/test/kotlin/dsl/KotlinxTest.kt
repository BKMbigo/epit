package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.kotlinx.KotlinX
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class KotlinxTest {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `androidx block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                kotlinx {
                    atomicfu("1.0.0") {
                        implementation(KotlinX.AtomicFU.atomicfu)
                        customImplementation(KotlinX.AtomicFU.atomicfu.dependencyAsString)
                        customVersionImplementation(KotlinX.AtomicFU.atomicfu.dependencyAsString("1.1.1"))
                    }
                    collectionsImmutable("1.0.0") {
                        implementation(KotlinX.CollectionsImmutable.collections_immutable)
                        customImplementation(KotlinX.CollectionsImmutable.collections_immutable.dependencyAsString)
                        customVersionImplementation(
                            KotlinX.CollectionsImmutable.collections_immutable.dependencyAsString(
                                "1.1.1"
                            )
                        )
                    }
                    coroutines("1.0.0") {
                        implementation(KotlinX.Coroutines.coroutines_core)
                        customImplementation(KotlinX.Coroutines.coroutines_core.dependencyAsString)
                        customVersionImplementation(KotlinX.Coroutines.coroutines_core.dependencyAsString("1.1.1"))
                    }
                    datetime("1.0.0") {
                        implementation(KotlinX.Datetime.datetime)
                        customImplementation(KotlinX.Datetime.datetime.dependencyAsString)
                        customVersionImplementation(KotlinX.Datetime.datetime.dependencyAsString("1.1.1"))
                    }
                    serialization("1.0.0") {
                        implementation(KotlinX.Serialization.serialization_core)
                        customImplementation(KotlinX.Serialization.serialization_core.dependencyAsString)
                        customVersionImplementation(KotlinX.Serialization.serialization_core.dependencyAsString("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            KotlinX.AtomicFU.atomicfu.moduleName,
            KotlinX.CollectionsImmutable.collections_immutable.moduleName,
            KotlinX.Coroutines.coroutines_core.moduleName,
            KotlinX.Datetime.datetime.moduleName,
            KotlinX.Serialization.serialization_core.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "kotlinx dependencies using implementation() differ"
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "koltinx dependencies using implementation(dependency.dependency) differ"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "kotlinx dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
