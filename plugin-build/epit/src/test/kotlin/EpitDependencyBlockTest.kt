import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import epit.dsl.squareup.SquareUp
import epit.dsl.voyager.Voyager
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

        assertDoesNotThrow {
            project.dependencies {
                epitPreview {
                    androidx {
                        room("1.0.0") {
                            implementation(AndroidX.Room.room_runtime)
                            add("debugImplementation", AndroidX.Room.room_runtime.dependencyAsString)
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
                            implementation(SquareUp.Retrofit2.retrofit)
                        }
                    }
                    voyager("1.0.0") {
                        implementation(Voyager.voyager_navigator)
                    }
                }
            }
        }
    }
}
