package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxComposeMaterial3Tests {

    @Test
    fun `verify that androidx compose material3 block implementation adds dependencies`() = testEpitDsl(
        "androidx compose material3",
        expectedModuleNames = listOf(
            AndroidX.Compose.Material3.Material3.material3.moduleName,
            AndroidX.Compose.Material3.Material3Adaptive.material3_adaptive.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    material3 {
                        material3("1.0.0") {
                            implementation(Epit.material3)
                            customVersionImplementation(Epit.material3("1.1.2"))
                        }
                        material3Adaptive("1.0.0") {
                            implementation(Epit.material3_adaptive)
                            customVersionImplementation(Epit.material3_adaptive("1.1.2"))
                        }
                    }
                }
            }
        }
    }

}
