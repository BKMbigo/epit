package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitDependencies
import epit.dsl.squareup
import epit.dsl.squareup.LeakCanary
import epit.dsl.squareup.OkHttp3
import epit.dsl.squareup.Picasso
import epit.dsl.squareup.Retrofit2
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
        val conf = project.configurations.create("implementation")


        project.dependencies {
            epitDependencies {
                squareup {
                    leakcanary("1.0.0") {
                        implementation(LeakCanary.leakcanary_android)
                    }
                    okhttp3("1.0.0") {
                        implementation(OkHttp3.okhttp)
                    }
                    picasso("1.0.0") {
                        implementation(Picasso.picasso)
                    }
                    retrofit2("1.0.0") {
                        implementation(Retrofit2.retrofit)
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

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
