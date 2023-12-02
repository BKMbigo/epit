package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.coil.Coil
import epit.dsl.coil.EpitCoilScope
import epit.dsl.epitPreview
import epit.utils.joinWithColon
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

@OptIn(ExperimentalEpitApi::class)
class CoilTests {

    @Test
    fun `verify that coil block automatically adds bom as platform dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                coil("1.0.0") { /* Dependencies */ }
            }
        }

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            Coil.coil_bom.moduleName,
            "coil block does not add bom as dependency"
        )

        assertEquals(
            config.dependencies.size,
            1,
            "coil block other dependency other than bom"
        )

        assertContentEquals(
            config.dependencies.map { it.version },
            listOf("1.0.0"),
            "coil block does not add the correct version of bom"
        )
    }

    @Test
    fun `verify that coil block implementation adds the correct dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")


        project.dependencies {
            epitPreview {
                coil("1.0.0") {
                    implementation(Coil.coil)
                }
            }
        }

        assertContains(
            config.dependencies.map { "${it.group}:${it.name}" },
            Coil.coil.moduleName,
            "coil block implementation does not add dependencies to the configuration"
        )
    }

    @Test
    fun `verify that coil block implementation adds the correct version of dependency`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")


        project.dependencies {
            epitPreview {
                coil("1.0.0") {
                    implementation(Coil.coil)
                }
            }
        }

        assertContains(
            config.dependencies.map { it.version },
            "1.0.0",
            "coil block implementation does not add dependencies to the configuration"
        )
    }

    @Test
    fun `verify that coil block val dependency returns the module name`() {
        var dependency = ""

        EpitCoilScope("1.0.0").apply {
            dependency = Coil.coil.dependency
        }

        assertEquals(
            Coil.coil.moduleName,
            dependency
        )
    }


    @Test
    fun `verify that coil block val dependency returns the dependency with a different version`() {
        var dependency = ""

        EpitCoilScope("1.0.0").apply {
            dependency = Coil.coil.dependency("1.1.2")
        }

        assertEquals(
            Coil.coil.moduleName joinWithColon "1.1.2",
            dependency
        )
    }

    @Test
    fun `verify that coil block val bom returns the bom's module name`() {
        var bomName = ""

        EpitCoilScope("1.0.0").apply {
            bomName = bom
        }

        assertEquals(
            Coil.coil_bom.moduleName joinWithColon "1.0.0",
            bomName
        )
    }

    @Test
    fun `verify that coil block fun bom returns the bom with different version`() {
        var bomName = ""

        EpitCoilScope("1.0.0").apply {
            bomName = bom("1.1.2")
        }

        assertEquals(
            Coil.coil_bom.moduleName joinWithColon "1.1.2",
            bomName
        )
    }
}
