package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDragAndDropTests {

    @Test
    fun `verify that androidx dragAndDrop block implementation adds dependencies`() = testEpitDsl(
        "androidx dragAndDrop",
        expectedModuleNames = listOf(
            AndroidX.DragAndDrop.draganddrop.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                draganddrop("1.0.0") {
                    implementation(Epit.draganddrop)
                    customVersionImplementation(Epit.draganddrop("1.1.2"))
                }
            }
        }
    }

}
