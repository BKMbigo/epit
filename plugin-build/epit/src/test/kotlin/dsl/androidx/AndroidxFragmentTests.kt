package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxFragmentTests {

    @Test
    fun `verify that androidx fragment block implementation adds dependencies`() = testEpitDsl(
        "androidx fragment",
        expectedModuleNames = listOf(
            AndroidX.Fragment.fragment.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                fragment("1.0.0") {
                    implementation(Epit.fragment)
                    customVersionImplementation(Epit.fragment("1.1.2"))
                }
            }
        }
    }

}
