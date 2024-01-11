package dsl.raamcosta

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Raamcosta
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

@OptIn(ExperimentalEpitApi::class)
class ComposeDestinationsTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide block implementation adds dependencies`() {
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
                raamcosta {
                    composeDestinations("1.0.0") {
                        implementation(Epit.core)
                        customVersionImplementation(Epit.core("1.1.2"))
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

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "glide custom implementation does not add dependencies"
        )

        assertTrue(
            customVersionConfig.dependencies.map { it.version }.all { it == "1.1.2" },
            "glide custom block does not add the custom version of dependencies"
        )
    }

}
