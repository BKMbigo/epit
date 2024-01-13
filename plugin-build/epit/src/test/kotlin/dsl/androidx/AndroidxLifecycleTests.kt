package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxLifecycleTests {

    @Test
    fun `verify that androidx lifecycle block implementation adds dependencies`() = testEpitDsl(
        "androidx lifecycle",
        expectedModuleNames = listOf(
            AndroidX.Lifecycle.lifecycle_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                lifecycle("1.0.0") {
                    implementation(Epit.lifecycle_common)
                    customVersionImplementation(Epit.lifecycle_common("1.1.2"))
                }
            }
        }
    }

}
