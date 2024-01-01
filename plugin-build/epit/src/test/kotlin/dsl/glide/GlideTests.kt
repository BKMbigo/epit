package dsl.glide

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.glide.Glide
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class GlideTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide val adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                glide {
                    glide("1.0.0") {
                        implementation(Epit.glide)
                    }
                    glideKtx("1.0.0") {
                        implementation(Epit.compose)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Glide.Glide.glide.moduleName,
            Glide.GlideKtx.compose.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "glide implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide val adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                glide {
                    glide("1.0.0") {
                        implementation(Epit.glide)
                    }
                    glideKtx("1.0.0") {
                        implementation(Epit.compose)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Glide.Glide.glide.moduleName,
            Glide.GlideKtx.compose.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "glide implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide block fun() adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                glide {
                    glide("1.0.0") {
                        customImplementation(Epit.glide("1.1.2"))
                    }
                    glideKtx("1.0.0") {
                        customImplementation(Epit.compose("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Glide.Glide.glide.moduleName,
            Glide.GlideKtx.compose.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "glide val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that glide block fun() adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                glide {
                    glide("1.0.0") {
                        customVersionImplementation(Epit.glide("1.1.2"))
                    }
                    glideKtx("1.0.0") {
                        customVersionImplementation(Epit.compose("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Glide.Glide.glide.moduleName,
            Glide.GlideKtx.compose.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "glide val dependency does not add dependencies in the correct version"
        )
    }
}
