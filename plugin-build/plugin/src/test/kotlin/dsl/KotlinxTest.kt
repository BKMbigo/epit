package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.kotlinx.*
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
                        implementation(AtomicFU.atomicfu)
                        customImplementation(AtomicFU.atomicfu.dependency)
                        customVersionImplementation(AtomicFU.atomicfu.dependency("1.1.1"))
                    }
                    collectionsImmutable("1.0.0") {
                        implementation(CollectionsImmutable.collections_immutable)
                        customImplementation(CollectionsImmutable.collections_immutable.dependency)
                        customVersionImplementation(CollectionsImmutable.collections_immutable.dependency("1.1.1"))
                    }
                    coroutines("1.0.0") {
                        implementation(Coroutines.coroutines_core)
                        customImplementation(Coroutines.coroutines_core.dependency)
                        customVersionImplementation(Coroutines.coroutines_core.dependency("1.1.1"))
                    }
                    datetime("1.0.0") {
                        implementation(Datetime.datetime)
                        customImplementation(Datetime.datetime.dependency)
                        customVersionImplementation(Datetime.datetime.dependency("1.1.1"))
                    }
                    serialization("1.0.0") {
                        implementation(Serialization.serialization_core)
                        customImplementation(Serialization.serialization_core.dependency)
                        customVersionImplementation(Serialization.serialization_core.dependency("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AtomicFU.atomicfu.moduleName,
            CollectionsImmutable.collections_immutable.moduleName,
            Coroutines.coroutines_core.moduleName,
            Datetime.datetime.moduleName,
            Serialization.serialization_core.moduleName
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
