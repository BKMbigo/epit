package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDynamicAnimation {

    @Test
    fun `verify that androidx dynamicAnimation block implementation adds dependencies`() = testEpitDsl(
        "androidx dynamicAnimation",
        expectedModuleNames = listOf(
            AndroidX.DynamicAnimation.dynamicanimation.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                dynamicanimation("1.0.0") {
                    implementation(Epit.dynamicanimation)
                    customVersionImplementation(Epit.dynamicanimation("1.1.2"))
                }
            }
        }
    }

}
