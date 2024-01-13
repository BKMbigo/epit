package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxCursorAdapterTests {

    @Test
    fun `verify that androidx cursor adapter block implementation adds dependencies`() = testEpitDsl(
        "androidx cursor adapter",
        expectedModuleNames = listOf(
            AndroidX.CursorAdapter.cursoradapter.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                cursoradapter("1.0.0") {
                    implementation(Epit.cursoradapter)
                    customVersionImplementation(Epit.cursoradapter("1.1.2"))
                }
            }
        }
    }

}
