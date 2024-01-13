package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxBrowserTests {

    @Test
    fun `verify that androidx browser block implementation adds dependencies`() = testEpitDsl(
        "androidx browser",
        expectedModuleNames = listOf(
            AndroidX.Browser.browser.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                browser("1.0.0") {
                    implementation(Epit.browser)
                    customVersionImplementation(Epit.browser("1.1.2"))
                }
            }
        }
    }

}
