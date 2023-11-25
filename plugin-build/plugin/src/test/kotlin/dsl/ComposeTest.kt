package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.compose
import epit.dsl.compose.Compose
import epit.dsl.epitDependencies
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ComposeTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `compose block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")
        val conf = project.configurations.create("implementation")

        project.dependencies {
            epitDependencies {
                compose("2023.10.01") {
                    implementation(Compose.ComposeRuntime.runtime)
                }
            }
        }

        val expectedDependencies = listOf(
            Compose.compose_bom.moduleName,
            Compose.ComposeRuntime.runtime.moduleName
        )

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
