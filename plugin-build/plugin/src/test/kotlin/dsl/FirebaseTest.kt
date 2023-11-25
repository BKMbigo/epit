package dsl

import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitDependencies
import epit.dsl.firebase
import epit.dsl.firebase.Firebase
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class FirebaseTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `firebase block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("com.github.bkmbigo.epit")
        val conf = project.configurations.create("implementation")

        project.dependencies {
            epitDependencies {
                firebase("32.6.0") {
                    implementation(Firebase.firebase_firestore)
                }
            }
        }

        val expectedDependencies = listOf(
            Firebase.firebase_bom.moduleName,
            Firebase.firebase_firestore.moduleName
        )

        assertContentEquals(expectedDependencies, conf.dependencies.map { "${it.group}:${it.name}" })
    }
}
