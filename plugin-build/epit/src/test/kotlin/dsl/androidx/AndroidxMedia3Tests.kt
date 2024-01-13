package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import kotlin.test.Test

class AndroidxMedia3Tests {

    @Test
    fun `verify that androidx media3 block implementation adds dependencies`() = testEpitDsl(
        "androidx media3",
        expectedModuleNames = listOf(
            AndroidX.Media3.media3_ui.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                media3("1.0.0") {
                    implementation(Epit.media3_ui)
                    customVersionImplementation(Epit.media3_ui("1.1.2"))
                }
            }
        }
    }

}
