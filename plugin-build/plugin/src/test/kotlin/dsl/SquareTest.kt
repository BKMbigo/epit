package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitDependencies
import epit.dsl.squareup.LeakCanary
import epit.dsl.squareup.OkHttp3
import epit.dsl.squareup.Picasso
import epit.dsl.squareup.Retrofit2
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
            epitDependencies {
                squareup {
                    leakcanary("1.0.0") {
                        implementation(LeakCanary.leakcanary_android)
                        customImplementation(LeakCanary.leakcanary_android.dependency)
                        customVersionImplementation(LeakCanary.leakcanary_android.dependency("1.1.1"))
                    }
                    okhttp3("1.0.0") {
                        implementation(OkHttp3.okhttp)

                        customImplementation(platform(bom))
                        customImplementation(OkHttp3.okhttp.dependency)

                        customVersionImplementation(platform(bom("1.1.1")))
                        customVersionImplementation(OkHttp3.okhttp.dependency("1.1.1"))
                    }
                    picasso("1.0.0") {
                        implementation(Picasso.picasso)
                        customImplementation(Picasso.picasso.dependency)
                        customVersionImplementation(Picasso.picasso.dependency("1.1.1"))
                    }
                    retrofit2("1.0.0") {
                        implementation(Retrofit2.retrofit)
                        customImplementation(Retrofit2.retrofit.dependency)
                        customVersionImplementation(Retrofit2.retrofit.dependency("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            LeakCanary.leakcanary_android.moduleName,
            OkHttp3.okhttp_bom.moduleName,
            OkHttp3.okhttp.moduleName,
            Picasso.picasso.moduleName,
            Retrofit2.retrofit.moduleName
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
