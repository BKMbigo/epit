package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitDependencies
import epit.dsl.koin
import epit.dsl.koin.Koin
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class KoinTest {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `koin block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.github.bkmbigo.epit")
        val conf = project.configurations.create("implementation")

        project.dependencies {
            epitDependencies {
                koin("3.5.1") {
                    implementation(Koin.koin_android)
                }
            }
        }

        val expectedDependencies = listOf(
            Koin.koin_bom.moduleName,
            Koin.koin_android.moduleName
        )

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
