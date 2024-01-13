package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxWebkitTests {

    @Test
    fun `verify that androidx webkit block implementation adds dependencies`() = testEpitDsl(
        "androidx webkit",
        expectedModuleNames = listOf(
            AndroidX.Webkit.webkit.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                webkit("1.0.0") {
                    implementation(Epit.webkit)
                    customVersionImplementation(Epit.webkit("1.1.2"))
                }
            }
        }
    }

}
