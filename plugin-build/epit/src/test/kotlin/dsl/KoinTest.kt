package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.koin.Koin
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class KoinTest {

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `koin block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

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
                koin("3.5.1") {
                    implementation(Koin.koin_android)

                    customImplementation(bom)
                    customImplementation(Koin.koin_android.dependencyAsString)

                    customVersionImplementation(bom("1.1.1"))
                    customVersionImplementation(Koin.koin_android.dependencyAsString)
                }
            }
        }

        val expectedDependencies = listOf(
            Koin.koin_bom.moduleName,
            Koin.koin_android.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "compose block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "koin.dependency block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "koin.dependency(version: string) block does not add dependencies as expected"
        )
    }
}
