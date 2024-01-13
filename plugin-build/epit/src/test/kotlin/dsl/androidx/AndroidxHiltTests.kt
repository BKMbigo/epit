package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxHiltTests {

    @Test
    fun `verify that androidx hilt block implementation adds dependencies`() = testEpitDsl(
        "androidx hilt",
        expectedModuleNames = listOf(
            AndroidX.Hilt.hilt_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                hilt("1.0.0") {
                    implementation(Epit.hilt_common)
                    customVersionImplementation(Epit.hilt_common("1.1.2"))
                }
            }
        }
    }

}
