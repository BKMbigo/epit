import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import epit.dsl.squareup.SquareUp
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
                            kapt(AndroidX.Room.room_compiler)
                            ksp(AndroidX.Room.room_compiler)
                            add("debugImplementation", AndroidX.Room.room_runtime.dependency)
                        }
                    }
                    koin("3.5.1") { }
                    firebase("32.6.0") { }
                    kotlinx {
                        coroutines("1.0.0") {

                        }
                    }
                    squareup {
                        retrofit2("1.0.0") {
                            implementation(SquareUp.Retrofit2.retrofit)
                        }
                    }
                }
            }
        }
    }
}
