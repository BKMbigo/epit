package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxGridLayoutTests {

    @Test
    fun `verify that androidx gridLayout block implementation adds dependencies`() = testEpitDsl(
        "androidx gridLayout",
        expectedModuleNames = listOf(
            AndroidX.GridLayout.gridlayout.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                gridlayout("1.0.0") {
                    implementation(Epit.gridlayout)
                    customVersionImplementation(Epit.gridlayout("1.1.2"))
                }
            }
        }
    }

}
