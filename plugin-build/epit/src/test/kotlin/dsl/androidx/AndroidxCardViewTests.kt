package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCardViewTests {

    @Test
    fun `verify that androidx cardview block implementation adds dependencies`() = testEpitDsl(
        "androidx annotation",
        expectedModuleNames = listOf(
            AndroidX.CardView.cardview.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                cardview("1.0.0") {
                    implementation(Epit.cardview)
                    customVersionImplementation(Epit.cardview("1.1.2"))
                }
            }
        }
    }

}
