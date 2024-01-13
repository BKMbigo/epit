package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxSavedStateTests {

    @Test
    fun `verify that androidx savedState block implementation adds dependencies`() = testEpitDsl(
        "androidx savedState",
        expectedModuleNames = listOf(
            AndroidX.SavedState.savedstate.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                savedstate("1.0.0") {
                    implementation(Epit.savedstate)
                    customVersionImplementation(Epit.savedstate("1.1.2"))
                }
            }
        }
    }

}
