package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxPaging {

    @Test
    fun `verify that androidx paging block implementation adds dependencies`() = testEpitDsl(
        "androidx paging",
        expectedModuleNames = listOf(
            AndroidX.Paging.paging_common.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                paging("1.0.0") {
                    implementation(Epit.paging_common)
                    customVersionImplementation(Epit.paging_common("1.1.2"))
                }
            }
        }
    }

}
