package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxMedia2Tests {

    @Test
    fun `verify that androidx media2 block implementation adds dependencies`() = testEpitDsl(
        "androidx media2",
        expectedModuleNames = listOf(
            AndroidX.Media2.media2_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                media2("1.0.0") {
                    implementation(Epit.media2_common)
                    customVersionImplementation(Epit.media2_common("1.1.2"))
                }
            }
        }
    }

}
