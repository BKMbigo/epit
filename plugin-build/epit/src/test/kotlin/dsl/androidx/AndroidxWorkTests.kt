package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxWorkTests {

    @Test
    fun `verify that androidx work block implementation adds dependencies`() = testEpitDsl(
        "androidx work",
        expectedModuleNames = listOf(
            AndroidX.Work.work_gcm.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                work("1.0.0") {
                    implementation(Epit.work_gcm)
                    customVersionImplementation(Epit.work_gcm("1.1.2"))
                }
            }
        }
    }

}
