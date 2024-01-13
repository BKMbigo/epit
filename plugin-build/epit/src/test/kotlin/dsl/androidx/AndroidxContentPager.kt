package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxContentPager {

    @Test
    fun `verify that androidx content pager block implementation adds dependencies`() = testEpitDsl(
        "androidx content pager",
        expectedModuleNames = listOf(
            AndroidX.ContentPager.contentpager.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                contentpager("1.0.0") {
                    implementation(Epit.contentpager)
                    customVersionImplementation(Epit.contentpager("1.1.2"))
                }
            }
        }
    }

}
