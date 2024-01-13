package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxAppcompatTests {

    @Test
    fun `verify that androidx appcompat block implementation adds dependencies`() = testEpitDsl(
        "androidx appcompat",
        expectedModuleNames = listOf(
            AndroidX.Appcompat.appcompat.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                appcompat("1.0.0") {
                    implementation(Epit.appcompat)
                    customVersionImplementation(Epit.appcompat("1.1.2"))
                }
            }
        }
    }

}
