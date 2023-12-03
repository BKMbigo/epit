package dsl.raamcosta

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.raamcosta.EpitComposeDestinationsScope
import epit.dsl.raamcosta.Raamcosta
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

@OptIn(ExperimentalEpitApi::class)
class ComposeDestinationsTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                raamcosta {
                    composeDestinations("1.0.0") {
                        implementation(Raamcosta.ComposeDestinations.core)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Raamcosta.ComposeDestinations.core.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "glide implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that compose destinations block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                raamcosta {
                    composeDestinations("1.0.0") {
                        implementation(Raamcosta.ComposeDestinations.core)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Raamcosta.ComposeDestinations.core.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "glide implementation does not add dependencies in the correct version"
        )
    }

    @Test
    fun `verify that compose destinations block's dependency produces the correct dependency`() {
        var actualDependency: String

        EpitComposeDestinationsScope("1.0.0").apply {
            actualDependency = Raamcosta.ComposeDestinations.core.dependencyAsString
        }

        assertEquals(
            Raamcosta.ComposeDestinations.core.moduleName joinWithColon "1.0.0",
            actualDependency,
            "compose destinations block's Dependency.dependency produces a different dependency"
        )
    }

    @Test
    fun `verify that compose destinations block's dependency() produces the correct dependency`() {
        var actualDependency: String

        EpitComposeDestinationsScope("1.0.0").apply {
            actualDependency = Raamcosta.ComposeDestinations.core.dependencyAsString("1.1.2")
        }

        assertEquals(
            Raamcosta.ComposeDestinations.core.moduleName joinWithColon "1.1.2",
            actualDependency,
            "compose destinations block's Dependency.dependency() produces a different dependency"
        )
    }
}
