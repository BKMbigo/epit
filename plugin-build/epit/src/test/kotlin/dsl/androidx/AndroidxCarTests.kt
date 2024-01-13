package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCarTests {

    @Test
    fun `verify that androidx car block implementation adds dependencies`() = testEpitDsl(
        "androidx car",
        expectedModuleNames = listOf(
            AndroidX.Car.App.app.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                car {
                    app("1.0.0") {
                        implementation(Epit.app)
                        customVersionImplementation(Epit.app("1.1.2"))
                    }
                }
            }
        }
    }

}
