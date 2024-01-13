package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxAutofillTests {

    @Test
    fun `verify that androidx autofill block implementation adds dependencies`() = testEpitDsl(
        "androidx autofill",
        expectedModuleNames = listOf(
            AndroidX.Autofill.autofill.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                autofill("1.0.0") {
                    implementation(Epit.autofill)
                    customVersionImplementation(Epit.autofill("1.1.2"))
                }
            }
        }
    }

}
