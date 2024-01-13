package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCustomViewTests {

    @Test
    fun `verify that androidx custom view block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.CustomView.customview.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                customview("1.0.0") {
                    implementation(Epit.customview)
                    customVersionImplementation(Epit.customview("1.1.2"))
                }
            }
        }
    }

}
