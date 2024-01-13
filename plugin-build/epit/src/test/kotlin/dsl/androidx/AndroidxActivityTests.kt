package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxActivityTests {

    @Test
    fun `verify that androidx activity block implementation adds dependencies`() = testEpitDsl(
        "androidx activity",
        expectedModuleNames = listOf(
            AndroidX.Activity.activity.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                activity("1.0.0") {
                    implementation(Epit.activity)
                    customVersionImplementation(Epit.activity("1.1.2"))
                }
            }
        }
    }

}
