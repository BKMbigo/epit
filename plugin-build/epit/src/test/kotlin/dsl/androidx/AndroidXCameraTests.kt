package dsl.androidx

import epit.annotations.ExperimentalEpitApi
import epit.dsl.androidx.AndroidX
import epit.dsl.epitPreview
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.dependencies
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class AndroidXCameraTests {

    @Test
    fun `verify that androidx camera block implementation adds dependencies`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        implementation(AndroidX.Camera.camera_camera2)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            config.dependencies.map { "${it.group}:${it.name}" },
            "androidx camera implementation does not add dependencies"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx camera block implementation adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val config = project.configurations.create("implementation")

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        implementation(AndroidX.Camera.camera_camera2)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            config.dependencies.map { it.version },
            "androidx camera implementation does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx camera block dependency adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        customImplementation(AndroidX.Camera.camera_camera2.dependency)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx camera val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx camera block dependency adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        customImplementation(AndroidX.Camera.camera_camera2.dependency)
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.0.0" },
            customConfig.dependencies.map { it.version },
            "androidx camera val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx camera block fun dependency adds the correct dependency on custom configuration`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customConfig = project.configurations.create("customImplementation")

        fun DependencyHandlerScope.customImplementation(dependency: String) {
            add("customImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        customImplementation(AndroidX.Camera.camera_camera2.dependency("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            expectedDependencies,
            customConfig.dependencies.map { "${it.group}:${it.name}" },
            "androidx camera val dependency does not add dependencies in the correct version"
        )
    }

    @OptIn(ExperimentalEpitApi::class)
    @Test
    fun `verify that androidx camera block fun dependency adds dependencies in correct version`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("io.github.bkmbigo.epit")

        val customVersionConfig = project.configurations.create("customVersionImplementation")

        fun DependencyHandlerScope.customVersionImplementation(dependency: String) {
            add("customVersionImplementation", dependency)
        }

        project.dependencies {
            epitPreview {
                androidx {
                    camera("1.0.0") {
                        customVersionImplementation(AndroidX.Camera.camera_camera2.dependency("1.1.2"))
                    }
                }
            }
        }

        val expectedDependencies = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )

        assertContentEquals(
            List(expectedDependencies.size) { "1.1.2" },
            customVersionConfig.dependencies.map { it.version },
            "androidx camera val dependency does not add dependencies in the correct version"
        )
    }
}
