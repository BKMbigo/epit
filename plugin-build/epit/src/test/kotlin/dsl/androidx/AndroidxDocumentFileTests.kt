package dsl.androidx

import Epit
import dsl.utils.testEpitDsl
import epit.annotations.ExperimentalEpitApi
import epit.dependencies.AndroidX
import epit.dsl.epitPreview
import org.junit.jupiter.api.Test

class AndroidxDocumentFileTests {

    @Test
    fun `verify that androidx documentFile block implementation adds dependencies`() = testEpitDsl(
        "androidx documentFile",
        expectedModuleNames = listOf(
            AndroidX.DocumentFile.documentfile.moduleName
        )
    ) { implementation, customVersionImplementation ->
        epitPreview {
            @OptIn(ExperimentalEpitApi::class)
            androidx {
                documentfile("1.0.0") {
                    implementation(Epit.documentfile)
                    customVersionImplementation(Epit.documentfile("1.1.2"))
                }
            }
        }
    }

}
