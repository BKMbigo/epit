package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitDependencies
import epit.dsl.kotlinx
import epit.dsl.kotlinx.*
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class KotlinxTest {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `androidx block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.github.bkmbigo.epit")
        val conf = project.configurations.create("implementation")


        project.dependencies {
            epitDependencies {
                kotlinx {
                    atomicfu("1.0.0") {
                        implementation(AtomicFU.atomicfu)
                    }
                    collectionsImmutable("1.0.0") {
                        implementation(CollectionsImmutable.collections_immutable)
                    }
                    coroutines("1.0.0") {
                        implementation(Coroutines.coroutines_core)
                    }
                    datetime("1.0.0") {
                        implementation(Datetime.datetime)
                    }
                    serialization("1.0.0") {
                        implementation(Serialization.serialization_core)
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

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
