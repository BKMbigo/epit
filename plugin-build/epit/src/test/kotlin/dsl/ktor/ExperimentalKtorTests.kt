package dsl.ktor

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.ktor.EpitExperimentalKtorScope
import epit.dsl.ktor.Ktor
import epit.utils.joinWithColon
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
                ktor("1.0.0") { /* Dependencies */ }
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


        project.dependencies {
            epitPreview {
                ktor("1.0.0") {
                    implementation(Ktor.Ktor.ktor_io)
                }
            }
        }

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            Ktor.Ktor.ktor_io.moduleName,
            "ktor block implementation does not add dependencies to the configuration"
        )
    }

    @Test
    fun `verify that ktor block implementation adds the correct version of dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")


        project.dependencies {
            epitPreview {
                ktor("1.0.0") {
                    implementation(Ktor.Ktor.ktor_client_android)
                }
            }
        }

        assertContains(
            config.dependencies.map { it.version },
            "1.0.0",
            "ktor block implementation does not add dependencies to the configuration"
        )
    }

    @Test
    fun `verify that ktor block val dependency returns the module name`() {
        var dependency = ""

        EpitExperimentalKtorScope("1.0.0").apply {
            dependency = Ktor.Ktor.ktor_io.dependency
        }

        assertEquals(
            Ktor.Ktor.ktor_io.moduleName,
            dependency
        )
    }


    @Test
    fun `verify that ktor block val dependency returns the dependency with a different version`() {
        var dependency: String

        EpitExperimentalKtorScope("1.0.0").apply {
            dependency = Ktor.Ktor.ktor_io.dependency("1.1.2")
        }

        assertEquals(
            Ktor.Ktor.ktor_io.moduleName joinWithColon "1.1.2",
            dependency
        )
    }

    @Test
    fun `verify that ktor block val bom returns the bom's module name`() {
        var bomName: String

        EpitExperimentalKtorScope("1.0.0").apply {
            bomName = bom
        }

        assertEquals(
            EpitExperimentalKtorScope.ktor_bom_module_name joinWithColon "1.0.0",
            bomName
        )
    }

    @Test
    fun `verify that ktor block fun bom returns the bom with different version`() {
        var bomName: String

        EpitExperimentalKtorScope("1.0.0").apply {
            bomName = bom("1.1.2")
        }

        assertEquals(
            EpitExperimentalKtorScope.ktor_bom_module_name joinWithColon "1.1.2",
            bomName
        )
    }
}
