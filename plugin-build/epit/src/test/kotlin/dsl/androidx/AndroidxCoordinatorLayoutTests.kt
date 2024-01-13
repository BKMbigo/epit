package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCoordinatorLayoutTests {

    @Test
    fun `verify that androidx coordinator layout block implementation adds dependencies`() = testEpitDsl(
        "androidx coordinator layout",
        expectedModuleNames = listOf(
            AndroidX.CoordinatorLayout.coordinatorlayout.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                coordinatorlayout("1.0.0") {
                    implementation(Epit.coordinatorlayout)
                    customVersionImplementation(Epit.coordinatorlayout("1.1.2"))
                }
            }
        }
    }

}
