package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxTransitionTests {

    @Test
    fun `verify that androidx transition block implementation adds dependencies`() = testEpitDsl(
        "androidx transition",
        expectedModuleNames = listOf(
            AndroidX.Transition.transition.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                transition("1.0.0") {
                    implementation(Epit.transition)
                    customVersionImplementation(Epit.transition("1.1.2"))
                }
            }
        }
    }

}
