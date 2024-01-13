package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxComposeMaterialTests {

    @Test
    fun `verify that androidx compose material block implementation adds dependencies`() = testEpitDsl(
        "androidx compose material",
        expectedModuleNames = listOf(
            AndroidX.Compose.Material.material.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                compose {
                    material("1.0.0") {
                        implementation(Epit.material)
                        customVersionImplementation(Epit.material("1.1.2"))
                    }
                }
            }
        }
    }

}
