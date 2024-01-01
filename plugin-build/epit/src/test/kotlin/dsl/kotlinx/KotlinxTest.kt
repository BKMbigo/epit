package dsl.kotlinx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.kotlinx.KotlinX
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class KotlinxTest {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `androidx block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                kotlinx {
                    atomicfu("1.0.0") {
                        implementation(Epit.atomicfu)
                        customVersionImplementation(Epit.atomicfu("1.1.1"))
                    }
                    collectionsImmutable("1.0.0") {
                        implementation(Epit.collections_immutable)
                        customVersionImplementation(Epit.collections_immutable("1.1.1"))
                    }
                    coroutines("1.0.0") {
                        implementation(Epit.coroutines_core)
                        customVersionImplementation(Epit.coroutines_core("1.1.1"))
                    }
                    datetime("1.0.0") {
                        implementation(Epit.datetime)
                        customVersionImplementation(Epit.datetime("1.1.1"))
                    }
                    serialization("1.0.0") {
                        implementation(Epit.serialization_core)
                        customVersionImplementation(Epit.serialization_core("1.1.1"))
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
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "kotlinx dependencies using implementation(dependency.dependency('version') differ"
        )

        assertTrue(
            customVersionConfig.dependencies.map { it.version }.all { it == "1.1.1" },
            "kotlinx dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
