package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxComposeFoundationTests {

    @Test
    fun `verify that androidx compose foundation block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.Compose.Foundation.Foundation.foundation.moduleName,
            AndroidX.Compose.Foundation.FoundationText.foundation_text.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    foundation {
                        foundation("1.0.0") {
                            implementation(Epit.foundation)
                            customVersionImplementation(Epit.foundation("1.1.2"))
                        }

                        foundationText("1.0.0") {
                            implementation(Epit.foundation_text)
                            customVersionImplementation(Epit.foundation_text("1.1.2"))
                        }

                    }
                }
            }
        }
    }

}
