package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidXComposeUITests {

    @Test
    fun `verify that androidx compose ui block implementation adds dependencies`() = testEpitDsl(
        "androidx compose ui",
        expectedModuleNames = listOf(
            AndroidX.Compose.UI.ui.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    ui("1.0.0") {
                        implementation(Epit.ui)
                        customVersionImplementation(Epit.ui("1.1.2"))
                    }
                }
            }
        }
    }

}
