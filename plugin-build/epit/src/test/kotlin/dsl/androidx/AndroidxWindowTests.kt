package dsl.androidx

import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxWindowTests {

    @Test
    fun `verify that androidx window block implementation adds dependencies`() = testEpitDsl(
        "androidx window",
        expectedModuleNames = listOf(
            AndroidX.Window.Window.window.moduleName,
            AndroidX.Window.WindowExtensionsCore.core.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                window {
                    window("1.0.0") {
                        implementation(Epit.window)
                        customVersionImplementation(Epit.window("1.1.2"))
                    }
                    windowextensionscore("1.0.0") {
                        implementation(Epit.core)
                        customVersionImplementation(Epit.core("1.1.2"))
                    }
                }
            }
        }
    }

}
