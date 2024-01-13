package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxPreferenceTests {

    @Test
    fun `verify that androidx preference block implementation adds dependencies`() = testEpitDsl(
        "androidx preference",
        expectedModuleNames = listOf(
            AndroidX.Preference.preference.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                preference("1.0.0") {
                    implementation(Epit.preference)
                    customVersionImplementation(Epit.preference("1.1.2"))
                }
            }
        }
    }

}
