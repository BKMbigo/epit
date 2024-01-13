package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDataBindingTests {

    @Test
    fun `verify that androidx data binding block implementation adds dependencies`() = testEpitDsl(
        "androidx data binding",
        expectedModuleNames = listOf(
            AndroidX.DataBinding.databinding_adapters.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                databinding("1.0.0") {
                    implementation(Epit.databinding_adapters)
                    customVersionImplementation(Epit.databinding_adapters("1.1.2"))
                }
            }
        }
    }

}
