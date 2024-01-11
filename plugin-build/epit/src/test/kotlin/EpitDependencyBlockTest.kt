import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class EpitDependencyBlockTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `epitDependencies block is available after adding project`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")
        project.configurations.create("implementation")
        project.configurations.create("kapt")
        project.configurations.create("ksp")
        /* Cases where there is a non-default configuration, such as using build variant configurations */
        project.configurations.create("debugImplementation")

        fun DependencyHandler.implementation(dependencyNotation: Any) {
            add("implementation", dependencyNotation)
        }

        assertDoesNotThrow {
            project.dependencies {
                epitPreview {
                    androidx {
                        room("1.0.0") {
                            implementation(Epit.room_runtime)
                            add("debugImplementation", Epit.room_runtime)
                        }
                    }
                    koinBom("3.5.1") { }
                    coilBom("1.9.9") { }
                    google {
                        firebaseBom("32.6.0") { }
                    }
                    kotlinx {
                        coroutines("1.0.0") {

                        }
                    }
                    squareup {
                        retrofit2("1.0.0") {
                            implementation(Epit.retrofit)
                        }
                    }
                    voyager("1.0.0") {
                        implementation(Epit.voyager_navigator)
                    }
                }
            }
        }
    }
}
