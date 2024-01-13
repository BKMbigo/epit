package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

@OptIn(ExperimentalEpitApi::class)
class AndroidxCameraTests {

    @Test
    fun `verify that androidx camera block implementation adds dependencies`() = testEpitDsl(
        "androidx camera",
        expectedModuleNames = listOf(
            AndroidX.Camera.camera_camera2.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                camera("1.0.0") {
                    implementation(Epit.camera_camera2)
                    customVersionImplementation(Epit.camera_camera2("1.1.2"))
                }
            }
        }
    }

}
