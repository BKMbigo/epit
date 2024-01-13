package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxMediaTests {

    @Test
    fun `verify that androidx media block implementation adds dependencies`() = testEpitDsl(
        "androidx media",
        expectedModuleNames = listOf(
            AndroidX.Media.media.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                media("1.0.0") {
                    implementation(Epit.media)
                    customVersionImplementation(Epit.media("1.1.2"))
                }
            }
        }
    }

}
