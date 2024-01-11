package dsl.ktor

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.Ktor
import epit.dsl.epitPreview
import epit.dsl.ktor.EpitExperimentalKtorScope
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

@OptIn(ExperimentalEpitApi::class)
class ExperimentalKtorTests {

    @Test
    fun `verify that ktor block automatically adds bom as platform dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")


        project.dependencies {
            epitPreview {
                ktorBom("1.0.0") { /* Dependencies */ }
            }
        }

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            EpitExperimentalKtorScope.ktor_bom_module_name,
            "ktor block does not add bom as dependency"
        )

        assertEquals(
            config.dependencies.size,
            1,
            "ktor block other dependency other than bom"
        )

        assertContentEquals(
            config.dependencies.map { it.version },
            listOf("1.0.0"),
            "ktor block does not add the correct version of bom"
        )
    }

    @Test
    fun `verify that ktor block implementation adds the correct dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customImplementation(dependency: Dependency) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        fun DependencyHandlerScope.customVersionImplementation(dependency: Dependency) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                ktorBom("1.0.0") {
                    implementation(Epit.ktor_io)

                    customImplementation(bom)
                    customImplementation(Epit.ktor_io)

                    customVersionImplementation(bom("1.1.2"))
                    customVersionImplementation(Epit.ktor_io)

                }
            }
        }

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            Ktor.ktor_io.moduleName,
            "ktor block implementation does not add dependencies to the configuration"
        )

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            "io.ktor:ktor-bom",
            "ktor block implementation does not add dependencies to the configuration"
        )

        assertContains(
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            Ktor.ktor_io.moduleName,
            "ktor block implementation does not add dependencies to the configuration"
        )

        assertContains(
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "io.ktor:ktor-bom",
            "ktor block implementation does not add dependencies to the configuration"
        )

        assertContains(
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            Ktor.ktor_io.moduleName,
            "ktor block implementation does not add dependencies to the configuration"
        )

        assertContains(
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "io.ktor:ktor-bom",
            "ktor block implementation does not add dependencies to the configuration"
        )
    }
}
