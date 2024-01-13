package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxComposeAnimationTests {

    @Test
    fun `verify that androidx compose animation block implementation adds dependencies`() = testEpitDsl(
        "androidx compose animation",
        expectedModuleNames = listOf(
            AndroidX.Compose.Animation.animation.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    animation("1.0.0") {
                        implementation(Epit.animation)
                        customVersionImplementation(Epit.animation("1.1.2"))
                    }
                }
            }
        }
    }

}
