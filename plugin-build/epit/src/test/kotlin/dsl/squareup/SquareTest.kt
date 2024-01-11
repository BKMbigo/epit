package dsl.squareup

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.SquareUp
import epit.dsl.epitPreview
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertTrue

class SquareTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `squareup block adds dependencies`() {
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
                squareup {
                    leakcanary("1.0.0") {
                        implementation(Epit.leakcanary_android)
                        customVersionImplementation(Epit.leakcanary_android("1.1.1"))
                    }
                    okhttp3Bom("1.0.0") {
                        implementation(Epit.okhttp)

                        customImplementation(bom)
                        customImplementation(Epit.okhttp)

                        customVersionImplementation(bom("1.1.1"))
                        customVersionImplementation(Epit.okhttp("1.1.1"))
                    }
                    picasso("1.0.0") {
                        implementation(Epit.picasso)
                        customVersionImplementation(Epit.picasso("1.1.1"))
                    }
                    retrofit2("1.0.0") {
                        implementation(Epit.retrofit)
                        customVersionImplementation(Epit.retrofit("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            SquareUp.LeakCanary.leakcanary_android.moduleName,
            SquareUp.OkHttp3.okhttp_bom.moduleName,
            SquareUp.OkHttp3.okhttp.moduleName,
            SquareUp.Picasso.picasso.moduleName,
            SquareUp.Retrofit2.retrofit.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "square dependencies using implementation() differ"
        )

        assertContentEquals(
            listOf(
                SquareUp.OkHttp3.okhttp_bom.moduleName,
                SquareUp.OkHttp3.okhttp.moduleName
            ),
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "square dependencies using implementation(dependency.dependency) differ"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "square dependencies using implementation(dependency.dependency('version') differ"
        )

        assertTrue(
            customVersionConfig.dependencies.map { it.version }.all { it == "1.1.1" },
            "square dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
