package dsl.androidx

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXAppcompatTests {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx appcompat block val adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    appcompat("1.0.0") {
                        implementation(Epit.appcompat)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Appcompat.appcompat.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx appcompat implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx appcompat block val adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    appcompat("1.0.0") {
                        implementation(Epit.appcompat)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Appcompat.appcompat.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx appcompat implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx appcompat block fun() adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    appcompat("1.0.0") {
                        customImplementation(Epit.appcompat("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Appcompat.appcompat.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx appcompat val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx appcompat block fun() adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    appcompat("1.0.0") {
                        customVersionImplementation(Epit.appcompat("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Appcompat.appcompat.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx appcompat val dependency does not add dependencies in the correct version"
        )
    }
}
