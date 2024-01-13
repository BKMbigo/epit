package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxMediaRouterTests {

    @Test
    fun `verify that androidx media router block implementation adds dependencies`() = testEpitDsl(
        "androidx media router",
        expectedModuleNames = listOf(
            AndroidX.MediaRouter.mediarouter.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                mediarouter("1.0.0") {
                    implementation(Epit.mediarouter)
                    customVersionImplementation(Epit.mediarouter("1.1.2"))
                }
            }
        }
    }

}
