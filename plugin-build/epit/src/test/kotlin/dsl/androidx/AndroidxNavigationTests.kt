package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxNavigationTests {

    @Test
    fun `verify that androidx navigation block implementation adds dependencies`() = testEpitDsl(
        "androidx navigation",
        expectedModuleNames = listOf(
            AndroidX.Navigation.navigation_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                navigation("1.0.0") {
                    implementation(Epit.navigation_common)
                    customVersionImplementation(Epit.navigation_common("1.1.2"))
                }
            }
        }
    }

}
