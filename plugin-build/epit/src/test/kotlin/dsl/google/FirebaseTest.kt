package dsl.google

import Epit
import epit.annotations.ExperimentalEpitApi
import epit.dsl.epitPreview
import epit.dsl.google.Google
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class FirebaseTest {
    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `firebase block adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")
        val customConfig = project.configurations.create("customImplementation")
        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.implementation(dependency: String) {
            add("implementation", dependency)
        }

        fun DependencyHandlerScope.customImplementation(dependency: Dependency) {
            add("customImplementation", dependency)
        }

        fun DependencyHandlerScope.customImplementation(dependency: String) {
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
                google {
                    firebaseBom("32.6.0") {
                        implementation(Epit.firebase_firestore)

                        customImplementation(bom)
                        customImplementation(Epit.firebase_firestore)

                        customVersionImplementation(bom("1.1.1"))
                        customVersionImplementation(Epit.firebase_firestore("1.1.1"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            Google.Firebase.firebase_bom.moduleName,
            Google.Firebase.firebase_firestore.moduleName
        )


        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "firebase block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "firebase.dependency block does not add dependencies as expected"
        )

        assertContentEquals(
            expectedDependencies,
            customVersionConfig.dependencies.map { "${it.group}:${it.name}" },
            "firebase.dependency(version: string) block does not add dependencies as expected"
        )
    }
}
