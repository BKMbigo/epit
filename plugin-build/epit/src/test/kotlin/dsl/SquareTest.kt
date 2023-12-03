package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.squareup.SquareUp
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class SquareTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `squareup block adds dependencies`() {
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
                squareup {
                    leakcanary("1.0.0") {
                        implementation(SquareUp.LeakCanary.leakcanary_android)
                        customImplementation(SquareUp.LeakCanary.leakcanary_android.dependencyAsString)
                        customVersionImplementation(SquareUp.LeakCanary.leakcanary_android.dependencyAsString("1.1.1"))
                    }
                    okhttp3Bom("1.0.0") {
                        implementation(SquareUp.OkHttp3.okhttp)

                        customImplementation(bom)
                        customImplementation(SquareUp.OkHttp3.okhttp.dependencyAsString)

                        customVersionImplementation(bom("1.1.1"))
                        customVersionImplementation(SquareUp.OkHttp3.okhttp.dependencyAsString("1.1.1"))
                    }
                    picasso("1.0.0") {
                        implementation(SquareUp.Picasso.picasso)
                        customImplementation(SquareUp.Picasso.picasso.dependencyAsString)
                        customVersionImplementation(SquareUp.Picasso.picasso.dependencyAsString("1.1.1"))
                    }
                    retrofit2("1.0.0") {
                        implementation(SquareUp.Retrofit2.retrofit)
                        customImplementation(SquareUp.Retrofit2.retrofit.dependencyAsString)
                        customVersionImplementation(SquareUp.Retrofit2.retrofit.dependencyAsString("1.1.1"))
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
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "square dependencies using implementation(dependency.dependency) differ"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "square dependencies using implementation(dependency.dependency('version') differ"
        )
    }
}
