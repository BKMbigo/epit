package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxRecyclerViewTests {

    @Test
    fun `verify that androidx recycler view block implementation adds dependencies`() = testEpitDsl(
        "androidx recycler view",
        expectedModuleNames = listOf(
            AndroidX.RecyclerView.recyclerview.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                recyclerview("1.0.0") {
                    implementation(Epit.recyclerview)
                    customVersionImplementation(Epit.recyclerview("1.1.2"))
                }
            }
        }
    }

}
